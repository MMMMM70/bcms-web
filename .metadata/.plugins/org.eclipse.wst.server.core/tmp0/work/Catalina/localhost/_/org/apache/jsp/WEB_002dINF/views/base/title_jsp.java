/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.82
 * Generated at: 2018-08-24 16:02:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.base;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class title_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<link href=\"/resources/dist/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/resources/dist/css/css/normalize.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/resources/dist/css/css/default.css\">\r\n");
      out.write("\t\t<link href=\"/resources/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/resources/dist/css/ui.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\t\t<script src=\"./resources/dist/js/jquery-ui.js\"></script>\r\n");
      out.write("\t\t<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"/resources/dist/js/selectize/selectize.js\"></script>\r\n");
      out.write("\t\t<script src=\"/resources/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\tfunction logout() {\r\n");
      out.write("\t\t\t\talert(\"로그아웃\");\r\n");
      out.write("\t\t\t\tlocation.href=\"/logout.do\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction nmeCardLogo() {\r\n");
      out.write("\t\t\t\tlocation.href=\"/nmeCardSelectForm.do\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction recvNmeCard() {\r\n");
      out.write("\t\t\t\tlocation.href=\"/recvNmeCardSelectForm.do\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction sharNmeCardSelectForm(){\r\n");
      out.write("\t\t\t\tlocation.href=\"/sharNmeCardSelectForm.do\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction nmeCardSelectForm(){\r\n");
      out.write("\t\t\t\tlocation.href=\"/nmeCardSelectForm.do\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction nmeCardBinSelectForm(){\r\n");
      out.write("\t\t\t\tlocation.href=\"/nmeCardBinSelectForm.do\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction groupListForm(){\r\n");
      out.write("\t\t\t\tlocation.href=\"/groupListForm.do\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction memSelectViewForm(){\r\n");
      out.write("\t\t\t\tlocation.href=\"/memSelectViewForm.do\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction recvNmeCardBinSelectForm(){\r\n");
      out.write("\t\t\t\tlocation.href=\"/recvNmeCardBinSelectForm.do\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction sharNmeCardBinSelectForm(){\r\n");
      out.write("\t\t\t\tlocation.href=\"/sharNmeCardBinSelectForm.do\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div align=\"center\" style=\"margin-top:15px;\">\r\n");
      out.write("\t\t   <a href=\"javascript:nmeCardLogo()\"><img src=\"resources/img/BCMS.png\"  id=\"logo\"></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"navbar-wrapper\">\r\n");
      out.write("\t\t\t<nav class=\"navbar navbar-inverse navbar-static-top\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"navbar-brand\" href=\"#\"><font style=\"font-size:13pt; font-weight:bold; font-family:Times New Roman;\">BCMS</font></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"navbar\" class=\"navbar-collapse\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav\" style=\"margin-top:6px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"btn-group\" role=\"group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\"><font style=\"font-size:13pt; font-weight:bold;\">【명함관리】</font></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\" role=\"menu\" style=\"text-align:left;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"javascript:nmeCardSelectForm()\">- 나의 명함 리스트</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"javascript:sharNmeCardSelectForm()\">- 공유 명함 리스트</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"javascript:recvNmeCard();\">- 받은 명함 리스트</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"btn-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" onclick=\"javascript:groupListForm()\"><font style=\"font-size:13pt; font-weight:bold;\">【그룹관리】</font></button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"btn-group\" role=\"group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\"><font style=\"font-size:13pt; font-weight:bold;\">【휴지통】</font></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\" role=\"menu\" style=\"text-align:left;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"javascript:nmeCardBinSelectForm()\">- 나의 명함 리스트 휴지통</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"javascript:sharNmeCardBinSelectForm()\">- 공유 명함 리스트 휴지통</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"javascript:recvNmeCardBinSelectForm()\">- 받은 명함 리스트 휴지통</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a><font style=\"font-size:13pt;\"><b style=\"color:white\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.memNme}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b>님 환영합니다.</font></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"javascript:memSelectViewForm();\"><font style=\"font-size:13pt; font-weight:bold;\">【정보관리】</font></a></li>\r\n");
      out.write("\t\t\t\t\t        <li><a href=\"javascript:logout();\"><font style=\"font-size:13pt; font-weight:bold;\">【로그아웃】</font></a></li>\r\n");
      out.write("\t\t\t\t        </ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t</div>\t\t\r\n");
      out.write("\t</body>\r\n");
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
