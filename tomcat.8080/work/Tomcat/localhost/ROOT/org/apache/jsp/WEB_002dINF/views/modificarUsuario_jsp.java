/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2019-02-18 16:56:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modificarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("file:/C:/Users/Alarcos/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar", Long.valueOf(1549965009462L));
    _jspx_dependants.put("jar:file:/C:/Users/Alarcos/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153377882000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Modificacion de Usuario</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("  href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<script \n");
      out.write("  src=\"http://1000hz.github.io/bootstrap-validator/dist/validator.min.js\"></script>\n");
      out.write("<style>\n");
      out.write(".modificacion-container {\n");
      out.write("    margin-left: 5%;\n");
      out.write("\tmargin-bottom: 5%;\n");
      out.write("\tbox-shadow: 5px 5px 8px 0 rgba(0, 0, 0, 0.2), 0 9px 26px 0\n");
      out.write("\t\trgba(0, 0, 0, 0.19);\n");
      out.write("}\n");
      out.write(".modificacion-container h2{\n");
      out.write("\tpadding: 0% 0% 0% 5%;\n");
      out.write("}\n");
      out.write(".busqueda-container {\n");
      out.write("    margin-left: 5%;\n");
      out.write("\tmargin-bottom: 5%;\n");
      out.write("\tbox-shadow: 5px 5px 8px 0 rgba(0, 0, 0, 0.2), 0 9px 26px 0\n");
      out.write("\t\trgba(0, 0, 0, 0.19);\n");
      out.write("}\n");
      out.write(".busqueda-container h2{\n");
      out.write("\tpadding: 0% 0% 0% 5%;\n");
      out.write("}\n");
      out.write(".gestion-form {\n");
      out.write("\tpadding: 0% 5% 0% 5%;\n");
      out.write("}\n");
      out.write(".gestion-form h3 {\n");
      out.write("\ttext-align: left;\n");
      out.write("\tcolor: #333;\n");
      out.write("\ttext-align: left;\n");
      out.write("\tfont-size: 17px;\n");
      out.write("}\n");
      out.write(".botones-form {\n");
      out.write("\tpadding: 5% 0% 5% 0%;\n");
      out.write("}\n");
      out.write(".botones-form .btnModUsuario {\n");
      out.write("\tfont-weight: 600;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tbackground-color: #0062cc;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<nav class=\"navbar navbar-inverse\" style=\"background-color: #337ab7;\">\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"#\"></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("      \n");
      out.write("\t\t\t<div class=\"nav-item pull-left col-md-1 fixed-top\" style=\"position: relative; top: 8px\">\n");
      out.write("\t\t\t\t<form action=\"REfichajesAdminNav\" method=\"GET\"> <button class=\"btn\" type=\"submit\"><strong><span class=\"glyphicon glyphicon-sort\"></span> Fichajes</strong></button></form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-1 pull-right fixed-top\" style=\"position: relative; top: 8px\">\n");
      out.write("\t\t\t\t<form action=\"logout\" method=\"GET\"> <button class=\"btn btn-danger\" type=\"submit\"><strong><span class=\"glyphicon glyphicon-log-out\"></span>Salir</strong></button></form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div class=\"container busqueda-container col-md-4\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<h2>\n");
      out.write("\t\t\t\t<span class=\"glyphicon glyphicon-search\"></span> B&uacutesqueda de usuario\n");
      out.write("\t\t\t</h2>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"gestion-form left-div\">\n");
      out.write("\t\t\t\t<form id=\"busquedaUsuario\" action=\"buscarUsuarioPorDni\"  data-toggle=\"validator\" method=get >\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<h3>DNI del usuario</h3>\n");
      out.write("\t\t\t\t\t\t\t<input name=\"txtDniBusqueda\" type=\"text\" class=\"form-control\" \n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"00000000A\" maxlength=\"9\" data-error=\"Formato del DNI inv&aacute;lido\"pattern=\"(([X-Z]{1})([-]?)(\\d{7})([-]?)([A-Z]{1}))|((\\d{8})([-]?)([A-Z]{1}))\" value=\"\" required/>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"help-block with-errors\"></div>\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"botones-form text-right\" style=\"margin: auto;\">\n");
      out.write("\t\t\t\t\t\t    \t<input type=\"submit\" class=\"btnBusquedaUsuario input-lg\"\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"Buscar\" value=\"B&uacute;squeda\"/>\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\t<div class=\"container modificacion-container col-md-6\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t<h2>\n");
      out.write("\t\t\t\t<span class=\"glyphicon glyphicon-pencil\"></span> Modificaci&oacuten Usuario\n");
      out.write("\t\t\t</h2>\n");
      out.write("\t\t\t<form id=\"ModificacionUsuario\" action=\"modificarUser\"  data-toggle=\"validator\" method=get >\n");
      out.write("\t\t\t\n");
      out.write("        \t\t \t<div class=\"form-group\">\n");
      out.write("    \t\t\t\t<h3>DNI del usuario</h3>\n");
      out.write("\t\t\t\t\t\t<input id=\"DNIUsuario\" type=\"text\" disabled class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t       placeholder=\"DNI Usuario\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dniUser}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("      \n");
      out.write("        \t\t<div class=\"form-group\">\n");
      out.write("  \t\t\t\t\t<h3>Nombre del Usuario</h3>\n");
      out.write("\t\t\t\t\t\t<input id=\"NombreUsuario\" type=\"text\" disabled class=\"form-control\" placeholder=\"Nombre Usuario\"\n");
      out.write("\t\t\t\t\t\t value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nombreUser}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\n");
      out.write("\t\t\t\t \t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<h3>E-mail del usuario</h3>\n");
      out.write("\t\t\t\t\t\t\t<input name=\"txtUsuarioEmail\" type=\"email\" class=\"form-control\" \n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"usuario@ejemplo.com\" data-error=\"Direcci&oacute;n de correo inv&aacute;lida\" value=\"\" required/>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"help-block with-errors\"></div>\n");
      out.write("\t\t\t\t\t\t\t<label>E-mail actual: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${EmailUsuario}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" </label>\n");
      out.write("\t\t\t\t \t</div>\n");
      out.write("\t\t\t\t \t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t    <h3>Rol del usuario</h3> \n");
      out.write("\t\t\t\t\t\t    <select name = \"listaRoles\">\n");
      out.write("\t\t\t\t\t\t    \t<option value = \"Empleado\"> Empleado </option>\n");
      out.write("\t\t\t\t\t\t    \t<option value = \"Gestor de incidencias\"> Gestor de incidencias </option>\n");
      out.write("\t\t\t\t\t\t    </select>\n");
      out.write("\t\t\t\t\t\t    <label>Rol de usuario actual: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${RolUsuario}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" </label>\n");
      out.write("\t\t\t\t\t\t    \t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"botones-form text-right\" style=\"margin: auto;\">\n");
      out.write("\t\t\t\t\t\t    \t<input type=\"submit\" class=\"btnModUsuario input-lg\"\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"Aceptar\" value=\"Aceptar\" />\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}