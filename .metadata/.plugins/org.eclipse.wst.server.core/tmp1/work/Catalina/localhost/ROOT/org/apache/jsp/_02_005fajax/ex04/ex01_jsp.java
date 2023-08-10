/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.76
 * Generated at: 2023-07-21 09:28:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._02_005fajax.ex04;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ex01_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	table{\r\n");
      out.write("		width: 600px; margin-top: 50px         ; border-collapse: collapse;\r\n");
      out.write("	}\r\n");
      out.write("	table, th, td{\r\n");
      out.write("		border: 1px solid green; text-align: center;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write(" $(document).ready(function(){\r\n");
      out.write("   	$(\"#btn\").on(\"click\", function() {\r\n");
      out.write("   		// 클릭을 하면 계속 추가되는 현상을 방지 => 초기화 \r\n");
      out.write("   		$(\"#out\").empty();   		\r\n");
      out.write("		var table = \"<table>\";\r\n");
      out.write("		table += \"<thead><tr><th>이름</th><th>가격</th></tr></thead>\";\r\n");
      out.write("		table += \"<tbody>\";\r\n");
      out.write("		\r\n");
      out.write("		// jQuery에서 (xml, html, txt) 가져오는 메서드 : .get()\r\n");
      out.write("		// jQuery에서 (json) 가져오는 메서드 : .getJSON()\r\n");
      out.write("		$.get(\"data01.xml\", function(data) {\r\n");
      out.write("			// console.log(data);\r\n");
      out.write("			// 태그 찾는 방법 : js      => getElementsByTagName(\"태그이름\");\r\n");
      out.write("			//               jQuery  => find(\"태그이름\")\r\n");
      out.write("			\r\n");
      out.write("			// 반복문 : js => for문, for in문\r\n");
      out.write("			//         jQuery  => each()\r\n");
      out.write("			\r\n");
      out.write("			// 받아온 data에서 product 태그를 찾아라 \r\n");
      out.write("			// 여러개이므로 반복문을 실행하자 \r\n");
      out.write("			$(data).find(\"product\").each(function() {\r\n");
      out.write("				var name = $(this).find(\"name\").text();\r\n");
      out.write("				var price = $(this).find(\"price\").text();\r\n");
      out.write("				table += \"<tr>\";\r\n");
      out.write("				table +=  \"<td>\"+name+\"</td>\";\r\n");
      out.write("				table +=  \"<td>\"+price+\"</td>\";\r\n");
      out.write("				table += \"</tr>\";\r\n");
      out.write("			});\r\n");
      out.write("			table += \"</tbody></table>\";\r\n");
      out.write("			$(\"#out\").append(table);\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("	});\r\n");
      out.write("  });\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div id=\"btn\">가져오기</div>\r\n");
      out.write("	<div id=\"out\"></div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
