package org.apache.jsp.components;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<nav class=\"navbar navbar-expand-lg navbar-light px-4 px-lg-5 py-3 py-lg-0\">\r\n");
      out.write("    <a href=\"\" class=\"navbar-brand p-0\">\r\n");
      out.write("        <a href =\"home\"><h1 class=\"text-primary m-0\" ><i class=\"fa fa-map-marker-alt me-3\"></i>Volunteer</h1></a>\r\n");
      out.write("        <!-- <img src=\"img/logo.png\" alt=\"Logo\"> -->\r\n");
      out.write("    </a>\r\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\r\n");
      out.write("        <span class=\"fa fa-bars\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\r\n");
      out.write("        <div class=\"navbar-nav ms-auto py-0\">\r\n");
      out.write("            <a href=\"home\" class=\"nav-item nav-link active\">Home</a>\r\n");
      out.write("            <a href=\"about.html\" class=\"nav-item nav-link\">About</a>\r\n");
      out.write("            <a href=\"service.html\" class=\"nav-item nav-link\">Services</a>\r\n");
      out.write("            <a href=\"package.html\" class=\"nav-item nav-link\">Packages</a>\r\n");
      out.write("            <div class=\"nav-item dropdown\"> \r\n");
      out.write("                <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">Pages</a>\r\n");
      out.write("                <div class=\"dropdown-menu m-0\">\r\n");
      out.write("                    <a href=\"destination.html\" class=\"dropdown-item\">Destination</a>\r\n");
      out.write("                    <a href=\"booking.html\" class=\"dropdown-item\">Booking</a>\r\n");
      out.write("                    <a href=\"team.html\" class=\"dropdown-item\">Travel Guides</a>\r\n");
      out.write("                    <a href=\"testimonial.html\" class=\"dropdown-item\">Testimonial</a>\r\n");
      out.write("                    <a href=\"404.html\" class=\"dropdown-item\">404 Page</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <a href=\"donation.jsp\" class=\"nav-item nav-link\">Donation</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <c:choose>\r\n");
      out.write("            <c:when test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.LOGIN_USER == null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a href=\"login.jsp\"><i class=\"fa fa-user\"></i></a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </c:when>\r\n");
      out.write("            <c:otherwise>\r\n");
      out.write("                <div class=\"nav-item dropdown\"> \r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" data-bs-toggle=\"dropdown\">\r\n");
      out.write("                        <i class=\"fa fa-user\"></i> \r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div class=\"dropdown-menu m-0\">\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"../changePass.jsp\">Change Password</a>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"./Profile.jsp\">View Profile</a>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Edit Profile</a>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"logout\">Log Out</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </c:otherwise>\r\n");
      out.write("        </c:choose>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>");
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
