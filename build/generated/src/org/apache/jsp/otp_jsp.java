package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class otp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Enter OTP</title>\n");
      out.write("        <style>\n");
      out.write("            /* Add some CSS for styling the countdown timer */\n");
      out.write("            #countdown {\n");
      out.write("                font-size: 24px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Enter OTP</h1>\n");
      out.write("        <p>Please enter the OTP sent to your email address.</p>\n");
      out.write("        <div id=\"countdown\">60</div>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            // JavaScript to create the countdown timer\n");
      out.write("            var countdown = 60; // Set the initial countdown time in seconds\n");
      out.write("            var countdownDisplay = document.getElementById(\"countdown\");\n");
      out.write("\n");
      out.write("            function updateCountdown() {\n");
      out.write("                countdown -= 1;\n");
      out.write("                countdownDisplay.textContent = countdown;\n");
      out.write("\n");
      out.write("                if (countdown <= 0) {\n");
      out.write("                    countdownDisplay.textContent = \"OTP had expired \";\n");
      out.write("                    clearInterval(interval);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // Update the countdown every 1000 milliseconds (1 second)\n");
      out.write("            var interval = setInterval(updateCountdown, 1000);\n");
      out.write("        </script>\n");
      out.write("        <form action=\"forget\" method=\"get\">\n");
      out.write("            <label for=\"otp\">OTP:</label>\n");
      out.write("\n");
      out.write("            <input type=\"text\" id=\"otp\" name=\"otp\" required>\n");
      out.write("            <input type=\"text\" id=\"email\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("            <br><br>\n");
      out.write("\n");
      out.write("            <button type=\"submit\">Verify OTP</button>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
