package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changePass_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Change Password</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write(" <script>\n");
      out.write("            function checkPasswordMatch() {\n");
      out.write("                var newPassword = document.getElementById(\"new_password\").value;\n");
      out.write("                var confirmNewPassword = document.getElementById(\"confirm_password\").value;\n");
      out.write("                var errorElement = document.getElementById(\"error_message\");\n");
      out.write("\n");
      out.write("                if (newPassword !== confirmNewPassword) {\n");
      out.write("                    errorElement.innerHTML = \"New Password and Confirm New Password do not match!\";\n");
      out.write("                } else {\n");
      out.write("                    errorElement.innerHTML = \"\"; // Clear the error message if passwords match\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // Attach the checkPasswordMatch function to the \"input\" event of the \"confirm_password\" field\n");
      out.write("            document.getElementById(\"confirm_password\").addEventListener(\"input\", checkPasswordMatch);\n");
      out.write("        </script>\n");
      out.write("        <h2>Change Password</h2>\n");
      out.write("        <form action=\"changepass\" method=\"post\" onkeyup=\"checkPasswordMatch();\">\n");
      out.write("            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty requestScope.ERROR_MASSEGE}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                <!-- Error MSG -->\n");
      out.write("                <div class=\"alert alert-danger\" role=\"alert\" style=\"color: red\">\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.ERROR_MASSEGE}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </c:if>\n");
      out.write("            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty requestScope.MSG_SUCCESS}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                <!-- Error MSG -->\n");
      out.write("                <div class=\"alert alert-success\" role=\"alert\">\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.MSG_SUCCESS}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </c:if>\n");
      out.write("            <label for=\"new_password\">New Password:</label>\n");
      out.write("            <input type=\"password\" id=\"new_password\" name=\"new_password\" required><br><br>\n");
      out.write("            <input type=\"email\"  name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly ><br><br>\n");
      out.write("\n");
      out.write("            <label for=\"confirm_password\">Confirm New Password:</label>\n");
      out.write("            <input type=\"password\" id=\"confirm_password\" name=\"repass\" required><br><br>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"Change Password\">\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
