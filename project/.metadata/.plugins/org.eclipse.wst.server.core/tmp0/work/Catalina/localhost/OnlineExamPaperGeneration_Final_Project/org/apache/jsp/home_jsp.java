/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.54
 * Generated at: 2022-05-17 11:55:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/headerHome.jsp", Long.valueOf(1651940606000L));
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Automatic generation of Examination Papers</title>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"keywords\" content=\"\">\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"wrap\">\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <img src=\"images/logo.png\" alt=\"logo\">\r\n");
      out.write("            <div id=\"success\">\r\n");
      out.write("            	<h3>");
      out.print("Welcome: " + session.getAttribute("Name"));
      out.write("</h3>\r\n");
      out.write("            	<p><form action=\"UserController\" method=\"post\">\r\n");
      out.write("            		<input type=\"hidden\" name=\"actionRequest\" value=\"logout\">\r\n");
      out.write("            		<input type=\"submit\" value=\"Logout\">\r\n");
      out.write("            	</form>\r\n");
      out.write("            	</p>\r\n");
      out.write("            </div>\r\n");
      out.write("             <div class=\"clear\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"slide\">\r\n");
      out.write("            <img src=\"images/slid.jpg\" alt=\"slide\">\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"nav\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                    <li><a href=\"home.jsp\">HOME</a></li>\r\n");
      out.write("                    <li><a href=\"#\">ABOUT US</a></li>\r\n");
      out.write("                    <li><a href=\"#\">CONTACT US</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <div class=\"clear\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("			<div class=\"left-side\">\r\n");
      out.write("				<div class=\"heading\">\r\n");
      out.write("					<h5>Menu</h5>\r\n");
      out.write("				</div>\r\n");
      out.write("				<ul>\r\n");
      out.write("\r\n");
      out.write("					<li><span>&#9733;</span><a href=\"addQuestion.jsp\">Add\r\n");
      out.write("							Question</a></li>\r\n");
      out.write("					<li><span>&#9733;</span><a href=\"createPaper.jsp\">Generate\r\n");
      out.write("							Question paper</a></li>\r\n");
      out.write("					<li><span>&#9733;</span><a href=\"showQuestion.jsp\">Show\r\n");
      out.write("							Questions</a></li>\r\n");
      out.write("\r\n");
      out.write("					<li><a href=\"index.jsp\"><button>Logout</button></a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"box2\">\r\n");
      out.write("				<h3>Examination Papers:</h3>\r\n");
      out.write("				<p>Traditionally, composing examination papers is done manually\r\n");
      out.write("					by using the writersâ knowledge, experience and style. Despite the\r\n");
      out.write("					high credit of the questions, there are still some shortcomings.\r\n");
      out.write("					The main problem is a low quality of papers caused by some human\r\n");
      out.write("					factors such as instability and relatively narrow range of\r\n");
      out.write("					topics.Teachers need to spend a lot of time and energy in composing\r\n");
      out.write("					examination papers. This does nothing for the separation of\r\n");
      out.write("					teaching and testing. Therefore, with the use of computers,\r\n");
      out.write("					automatic generation of test papers is an important measure for\r\n");
      out.write("					achieving the separation of teaching.</p>\r\n");
      out.write("				<p>To solve there are two major approaches to automatic\r\n");
      out.write("					generation of examination papers as follows:</p>\r\n");
      out.write("				<p>1) Using dynamic, structured and intelligent database for\r\n");
      out.write("					generating data and questions .The generation data and questions\r\n");
      out.write("					automatically will satisfy a given set of constraints like model,\r\n");
      out.write("					difficulty, uniqueness etc.</p>\r\n");
      out.write("				<p>2) The second approach deals with generating questions from\r\n");
      out.write("					natural language texts. Currently there is a tremendous interest in\r\n");
      out.write("					this direction. However, this is beyond the scope of this project.</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<div class=\"clear\"></div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"footer\">\r\n");
      out.write("			<h4>Copyright 2021. All Rights Reserved. Designed And Developed\r\n");
      out.write("				By JTC.</h4>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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