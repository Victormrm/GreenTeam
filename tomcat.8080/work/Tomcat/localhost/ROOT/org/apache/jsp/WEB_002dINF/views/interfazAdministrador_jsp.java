/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2019-02-14 16:11:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class interfazAdministrador_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" http-equiv=\"Content-Type\"\n");
      out.write("\tcontent=\"text/html,width=device-width, initial-scale=1, shrink-to-fit=no \">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<script \n");
      out.write("\tsrc=\"http://1000hz.github.io/bootstrap-validator/dist/validator.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("\n");
      out.write(".historial-container {\n");
      out.write("\tmargin-top: 5%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".gestion-div{\n");
      out.write("\tbox-shadow: 0 5px 8px 0 rgba(0, 0, 0, 0.2), 0 9px 26px 0\n");
      out.write("\t\trgba(0, 0, 0, 0.19);\n");
      out.write("\tpadding-bottom: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".historial-div {\n");
      out.write("\tbox-shadow: 0 5px 8px 0 rgba(0, 0, 0, 0.2), 0 9px 26px 0\n");
      out.write("\t\trgba(0, 0, 0, 0.19);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".historial-div h2 {\n");
      out.write("\tcolor: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".btnUsuario {\n");
      out.write("\twidth: 50%;\n");
      out.write("\tborder-radius: 2rem;\n");
      out.write("\tpadding: 0%;\n");
      out.write("\tborder: solid;\n");
      out.write("\tcursor: pointer;\n");
      out.write("\tmargin-bottom: 5px;\n");
      out.write("\tfont-weight: 600;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tbackground-color: #0062cc;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btnFichajes {\n");
      out.write("\tborder-radius: 2rem;\n");
      out.write("\tborder: solid;\n");
      out.write("\tcursor: pointer;\n");
      out.write("\tfont-weight: 600;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tbackground-color: #0062cc;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-xl {\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    font-size: 20px;\n");
      out.write("    border-radius: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".btn-space {\n");
      out.write("    margin-right: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-verticalspace{\n");
      out.write("\tmargin-bottom:30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".centerdiv {\n");
      out.write("  display: flex;\n");
      out.write("  justify-content: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".inlinediv{\n");
      out.write("float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btnAbrir{\n");
      out.write("    font-size: 20px;\n");
      out.write("    border-radius: 10px;\n");
      out.write("margin-bottom:30px;\n");
      out.write("margin-right: 10px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btnCerrar{\n");
      out.write("    font-size: 20px;\n");
      out.write("    border-radius: 10px;\n");
      out.write("margin-bottom:30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btnListar{\n");
      out.write(" width: 150px;\n");
      out.write(" padding: 10px 10px;\n");
      out.write("    font-size: 15px;\n");
      out.write("    border-radius: 15px;\n");
      out.write("margin-bottom:10px;\t\n");
      out.write("}\n");
      out.write("\n");
      out.write(".logo{\n");
      out.write("\n");
      out.write("width:180px;\n");
      out.write("height:180px\n");
      out.write("}\n");
      out.write("\n");
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
      out.write("\t\t\t<div class=\"nav-item pull-left fixed-top\"\n");
      out.write("\t\t\t\tstyle=\"position: relative; top: 8px\">\n");
      out.write("\t\t\t\t<form action=\"adminUpdatePwd\" method=\"GET\">\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-space\" type=\"submit\">\n");
      out.write("\t\t\t\t\t\t<strong><span class=\"glyphicon glyphicon-copy\"></span>\n");
      out.write("\t\t\t\t\t\t\tModificar Contrase&ntilde;a</strong>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"nav-item pull-right fixed-top\"\n");
      out.write("\t\t\t\tstyle=\"position: relative; top: 8px\">\n");
      out.write("\t\t\t\t<form action=\"logout\" method=\"GET\">\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-danger\" type=\"submit\">\n");
      out.write("\t\t\t\t\t\t<strong><span class=\"glyphicon glyphicon-log-out\"></span>Salir</strong>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\n");
      out.write("\t<center>\n");
      out.write("\t\t<br /> <img src=\"https://i.imgur.com/bwlSMSI.png\" style=\"width: %;\">\n");
      out.write("\t\t<br />\n");
      out.write("\t</center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-5 col-md-offset-4\">\n");
      out.write("\t\t\t\t<div class=\"inlinediv\" >\n");
      out.write("\t\t\t\t\t<form action=\"abrirFichajeGeneral\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" id=\"btnAbrir\" class=\"btn btn-primary btnAbrir btnFichajes\" value=\"Abrir Fichaje\">Abrir Fichaje</button>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div >\n");
      out.write("\t\t\t\t\t<form action=\"cerrarFichajeGeneral\" method=\"post\">\n");
      out.write("\t\t\t\t\t<input name=\"idFichajeAbierto\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${seleccionadoFichaje.get_id()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" id=\"btnCerrar\" class=\"btn btn-primary btnCerrar btnFichajes\" value=\"Cerrar Fichaje\">Cerrar Fichaje</button>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"container centerdiv col-md-6 col-md-offset-3\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<span style=\"color:red\"><em>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMessageCerrar}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</em></span>\n");
      out.write("\t\t\t\t<span style=\"color:red\"><em>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMessageAbrir}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</em></span>\n");
      out.write("\t\t\t\t<span style=\"color: green\"><em>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alertaFichaje}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</em></span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<div class=\"container col-md-12\" style=\"margin-top: 5%;\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"historial-div collapse.in col-md-5 col-md-offset-1\" id=\"panelFichajes\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-edit\"></span> Listar Fichajes\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</h2>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<form id=\"formListar\" action=\"consultaFichajesFechaGeneral\" method=\"get\" data-toggle=\"validator\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<fieldset class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label>Introduzca primera fecha del periodo de fichajes:<br></label> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input placeholder=\"yyyy-MM-dd\" type=\"text\" name=\"fecha1\" id=\"fecha1\" data-error=\"Formato de fecha err&oacute;neo\" pattern=\"([0-9]{4}-(0[1-9]|1[012])-(0[1-9]|1[0-9]|2[0-9]|3[01])\" required>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"help-block with-errors\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label>Introduzca segunda fecha del periodo de fichajes:<br></label> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input placeholder=\"yyyy-MM-dd\" type=\"text\" name=\"fecha2\" id=\"fecha2\" data-error=\"Formato de fecha err&oacute;neo\" pattern=\"([0-9]{4}-(0[1-9]|1[012])-(0[1-9]|1[0-9]|2[0-9]|3[01])\" required>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"help-block with-errors\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button id=\"btnListar\" class=\"btn btn-primary btnListar btnUsuario\" type=\"submit\" data-toggle=\"collapse.in\" data-target=\"#panelFichajes\" aria-expanded=\"false\" aria-controls=\"panelFichajes\">Listar Fichajes</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"color: red\"><em>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nullFecha}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</em></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table class=\"table table-bordered\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<thead class=\"thead\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">Fecha</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">Entrada</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">Salida</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">Estado</th>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"gestion-div col-md-4 col-md-offset-1\">\n");
      out.write("\t\t\t\t\t\t\t\t<h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\" glyphicon glyphicon-asterisk\"></span> Gesti&oacuten de usuarios\n");
      out.write("\t\t\t\t\t\t\t\t</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<form method = \"get\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"text-center\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"btnUsuario input-lg\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"crearUsuario\" value=\"Crear usuario\" formaction = \"interfazCrearUsuario\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"btnUsuario input-lg\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"modificarUsuario\" value=\"Modificar usuario\" formaction = \"modificarUsuario\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"btnUsuario input-lg\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"eliminarUsuario\" value=\"Eliminar usuario\" formaction = \"interfazEliminarUsuario\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"btnUsuario input-lg\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"crearIncidencia\" value=\"Crear incidencia\" formaction = \"RECrearIncidencia\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"btnUsuario input-lg\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"modificarIncidencia\" value=\"Modificar incidencia\" formaction = \"listarIncidencias\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"btnUsuario input-lg\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"eliminarIncidencia\" value=\"Eliminar incidencia\" formaction = \"listarIncidenciasEliminar\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\n");
      out.write("\t\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/interfazAdministrador.jsp(225,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/interfazAdministrador.jsp(225,12) '${listafichajes}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${listafichajes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/interfazAdministrador.jsp(225,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("fichaje");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fichaje.fechaFichaje}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fichaje.horaEntrada}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fichaje.horaSalida}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td onload=\"switchState();\" id=\"tdState\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fichaje.estado}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}