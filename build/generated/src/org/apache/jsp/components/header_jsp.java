package org.apache.jsp.components;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <title>Vounteer</title>\r\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("        <meta content=\"\" name=\"keywords\">\r\n");
      out.write("        <meta content=\"\" name=\"description\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Favicon -->\r\n");
      out.write("        <link href=\"../img/favicon.ico\" rel=\"icon\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Google Web Fonts -->\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("        <link\r\n");
      out.write("            href=\"https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600&family=Nunito:wght@600;700;800&display=swap\"\r\n");
      out.write("            rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\"\r\n");
      out.write("              href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\">\r\n");
      out.write("        <!-- Icon Font Stylesheet -->\r\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\"\r\n");
      out.write("              rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\"\r\n");
      out.write("              rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <link href=\"../lib/animate/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Template Stylesheet -->\r\n");
      out.write("        <link href=\"../css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Spinner Start -->\r\n");
      out.write("        <div id=\"spinner\"\r\n");
      out.write("             class=\"show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center\">\r\n");
      out.write("            <div class=\"spinner-border text-primary\" style=\"width: 3rem; height: 3rem;\" role=\"status\">\r\n");
      out.write("                <span class=\"sr-only\">Loading...</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Spinner End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Topbar Start -->\r\n");
      out.write("        <div class=\"container-fluid bg-dark px-5 d-none d-lg-block\">\r\n");
      out.write("            <div class=\"row gx-0\">\r\n");
      out.write("                <div class=\"col-lg-8 text-center text-lg-start mb-2 mb-lg-0\">\r\n");
      out.write("                    <div class=\"d-inline-flex align-items-center\" style=\"height: 45px;\">\r\n");
      out.write("                        <small class=\"me-3 text-light\"><i class=\"fa fa-map-marker-alt me-2\"></i>123 Street, New\r\n");
      out.write("                            York, USA</small>\r\n");
      out.write("                        <small class=\"me-3 text-light\"><i class=\"fa fa-phone-alt me-2\"></i>+012 345 6789</small>\r\n");
      out.write("                        <small class=\"text-light\"><i\r\n");
      out.write("                                class=\"fa fa-envelope-open me-2\"></i>info@example.com</small>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4 text-center text-lg-end\">\r\n");
      out.write("                    <div class=\"d-inline-flex align-items-center\" style=\"height: 45px;\">\r\n");
      out.write("                        <a class=\"btn btn-sm btn-outline-light btn-sm-square rounded-circle me-2\" href=\"\"><i\r\n");
      out.write("                                class=\"fab fa-twitter fw-normal\"></i></a>\r\n");
      out.write("                        <a class=\"btn btn-sm btn-outline-light btn-sm-square rounded-circle me-2\" href=\"\"><i\r\n");
      out.write("                                class=\"fab fa-facebook-f fw-normal\"></i></a>\r\n");
      out.write("                        <a class=\"btn btn-sm btn-outline-light btn-sm-square rounded-circle me-2\" href=\"\"><i\r\n");
      out.write("                                class=\"fab fa-linkedin-in fw-normal\"></i></a>\r\n");
      out.write("                        <a class=\"btn btn-sm btn-outline-light btn-sm-square rounded-circle me-2\" href=\"\"><i\r\n");
      out.write("                                class=\"fab fa-instagram fw-normal\"></i></a>\r\n");
      out.write("                        <a class=\"btn btn-sm btn-outline-light btn-sm-square rounded-circle\" href=\"\"><i\r\n");
      out.write("                                class=\"fab fa-youtube fw-normal\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Topbar End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Navbar & Hero Start -->\r\n");
      out.write("        <div class=\"container-fluid position-relative p-0\">\r\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light px-4 px-lg-5 py-3 py-lg-0\">\r\n");
      out.write("                <a href=\"\" class=\"navbar-brand p-0\">\r\n");
      out.write("                    <a href =\"home\"><h1 class=\"text-primary m-0\" ><i class=\"fa fa-map-marker-alt me-3\"></i>Volunteer</h1></a>\r\n");
      out.write("\r\n");
      out.write("                </a>\r\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\r\n");
      out.write("                    <span class=\"fa fa-bars\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\r\n");
      out.write("                    <div class=\"navbar-nav ms-auto py-0\">\r\n");
      out.write("                        <a href=\"index.html\" class=\"nav-item nav-link active\">Home</a>\r\n");
      out.write("                        <a href=\"about.html\" class=\"nav-item nav-link\">About</a>\r\n");
      out.write("                        <a href=\"service.html\" class=\"nav-item nav-link\">Services</a>\r\n");
      out.write("                        <a href=\"package.html\" class=\"nav-item nav-link\">Packages</a>\r\n");
      out.write("                        <div class=\"nav-item dropdown\">\r\n");
      out.write("                            <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">Pages</a>\r\n");
      out.write("                            <div class=\"dropdown-menu m-0\">\r\n");
      out.write("                                <a href=\"destination.html\" class=\"dropdown-item\">Destination</a>\r\n");
      out.write("                                <a href=\"booking.html\" class=\"dropdown-item\">Booking</a>\r\n");
      out.write("                                <a href=\"team.html\" class=\"dropdown-item\">Travel Guides</a>\r\n");
      out.write("                                <a href=\"testimonial.html\" class=\"dropdown-item\">Testimonial</a>\r\n");
      out.write("                                <a href=\"404.html\" class=\"dropdown-item\">404 Page</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <a href=\"logout\" class=\"nav-item nav-link\">Logout</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- JavaScript Libraries -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"../lib/wow/wow.min.js\"></script>\r\n");
      out.write("    <script src=\"../lib/easing/easing.min.js\"></script>\r\n");
      out.write("    <script src=\"../lib/waypoints/waypoints.min.js\"></script>\r\n");
      out.write("    <script src=\"../lib/owlcarousel/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"../lib/tempusdominus/js/moment.min.js\"></script>\r\n");
      out.write("    <script src=\"../lib/tempusdominus/js/moment-timezone.min.js\"></script>\r\n");
      out.write("    <script src=\"../lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Javascript -->\r\n");
      out.write("    <script src=\"../js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.LOGIN_USER == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <a href=\"login.jsp\"><i style=\"\" class=\"fa-solid fa-user\"></i></a>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.LOGIN_USER != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <a href=\"Profile.jsp\"><i style=\"\" class=\"fa-solid fa-user\"> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.LOGIN_USER.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</i></a>\r\n");
        out.write("\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
