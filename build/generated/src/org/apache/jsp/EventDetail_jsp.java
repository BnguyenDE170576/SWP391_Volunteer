package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Account;
import dao.AccountDAO;

public final class EventDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/./components/header.jsp");
    _jspx_dependants.add("/./components/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <title>Vounteer</title>\r\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("        <meta content=\"\" name=\"keywords\">\r\n");
      out.write("        <meta content=\"\" name=\"description\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Favicon -->\r\n");
      out.write("        <link href=\"img/favicon.ico\" rel=\"icon\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Google Web Fonts -->\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600&family=Nunito:wght@600;700;800&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\">\r\n");
      out.write("        <!-- Icon Font Stylesheet -->\r\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Libraries Stylesheet -->\r\n");
      out.write("        <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Template Stylesheet -->\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <style> .navbar-light {\r\n");
      out.write("                position: unset;\r\n");
      out.write("            }</style>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
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
      out.write("                <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">Activity</a>\r\n");
      out.write("                <div class=\"dropdown-menu m-0\">\r\n");
      out.write("                    <a href=\"./CreateActivity.jsp\" class=\"dropdown-item\">Create Activity</a>\r\n");
      out.write("                    <a href=\"booking.html\" class=\"dropdown-item\">Manager Activity</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <a href=\"donation.jsp\" class=\"nav-item nav-link\">Donation</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("        <div class=\"container mt-5\">\r\n");
      out.write("            <h1 class=\"display-4\">Chi Tiết Hoạt Động</h1>\r\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
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
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container-fluid bg-dark text-light footer pt-5 mt-5 wow fadeIn\" data-wow-delay=\"0.1s\">\r\n");
      out.write("            <div class=\"container py-5\">\r\n");
      out.write("                <div class=\"row g-5\">\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                        <h4 class=\"text-white mb-3\">Company</h4>\r\n");
      out.write("                        <a class=\"btn btn-link\" href=\"\">About Us</a>\r\n");
      out.write("                        <a class=\"btn btn-link\" href=\"\">Contact Us</a>\r\n");
      out.write("                        <a class=\"btn btn-link\" href=\"\">Privacy Policy</a>\r\n");
      out.write("                        <a class=\"btn btn-link\" href=\"\">Terms & Condition</a>\r\n");
      out.write("                        <a class=\"btn btn-link\" href=\"\">FAQs & Help</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                        <h4 class=\"text-white mb-3\">Contact</h4>\r\n");
      out.write("                        <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt me-3\"></i>123 Street, New York, USA</p>\r\n");
      out.write("                        <p class=\"mb-2\"><i class=\"fa fa-phone-alt me-3\"></i>+012 345 67890</p>\r\n");
      out.write("                        <p class=\"mb-2\"><i class=\"fa fa-envelope me-3\"></i>info@example.com</p>\r\n");
      out.write("                        <div class=\"d-flex pt-2\">\r\n");
      out.write("                            <a class=\"btn btn-outline-light btn-social\" href=\"\"><i\r\n");
      out.write("                                    class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                            <a class=\"btn btn-outline-light btn-social\" href=\"\"><i\r\n");
      out.write("                                    class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                            <a class=\"btn btn-outline-light btn-social\" href=\"\"><i\r\n");
      out.write("                                    class=\"fab fa-youtube\"></i></a>\r\n");
      out.write("                            <a class=\"btn btn-outline-light btn-social\" href=\"\"><i\r\n");
      out.write("                                    class=\"fab fa-linkedin-in\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                        <h4 class=\"text-white mb-3\">Gallery</h4>\r\n");
      out.write("                        <div class=\"row g-2 pt-2\">\r\n");
      out.write("                            <div class=\"col-4\">\r\n");
      out.write("                                <img class=\"img-fluid bg-light p-1\" src=\"img/package-1.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-4\">\r\n");
      out.write("                                <img class=\"img-fluid bg-light p-1\" src=\"img/package-2.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-4\">\r\n");
      out.write("                                <img class=\"img-fluid bg-light p-1\" src=\"img/package-3.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-4\">\r\n");
      out.write("                                <img class=\"img-fluid bg-light p-1\" src=\"img/package-2.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-4\">\r\n");
      out.write("                                <img class=\"img-fluid bg-light p-1\" src=\"img/package-3.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-4\">\r\n");
      out.write("                                <img class=\"img-fluid bg-light p-1\" src=\"img/package-1.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                        <h4 class=\"text-white mb-3\">Newsletter</h4>\r\n");
      out.write("                        <p>Dolor amet sit justo amet elitr clita ipsum elitr est.</p>\r\n");
      out.write("                        <div class=\"position-relative mx-auto\" style=\"max-width: 400px;\">\r\n");
      out.write("                            <input class=\"form-control border-primary w-100 py-3 ps-4 pe-5\" type=\"text\"\r\n");
      out.write("                                   placeholder=\"Your email\">\r\n");
      out.write("                            <button type=\"button\"\r\n");
      out.write("                                    class=\"btn btn-primary py-2 position-absolute top-0 end-0 mt-2 me-2\">SignUp</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"copyright\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-6 text-center text-md-start mb-3 mb-md-0\">\r\n");
      out.write("                            &copy; <a class=\"border-bottom\" href=\"#\">Your Site Name</a>, All Right Reserved.\r\n");
      out.write("\r\n");
      out.write("                            <!--/*** This template is free as long as you keep the footer author’s credit link/attribution link/backlink. If you'd like to use the template without the footer author’s credit link/attribution link/backlink, you can purchase the Credit Removal License from \"https://htmlcodex.com/credit-removal\". Thank you for your support. ***/-->\r\n");
      out.write("                            Designed By <a class=\"border-bottom\" href=\"https://htmlcodex.com\">HTML Codex</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6 text-center text-md-end\">\r\n");
      out.write("                            <div class=\"footer-menu\">\r\n");
      out.write("                                <a href=\"\">Home</a>\r\n");
      out.write("                                <a href=\"\">Cookies</a>\r\n");
      out.write("                                <a href=\"\">Help</a>\r\n");
      out.write("                                <a href=\"\">FQAs</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- JavaScript Libraries -->\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <script src=\"../lib/wow/wow.min.js\"></script>\r\n");
      out.write("        <script src=\"../lib/easing/easing.min.js\"></script>\r\n");
      out.write("        <script src=\"../lib/waypoints/waypoints.min.js\"></script>\r\n");
      out.write("        <script src=\"../lib/owlcarousel/owl.carousel.min.js\"></script>\r\n");
      out.write("        <script src=\"../lib/tempusdominus/js/moment.min.js\"></script>\r\n");
      out.write("        <script src=\"../lib/tempusdominus/js/moment-timezone.min.js\"></script>\r\n");
      out.write("        <script src=\"../lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Template Javascript -->\r\n");
      out.write("        <script src=\"../js/main.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"modal fade\" id=\"myModal\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <h4 class=\"modal-title\">Xét duyệt thành viên</h4>\r\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <!-- Hiển thị danh sách thành viên và các nút từ chối/xét duyệt tại đây -->\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("   \r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\">Đóng</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"./js/BrowserJoin.js\"></script>    \r\n");
      out.write("        <script>\r\n");
      out.write("                                            $(document).ready(function () {\r\n");
      out.write("                                                $(\"#myModal\").on(\"click\", \"button[data-action='reject']\", function () {\r\n");
      out.write("                                                    // Xử lý từ chối thành viên\r\n");
      out.write("                                                    // Đóng modal sau khi xử lý\r\n");
      out.write("                                                    $(\"#myModal\").modal(\"hide\");\r\n");
      out.write("                                                });\r\n");
      out.write("\r\n");
      out.write("                                                $(\"#myModal\").on(\"click\", \"button[data-action='approve']\", function () {\r\n");
      out.write("                                                    // Xử lý xét duyệt thành viên\r\n");
      out.write("                                                    // Đóng modal sau khi xử lý\r\n");
      out.write("                                                    $(\"#myModal\").modal(\"hide\");\r\n");
      out.write("                                                });\r\n");
      out.write("                                            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.LOGIN_USER == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <li class=\"nav-item\">\r\n");
        out.write("                    <a href=\"login.jsp\"><i class=\"fa fa-user\"></i></a>\r\n");
        out.write("                </li>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <div class=\"nav-item dropdown\"> \r\n");
        out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" data-bs-toggle=\"dropdown\">\r\n");
        out.write("                        <i class=\"fa fa-user\"></i> \r\n");
        out.write("                    </a>\r\n");
        out.write("                    <div class=\"dropdown-menu m-0\">\r\n");
        out.write("                        <a class=\"dropdown-item\" href=\"changepass\">Change Password</a>\r\n");
        out.write("                        <a class=\"dropdown-item\" href=\"./Profile.jsp\">View Profile</a>\r\n");
        out.write("                        <a class=\"dropdown-item\" href=\"#\">Edit Profile</a>\r\n");
        out.write("                        <a class=\"dropdown-item\" href=\"logout\">Log Out</a>\r\n");
        out.write("                    </div>\r\n");
        out.write("                </div>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty detail}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <div class=\"card\">\r\n");
        out.write("                    <div class=\"card-body\">\r\n");
        out.write("                        <div class=\"row\">\r\n");
        out.write("                            <div class=\"col-md-4\">\r\n");
        out.write("                                <img src=\"img/package-1.jpg\" alt=\"Hình ảnh hoạt động\" class=\"img-fluid mb-3\">\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"col-md-8\">\r\n");
        out.write("                                <h5 class=\"card-title\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.activityName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h5>                                                           \r\n");
        out.write("\r\n");
        out.write("                                <p class=\"card-text\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\r\n");
        out.write("                                <p class=\"card-text\"><strong>Ngày Bắt Đầu:</strong> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.startDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\r\n");
        out.write("                                <p class=\"card-text\"><strong>Ngày Kết Thúc:</strong> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.endDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\r\n");
        out.write("                                <p class=\"card-text\"><strong>Địa Điểm:</strong> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.location}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\r\n");
        out.write("                                <p class=\"card-text\"><strong>Người Tổ Chức ID:</strong> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.organizerId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\r\n");
        out.write("                                <p class=\"card-text\"><strong>Số Lượng Thành Viên:</strong> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.numberMember}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\r\n");
        out.write("                                <p class=\"card-text\"><strong>Ngày Tạo:</strong> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.createdDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\r\n");
        out.write("                                <p class=\"card-text\"><strong>Ngày Cập Nhật:</strong> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.updatedDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\r\n");
        out.write("                                <p> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${check}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" </p>\r\n");
        out.write("                                <div class=\"text-center mt-4\">\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                    <div class=\"grouptbt\" style=\"\r\n");
        out.write("                                         justify-content: space-between;\r\n");
        out.write("                                         display: flex;\r\n");
        out.write("                                         text-align: center;\r\n");
        out.write("                                         \">\r\n");
        out.write("                                        ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        <form action=\"donationevent\" method=\"post\">\r\n");
        out.write("                                            <input type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.organizerId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" name=\"id\">\r\n");
        out.write("                                            <button id=\"donation\" class=\"btn btn-primary btn-lg\">Donation</button>  \r\n");
        out.write("                                        </form>\r\n");
        out.write("                                    </div>\r\n");
        out.write("\r\n");
        out.write("                                    ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    ");
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    ");
        if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </div>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("                    </div>\r\n");
        out.write("                </div>\r\n");
        out.write("            ");
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

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.organizerId == userID}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            <button id=\"approveButton\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\">Xét duyệt</button>  \r\n");
        out.write("                                        ");
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.organizerId != userID && check==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <form action=\"PendingUser\"  method=\"POST\">\r\n");
        out.write("                                            <input type=\"hidden\" name=\"activityId\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.activityId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\r\n");
        out.write("\r\n");
        out.write("                                            <input type=\"hidden\" name=\"userID\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\r\n");
        out.write("                                            <button class=\"btn btn-primary btn-lg\">Tham gia</button>\r\n");
        out.write("                                        </form>\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.organizerId != userID && check==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                        <box class=\"btn btn-primary btn-lg\">Đợi xét duyệt</box>\r\n");
        out.write("\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.organizerId != userID && check==2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                        <box class=\"btn btn-primary btn-lg\">Đã Tham gia</box>\r\n");
        out.write("\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("us");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pendinglist}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("    \r\n");
          out.write("                                <li>\r\n");
          out.write("                                    <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${us.getUserName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                                    <div class=\"btn-group\" role=\"group\">\r\n");
          out.write("                                        <button onclick=\"rejectMember(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${us.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(',');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.activityId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(", this, this.nextElementSibling)\">Từ chối</button>\r\n");
          out.write("                                        <button onclick=\"approveMember(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${us.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(',');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.activityId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(", this, this.previousElementSibling)\">Xét duyệt</button>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </li>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
