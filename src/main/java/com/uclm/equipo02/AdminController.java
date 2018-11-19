package com.uclm.equipo02;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.uclm.equipo02.mail.MailSender;
import com.uclm.equipo02.modelo.Usuario;
import com.uclm.equipo02.persistencia.UsuarioDaoImplement;

@Controller
public class AdminController {
	//private final String usuario_login = "login";
	UsuarioDaoImplement userDao = new UsuarioDaoImplement();
	Usuario user = new Usuario();
	private final String alert = "alerta";

	//private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

	@RequestMapping(value = "/crearUsuario", method = RequestMethod.POST)
	public String crearUsuario(HttpServletRequest request, Model model) throws Exception {

		String mail = request.getParameter("txtUsuarioEmail");
		String nombre = request.getParameter("txtUsuarioNombre");
		String rol = request.getParameter("listaRoles");
		String pass = passRandom();
		if (mail.equals("") || nombre.equals("") || rol.equals("")) {
			//model.addAttribute(alert, "Por favor rellene los campos");

		}
		//UsuarioDaoImplement userDao = new UsuarioDaoImplement();
		Usuario user = new Usuario();
		user.setNombre(nombre);
		user.setPassword(pass);
		user.setEmail(mail);
		user.setRol(rol);

		try {
			userDao.insert(user);
		} catch (Exception e) {

		}

		String destinatario =  "alguien@servidor.com"; //A quien le quieres escribir.
		String asunto = "Contraseña por defecto";
		String cuerpo = "Hola " + nombre + "! \nLa contraseña por defecto es la siguiente:\n" + pass
				+"\n\nUn Saludo\nInTime Corporation";

		MailSender mailSender = new MailSender();
		mailSender.enviarConGMail(mail, asunto, cuerpo);

		return "interfazAdministrador";
	}

	public String passRandom() {
		char[] elementos={'0','1','2','3','4','5','6','7','8','9' ,
				'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
				'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

		char[] conjunto = new char[10];
		String pass;

		for(int i=0;i<10;i++){
			int el = (int)(Math.random()*62);
			conjunto[i] = (char)elementos[el];
		}
		return pass = new String(conjunto);
	}
	
	@RequestMapping(value = "/fichajesAdmin", method = RequestMethod.GET)
	public ModelAndView interfazFichajesAdmin() {
		return new ModelAndView("interfazAdministrador");
	}

	@RequestMapping(value = "/interfazCrearUsuario", method = RequestMethod.GET)
	public ModelAndView interfazCrearUsuario() {
		return new ModelAndView("interfazCrearUsuario");
	}
	@RequestMapping(value = "/interfazEliminarUsuario", method = RequestMethod.GET)
	public ModelAndView interfazEliminarUsuario() {
		return new ModelAndView("interfazEliminarUsuario");
	}
	@RequestMapping(value = "/modificarUsuario", method = RequestMethod.GET)
	public ModelAndView modificarUsuario() {
		return new ModelAndView("modificarUsuario");
	}

	@RequestMapping(value = "/eliminarUsuario", method = RequestMethod.POST)
	public String eliminarUsuario(HttpServletRequest request, Model model) throws Exception {

		String email = request.getParameter("txtUsuarioEmail");

		if (email.equals("")){
			model.addAttribute(alert, "Por favor rellene los campos");
			return "interfazEliminarUsuario";
		}else {
			Usuario user = new Usuario();
			user.setEmail(email);
			try {

				user.setNombre(userDao.devolverUser(user));
				userDao.delete(user);
			}catch(Exception e) {

			}

			return "interfazAdministrador";
		}
	}

	@RequestMapping(value = "/buscarUsuarioPorEmail", method = RequestMethod.GET)
	public String buscarUsuario(HttpServletRequest request, Model model) throws Exception {

		String email = request.getParameter("txtEmail");
		//Usuario user = new Usuario();
		user.setEmail(email);

		user.setNombre(userDao.devolverUser(user));
		user.setRol(userDao.devolverRol(user));

		model.addAttribute("NombreUsuario", user.getNombre());
		model.addAttribute("RolUsuario", user.getRol());


		return "modificarUsuario";

	}
	@RequestMapping(value = "/modificarUser", method = RequestMethod.GET)
	public String modificarUser(HttpServletRequest request, Model model) throws Exception {

		String nombre = request.getParameter("txtNombre");
		String rol = request.getParameter("listaRoles");

		try {
			
			userDao.updateNombre(user, nombre);
			userDao.updateRol(user, rol);
		}catch(Exception e) {

		}

		return "interfazAdministrador";

	}
}
