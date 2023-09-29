package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/./components/header.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_step_end_begin;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_step_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_forEach_var_step_end_begin.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        ");
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
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container-fluid position-relative p-0\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container-fluid bg-primary py-5 mb-5 hero-header\">\r\n");
      out.write("                <div class=\"container py-5\">\r\n");
      out.write("                    <div class=\"row justify-content-center py-5\">\r\n");
      out.write("                        <div class=\"col-lg-10 pt-lg-5 mt-lg-5 text-center\">\r\n");
      out.write("                            <h1 class=\"display-3 text-white mb-3 animated slideInDown\">Help us to save earth\r\n");
      out.write("                            </h1>\r\n");
      out.write("\r\n");
      out.write("                            <p class=\"fs-4 text-white mb-4 animated slideInDown\">Make the World Great Again\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <div class=\"position-relative w-75 mx-auto animated slideInDown\">\r\n");
      out.write("                                <input class=\"form-control border-0 rounded-pill w-100 py-3 ps-4 pe-5\"\r\n");
      out.write("                                       type=\"text\" placeholder=\"Eg: Da Nang\">\r\n");
      out.write("                                <button type=\"button\"\r\n");
      out.write("                                        class=\"btn btn-primary rounded-pill py-2 px-4 position-absolute top-0 end-0 me-2\"\r\n");
      out.write("                                        style=\"margin-top: 7px;\">Search</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Navbar & Hero End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Package Start -->\r\n");
      out.write("        <div class=\"container-xxl py-5\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"text-center wow fadeInUp\" data-wow-delay=\"0.1s\">\r\n");
      out.write("                    <h1 class=\"mb-5\">Events</h1>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mt-3 paging wow fadeInUp\">\r\n");
      out.write("                    <nav aria-label=\"Page navigation\">\r\n");
      out.write("                        <ul class=\"pagination justify-content-center\">\r\n");
      out.write("                            <li class=\"page-item ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page == 1 ? 'disabled' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                <a class=\"page-link\" href=\"home?page=1\" aria-label=\"Trang đầu\">\r\n");
      out.write("                                    <span aria-hidden=\"true\">&laquo;&laquo;</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"page-item ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page == 1 ? 'disabled' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                <a class=\"page-link\" href=\"home?page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page - 1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" aria-label=\"Trang trước\">\r\n");
      out.write("                                    <span aria-hidden=\"true\">&laquo;</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            <li class=\"page-item ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page == totalPage ? 'disabled' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                <a class=\"page-link\" href=\"home?page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page + 1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" aria-label=\"Trang sau\">\r\n");
      out.write("                                    <span aria-hidden=\"true\">&raquo;</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"page-item ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page == totalPage ? 'disabled' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                <a class=\"page-link\" href=\"home?page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" aria-label=\"Trang cuối\">\r\n");
      out.write("                                    <span aria-hidden=\"true\">&raquo;&raquo;</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Package End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Service Start -->\r\n");
      out.write("            <div class=\"container-xxl py-5\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"text-center wow fadeInUp\" data-wow-delay=\"0.1s\">\r\n");
      out.write("                        <h6 class=\"section-title bg-white text-center text-primary px-3\">Activites</h6>\r\n");
      out.write("                        <h1 class=\"mb-5\">Our activities</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row g-4\">\r\n");
      out.write("                        <div class=\"col-lg-3 col-sm-6 wow fadeInUp\" data-wow-delay=\"0.1s\">\r\n");
      out.write("                            <div class=\"service-item rounded pt-3\">\r\n");
      out.write("                                <div class=\"p-4\">\r\n");
      out.write("                                    <i class=\"fa fa-3x fa-globe text-primary mb-4\"></i>\r\n");
      out.write("                                    <h5>Education</h5>\r\n");
      out.write("                                    <p>Tutoring or teaching students, assisting with after-school programs, helping with educational nonprofit organizations.<br>\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-3 col-sm-6 wow fadeInUp\" data-wow-delay=\"0.3s\">\r\n");
      out.write("                            <div class=\"service-item rounded pt-3\">\r\n");
      out.write("                                <div class=\"p-4\">\r\n");
      out.write("                                    <i class=\"fa fa-3x fa-hotel text-primary mb-4\"></i>\r\n");
      out.write("                                    <h5>Health and human services</h5>\r\n");
      out.write("                                    <p>Volunteering at hospitals, nursing homes, hospices, food banks, shelters, assisting individuals with disabilities.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-3 col-sm-6 wow fadeInUp\" data-wow-delay=\"0.5s\">\r\n");
      out.write("                            <div class=\"service-item rounded pt-3\">\r\n");
      out.write("                                <div class=\"p-4\">\r\n");
      out.write("                                    <i class=\"fa fa-3x fa-user text-primary mb-4\"></i>\r\n");
      out.write("                                    <h5>Environment </h5>\r\n");
      out.write("                                    <p>Working with land conservation efforts, parks, beaches, trails, environmental nonprofits. Tasks include restoration, research, education.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-3 col-sm-6 wow fadeInUp\" data-wow-delay=\"0.7s\">\r\n");
      out.write("                            <div class=\"service-item rounded pt-3\">\r\n");
      out.write("                                <div class=\"p-4\">\r\n");
      out.write("                                    <i class=\"fa fa-3x fa-cog text-primary mb-4\"></i>\r\n");
      out.write("                                    <h5>Animal welfare</h5>\r\n");
      out.write("                                    <p>Volunteering at animal shelters, rescues, sanctuaries, veterinary clinics, wildlife rehabilitation. Tasks include socializing animals, cleaning, fundraising.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-3 col-sm-6 wow fadeInUp\" data-wow-delay=\"0.1s\">\r\n");
      out.write("                            <div class=\"service-item rounded pt-3\">\r\n");
      out.write("                                <div class=\"p-4\">\r\n");
      out.write("                                    <i class=\"fa fa-3x fa-globe text-primary mb-4\"></i>\r\n");
      out.write("                                    <h5>Arts and culture</h5>\r\n");
      out.write("                                    <p> Assisting with museums, theaters, music/dance groups. Tasks include event support, docent/tour guiding, administrative work.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-3 col-sm-6 wow fadeInUp\" data-wow-delay=\"0.3s\">\r\n");
      out.write("                            <div class=\"service-item rounded pt-3\">\r\n");
      out.write("                                <div class=\"p-4\">\r\n");
      out.write("                                    <i class=\"fa fa-3x fa-hotel text-primary mb-4\"></i>\r\n");
      out.write("                                    <h5>Community improvement</h5>\r\n");
      out.write("                                    <p>Volunteering with neighborhood associations, community centers, libraries. Tasks include event planning, beautification projects, administrative support.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-3 col-sm-6 wow fadeInUp\" data-wow-delay=\"0.5s\">\r\n");
      out.write("                            <div class=\"service-item rounded pt-3\">\r\n");
      out.write("                                <div class=\"p-4\">\r\n");
      out.write("                                    <i class=\"fa fa-3x fa-user text-primary mb-4\"></i>\r\n");
      out.write("                                    <h5>International/global </h5>\r\n");
      out.write("                                    <p>Volunteering abroad or for international nonprofit organizations focused on issues like poverty, healthcare, education, human rights.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-3 col-sm-6 wow fadeInUp\" data-wow-delay=\"0.7s\">\r\n");
      out.write("                            <div class=\"service-item rounded pt-3\">\r\n");
      out.write("                                <div class=\"p-4\">\r\n");
      out.write("                                    <i class=\"fa fa-3x fa-cog text-primary mb-4\"></i>\r\n");
      out.write("                                    <h5>Political/social advocacy</h5>\r\n");
      out.write("                                    <p>Volunteering for campaigns, organizations that focus on issues like voter registration, women's rights, LGBTQ+ rights, racial justice, poverty advocacy. Tasks include outreach, fundraising, administrative support.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Service End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Destination Start -->\r\n");
      out.write("            <div class=\"container-xxl py-5 destination\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"text-center wow fadeInUp\" data-wow-delay=\"0.1s\">\r\n");
      out.write("                        <h6 class=\"section-title bg-white text-center text-primary px-3\">Destination</h6>\r\n");
      out.write("                        <h1 class=\"mb-5\">Popular Destination</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row g-3\">\r\n");
      out.write("                        <div class=\"col-lg-7 col-md-6\">\r\n");
      out.write("                            <div class=\"row g-3\">\r\n");
      out.write("                                <div class=\"col-lg-12 col-md-12 wow zoomIn\" data-wow-delay=\"0.1s\">\r\n");
      out.write("                                    <a class=\"position-relative d-block overflow-hidden\" href=\"\">\r\n");
      out.write("                                        <img class=\"img-fluid\" src=\"img/destination-1.jpg\" alt=\"\">\r\n");
      out.write("                                        <div\r\n");
      out.write("                                            class=\"bg-white text-danger fw-bold position-absolute top-0 start-0 m-3 py-1 px-2\">\r\n");
      out.write("                                            30% OFF</div>\r\n");
      out.write("                                        <div\r\n");
      out.write("                                            class=\"bg-white text-primary fw-bold position-absolute bottom-0 end-0 m-3 py-1 px-2\">\r\n");
      out.write("                                            Thailand</div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-lg-6 col-md-12 wow zoomIn\" data-wow-delay=\"0.3s\">\r\n");
      out.write("                                    <a class=\"position-relative d-block overflow-hidden\" href=\"\">\r\n");
      out.write("                                        <img class=\"img-fluid\" src=\"img/destination-2.jpg\" alt=\"\">\r\n");
      out.write("                                        <div\r\n");
      out.write("                                            class=\"bg-white text-danger fw-bold position-absolute top-0 start-0 m-3 py-1 px-2\">\r\n");
      out.write("                                            25% OFF</div>\r\n");
      out.write("                                        <div\r\n");
      out.write("                                            class=\"bg-white text-primary fw-bold position-absolute bottom-0 end-0 m-3 py-1 px-2\">\r\n");
      out.write("                                            Malaysia</div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-lg-6 col-md-12 wow zoomIn\" data-wow-delay=\"0.5s\">\r\n");
      out.write("                                    <a class=\"position-relative d-block overflow-hidden\" href=\"\">\r\n");
      out.write("                                        <img class=\"img-fluid\" src=\"img/destination-3.jpg\" alt=\"\">\r\n");
      out.write("                                        <div\r\n");
      out.write("                                            class=\"bg-white text-danger fw-bold position-absolute top-0 start-0 m-3 py-1 px-2\">\r\n");
      out.write("                                            35% OFF</div>\r\n");
      out.write("                                        <div\r\n");
      out.write("                                            class=\"bg-white text-primary fw-bold position-absolute bottom-0 end-0 m-3 py-1 px-2\">\r\n");
      out.write("                                            Australia</div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-5 col-md-6 wow zoomIn\" data-wow-delay=\"0.7s\" style=\"min-height: 350px;\">\r\n");
      out.write("                            <a class=\"position-relative d-block h-100 overflow-hidden\" href=\"\">\r\n");
      out.write("                                <img class=\"img-fluid position-absolute w-100 h-100\" src=\"img/destination-4.jpg\"\r\n");
      out.write("                                     alt=\"\" style=\"object-fit: cover;\">\r\n");
      out.write("                                <div\r\n");
      out.write("                                    class=\"bg-white text-danger fw-bold position-absolute top-0 start-0 m-3 py-1 px-2\">\r\n");
      out.write("                                    20% OFF</div>\r\n");
      out.write("                                <div\r\n");
      out.write("                                    class=\"bg-white text-primary fw-bold position-absolute bottom-0 end-0 m-3 py-1 px-2\">\r\n");
      out.write("                                    Indonesia</div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Destination Start -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Booking Start -->\r\n");
      out.write("            <div class=\"container-xxl py-5 wow fadeInUp\" data-wow-delay=\"0.1s\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"booking p-5\">\r\n");
      out.write("                        <div class=\"row g-5 align-items-center\">\r\n");
      out.write("                            <div class=\"col-md-6 text-white\">\r\n");
      out.write("                                <h6 class=\"text-white text-uppercase\">Booking</h6>\r\n");
      out.write("                                <h1 class=\"text-white mb-4\">Online Booking</h1>\r\n");
      out.write("                                <p class=\"mb-4\">Tempor erat elitr rebum at clita. Diam dolor diam ipsum sit. Aliqu\r\n");
      out.write("                                    diam amet diam et eos. Clita erat ipsum et lorem et sit.</p>\r\n");
      out.write("                                <p class=\"mb-4\">Tempor erat elitr rebum at clita. Diam dolor diam ipsum sit. Aliqu\r\n");
      out.write("                                    diam amet diam et eos. Clita erat ipsum et lorem et sit, sed stet lorem sit\r\n");
      out.write("                                    clita duo justo magna dolore erat amet</p>\r\n");
      out.write("                                <a class=\"btn btn-outline-light py-3 px-5 mt-2\" href=\"\">Read More</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-6\">\r\n");
      out.write("                                <h1 class=\"text-white mb-4\">Book A Tour</h1>\r\n");
      out.write("                                <form>\r\n");
      out.write("                                    <div class=\"row g-3\">\r\n");
      out.write("                                        <div class=\"col-md-6\">\r\n");
      out.write("                                            <div class=\"form-floating\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control bg-transparent\" id=\"name\"\r\n");
      out.write("                                                       placeholder=\"Your Name\">\r\n");
      out.write("                                                <label for=\"name\">Your Name</label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-6\">\r\n");
      out.write("                                            <div class=\"form-floating\">\r\n");
      out.write("                                                <input type=\"email\" class=\"form-control bg-transparent\" id=\"email\"\r\n");
      out.write("                                                       placeholder=\"Your Email\">\r\n");
      out.write("                                                <label for=\"email\">Your Email</label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-6\">\r\n");
      out.write("                                            <div class=\"form-floating date\" id=\"date3\" data-target-input=\"nearest\">\r\n");
      out.write("                                                <input type=\"text\"\r\n");
      out.write("                                                       class=\"form-control bg-transparent datetimepicker-input\"\r\n");
      out.write("                                                       id=\"datetime\" placeholder=\"Date & Time\" data-target=\"#date3\"\r\n");
      out.write("                                                       data-toggle=\"datetimepicker\" />\r\n");
      out.write("                                                <label for=\"datetime\">Date & Time</label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-6\">\r\n");
      out.write("                                            <div class=\"form-floating\">\r\n");
      out.write("                                                <select class=\"form-select bg-transparent\" id=\"select1\">\r\n");
      out.write("                                                    <option value=\"1\">Destination 1</option>\r\n");
      out.write("                                                    <option value=\"2\">Destination 2</option>\r\n");
      out.write("                                                    <option value=\"3\">Destination 3</option>\r\n");
      out.write("                                                </select>\r\n");
      out.write("                                                <label for=\"select1\">Destination</label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-12\">\r\n");
      out.write("                                            <div class=\"form-floating\">\r\n");
      out.write("                                                <textarea class=\"form-control bg-transparent\"\r\n");
      out.write("                                                          placeholder=\"Special Request\" id=\"message\"\r\n");
      out.write("                                                          style=\"height: 100px\"></textarea>\r\n");
      out.write("                                                <label for=\"message\">Special Request</label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-12\">\r\n");
      out.write("                                            <button class=\"btn btn-outline-light w-100 py-3\" type=\"submit\">Book\r\n");
      out.write("                                                Now</button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Booking Start -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Process Start -->\r\n");
      out.write("            <div class=\"container-xxl py-5\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"text-center pb-4 wow fadeInUp\" data-wow-delay=\"0.1s\">\r\n");
      out.write("                        <h6 class=\"section-title bg-white text-center text-primary px-3\">Process</h6>\r\n");
      out.write("                        <h1 class=\"mb-5\">3 Easy Steps</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row gy-5 gx-4 justify-content-center\">\r\n");
      out.write("                        <div class=\"col-lg-4 col-sm-6 text-center pt-4 wow fadeInUp\" data-wow-delay=\"0.1s\">\r\n");
      out.write("                            <div class=\"position-relative border border-primary pt-5 pb-4 px-4\">\r\n");
      out.write("                                <div class=\"d-inline-flex align-items-center justify-content-center bg-primary rounded-circle position-absolute top-0 start-50 translate-middle shadow\"\r\n");
      out.write("                                     style=\"width: 100px; height: 100px;\">\r\n");
      out.write("                                    <i class=\"fa fa-globe fa-3x text-white\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <h5 class=\"mt-4\">Choose A Destination</h5>\r\n");
      out.write("                                <hr class=\"w-25 mx-auto bg-primary mb-1\">\r\n");
      out.write("                                <hr class=\"w-50 mx-auto bg-primary mt-0\">\r\n");
      out.write("                                <p class=\"mb-0\">Tempor erat elitr rebum clita dolor diam ipsum sit diam amet diam\r\n");
      out.write("                                    eos erat ipsum et lorem et sit sed stet lorem sit</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-4 col-sm-6 text-center pt-4 wow fadeInUp\" data-wow-delay=\"0.3s\">\r\n");
      out.write("                            <div class=\"position-relative border border-primary pt-5 pb-4 px-4\">\r\n");
      out.write("                                <div class=\"d-inline-flex align-items-center justify-content-center bg-primary rounded-circle position-absolute top-0 start-50 translate-middle shadow\"\r\n");
      out.write("                                     style=\"width: 100px; height: 100px;\">\r\n");
      out.write("                                    <i class=\"fa fa-dollar-sign fa-3x text-white\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <h5 class=\"mt-4\">Pay Online</h5>\r\n");
      out.write("                                <hr class=\"w-25 mx-auto bg-primary mb-1\">\r\n");
      out.write("                                <hr class=\"w-50 mx-auto bg-primary mt-0\">\r\n");
      out.write("                                <p class=\"mb-0\">Tempor erat elitr rebum clita dolor diam ipsum sit diam amet diam\r\n");
      out.write("                                    eos erat ipsum et lorem et sit sed stet lorem sit</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-4 col-sm-6 text-center pt-4 wow fadeInUp\" data-wow-delay=\"0.5s\">\r\n");
      out.write("                            <div class=\"position-relative border border-primary pt-5 pb-4 px-4\">\r\n");
      out.write("                                <div class=\"d-inline-flex align-items-center justify-content-center bg-primary rounded-circle position-absolute top-0 start-50 translate-middle shadow\"\r\n");
      out.write("                                     style=\"width: 100px; height: 100px;\">\r\n");
      out.write("                                    <i class=\"fa fa-plane fa-3x text-white\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <h5 class=\"mt-4\">Fly Today</h5>\r\n");
      out.write("                                <hr class=\"w-25 mx-auto bg-primary mb-1\">\r\n");
      out.write("                                <hr class=\"w-50 mx-auto bg-primary mt-0\">\r\n");
      out.write("                                <p class=\"mb-0\">Tempor erat elitr rebum clita dolor diam ipsum sit diam amet diam\r\n");
      out.write("                                    eos erat ipsum et lorem et sit sed stet lorem sit</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Process Start -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Team Start -->\r\n");
      out.write("            <div class=\"container-xxl py-5\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"text-center wow fadeInUp\" data-wow-delay=\"0.1s\">\r\n");
      out.write("                        <h6 class=\"section-title bg-white text-center text-primary px-3\">Travel Guide</h6>\r\n");
      out.write("                        <h1 class=\"mb-5\">Meet Our Guide</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row g-4\">\r\n");
      out.write("                        <div class=\"col-lg-3 col-md-6 wow fadeInUp\" data-wow-delay=\"0.1s\">\r\n");
      out.write("                            <div class=\"team-item\">\r\n");
      out.write("                                <div class=\"overflow-hidden\">\r\n");
      out.write("                                    <img class=\"img-fluid\" src=\"img/team-1.jpg\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"position-relative d-flex justify-content-center\"\r\n");
      out.write("                                     style=\"margin-top: -19px;\">\r\n");
      out.write("                                    <a class=\"btn btn-square mx-1\" href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                                    <a class=\"btn btn-square mx-1\" href=\"\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                                    <a class=\"btn btn-square mx-1\" href=\"\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"text-center p-4\">\r\n");
      out.write("                                    <h5 class=\"mb-0\">Full Name</h5>\r\n");
      out.write("                                    <small>Designation</small>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-3 col-md-6 wow fadeInUp\" data-wow-delay=\"0.3s\">\r\n");
      out.write("                            <div class=\"team-item\">\r\n");
      out.write("                                <div class=\"overflow-hidden\">\r\n");
      out.write("                                    <img class=\"img-fluid\" src=\"img/team-2.jpg\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"position-relative d-flex justify-content-center\"\r\n");
      out.write("                                     style=\"margin-top: -19px;\">\r\n");
      out.write("                                    <a class=\"btn btn-square mx-1\" href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                                    <a class=\"btn btn-square mx-1\" href=\"\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                                    <a class=\"btn btn-square mx-1\" href=\"\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"text-center p-4\">\r\n");
      out.write("                                    <h5 class=\"mb-0\">Full Name</h5>\r\n");
      out.write("                                    <small>Designation</small>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-3 col-md-6 wow fadeInUp\" data-wow-delay=\"0.5s\">\r\n");
      out.write("                            <div class=\"team-item\">\r\n");
      out.write("                                <div class=\"overflow-hidden\">\r\n");
      out.write("                                    <img class=\"img-fluid\" src=\"img/team-3.jpg\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"position-relative d-flex justify-content-center\"\r\n");
      out.write("                                     style=\"margin-top: -19px;\">\r\n");
      out.write("                                    <a class=\"btn btn-square mx-1\" href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                                    <a class=\"btn btn-square mx-1\" href=\"\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                                    <a class=\"btn btn-square mx-1\" href=\"\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"text-center p-4\">\r\n");
      out.write("                                    <h5 class=\"mb-0\">Full Name</h5>\r\n");
      out.write("                                    <small>Designation</small>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-3 col-md-6 wow fadeInUp\" data-wow-delay=\"0.7s\">\r\n");
      out.write("                            <div class=\"team-item\">\r\n");
      out.write("                                <div class=\"overflow-hidden\">\r\n");
      out.write("                                    <img class=\"img-fluid\" src=\"img/team-4.jpg\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"position-relative d-flex justify-content-center\"\r\n");
      out.write("                                     style=\"margin-top: -19px;\">\r\n");
      out.write("                                    <a class=\"btn btn-square mx-1\" href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                                    <a class=\"btn btn-square mx-1\" href=\"\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                                    <a class=\"btn btn-square mx-1\" href=\"\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"text-center p-4\">\r\n");
      out.write("                                    <h5 class=\"mb-0\">Full Name</h5>\r\n");
      out.write("                                    <small>Designation</small>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Team End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Testimonial Start -->\r\n");
      out.write("            <div class=\"container-xxl py-5 wow fadeInUp\" data-wow-delay=\"0.1s\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"text-center\">\r\n");
      out.write("                        <h6 class=\"section-title bg-white text-center text-primary px-3\">Testimonial</h6>\r\n");
      out.write("                        <h1 class=\"mb-5\">Our Clients Say!!!</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"owl-carousel testimonial-carousel position-relative\">\r\n");
      out.write("                        <div class=\"testimonial-item bg-white text-center border p-4\">\r\n");
      out.write("                            <img class=\"bg-white rounded-circle shadow p-1 mx-auto mb-3\" src=\"img/testimonial-1.jpg\"\r\n");
      out.write("                                 style=\"width: 80px; height: 80px;\">\r\n");
      out.write("                            <h5 class=\"mb-0\">John Doe</h5>\r\n");
      out.write("                            <p>New York, USA</p>\r\n");
      out.write("                            <p class=\"mb-0\">Tempor erat elitr rebum at clita. Diam dolor diam ipsum sit diam amet\r\n");
      out.write("                                diam et eos. Clita erat ipsum et lorem et sit.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"testimonial-item bg-white text-center border p-4\">\r\n");
      out.write("                            <img class=\"bg-white rounded-circle shadow p-1 mx-auto mb-3\" src=\"img/testimonial-2.jpg\"\r\n");
      out.write("                                 style=\"width: 80px; height: 80px;\">\r\n");
      out.write("                            <h5 class=\"mb-0\">John Doe</h5>\r\n");
      out.write("                            <p>New York, USA</p>\r\n");
      out.write("                            <p class=\"mt-2 mb-0\">Tempor erat elitr rebum at clita. Diam dolor diam ipsum sit diam\r\n");
      out.write("                                amet diam et eos. Clita erat ipsum et lorem et sit.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"testimonial-item bg-white text-center border p-4\">\r\n");
      out.write("                            <img class=\"bg-white rounded-circle shadow p-1 mx-auto mb-3\" src=\"img/testimonial-3.jpg\"\r\n");
      out.write("                                 style=\"width: 80px; height: 80px;\">\r\n");
      out.write("                            <h5 class=\"mb-0\">John Doe</h5>\r\n");
      out.write("                            <p>New York, USA</p>\r\n");
      out.write("                            <p class=\"mt-2 mb-0\">Tempor erat elitr rebum at clita. Diam dolor diam ipsum sit diam\r\n");
      out.write("                                amet diam et eos. Clita erat ipsum et lorem et sit.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"testimonial-item bg-white text-center border p-4\">\r\n");
      out.write("                            <img class=\"bg-white rounded-circle shadow p-1 mx-auto mb-3\" src=\"img/testimonial-4.jpg\"\r\n");
      out.write("                                 style=\"width: 80px; height: 80px;\">\r\n");
      out.write("                            <h5 class=\"mb-0\">John Doe</h5>\r\n");
      out.write("                            <p>New York, USA</p>\r\n");
      out.write("                            <p class=\"mt-2 mb-0\">Tempor erat elitr rebum at clita. Diam dolor diam ipsum sit diam\r\n");
      out.write("                                amet diam et eos. Clita erat ipsum et lorem et sit.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Testimonial End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Footer Start -->\r\n");
      out.write("      \r\n");
      out.write("            <!-- Footer End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Back to Top -->\r\n");
      out.write("            <a href=\"#\" class=\"btn btn-lg btn-primary btn-lg-square back-to-top\"><i class=\"bi bi-arrow-up\"></i></a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- JavaScript Libraries -->\r\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("            <script src=\"lib/wow/wow.min.js\"></script>\r\n");
      out.write("            <script src=\"lib/easing/easing.min.js\"></script>\r\n");
      out.write("            <script src=\"lib/waypoints/waypoints.min.js\"></script>\r\n");
      out.write("            <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\r\n");
      out.write("            <script src=\"lib/tempusdominus/js/moment.min.js\"></script>\r\n");
      out.write("            <script src=\"lib/tempusdominus/js/moment-timezone.min.js\"></script>\r\n");
      out.write("            <script src=\"lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("            <!-- Template Javascript -->\r\n");
      out.write("            <script src=\"js/main.js\"></script>\r\n");
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

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty content}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("                    <div class=\"row g-4 justify-content-center\">\r\n");
        out.write("                        <div class=\"row row-product\">\r\n");
        out.write("                            ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        ");
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

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_forEach_0.setVar("activity");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${content}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                <div class=\"col-lg-4 col-md-6 wow fadeInUp\" data-wow-delay=\"0.1s\">\r\n");
          out.write("                                    <div class=\"package-item\">\r\n");
          out.write("                                        <div class=\"overflow-hidden\">\r\n");
          out.write("                                            <img class=\"img-fluid\" src=\"img/package-1.jpg\" alt=\"\">\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                        <div class=\"d-flex border-bottom\">\r\n");
          out.write("                                            <small class=\"flex-fill text-center border-end py-2\"><i\r\n");
          out.write("                                                    class=\"fa fa-map-marker-alt text-primary me-2\"></i>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activity.getLocation()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</small>\r\n");
          out.write("                                            <small class=\"flex-fill text-center border-end py-2\"><i\r\n");
          out.write("                                                    class=\"fa fa-calendar-alt text-primary me-2\"></i>3\r\n");
          out.write("                                                days</small>\r\n");
          out.write("                                            <small class=\"flex-fill text-center py-2\"><i\r\n");
          out.write("                                                    class=\"fa fa-user text-primary me-2\"></i>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activity.getNumberMember()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</small>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                        <div class=\"text-center p-4\">\r\n");
          out.write("                                            <h3 class=\"mb-0\">$149.00</h3>\r\n");
          out.write("\r\n");
          out.write("                                            <p>Tempor erat elitr rebum at clita. Diam dolor diam ipsum sit diam\r\n");
          out.write("                                                amet diam eos</p>\r\n");
          out.write("                                            <div class=\"d-flex justify-content-center mb-2\">\r\n");
          out.write("                                                <a href=\"EventDetailControl?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activity.getActivityId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\r\n");
          out.write("                                                   class=\"btn btn-sm btn-primary px-3 border-end\"\r\n");
          out.write("                                                   style=\"border-radius: 30px 0 0 30px;\">Read More</a>\r\n");
          out.write("                                                <a href=\"EventDetailControl?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activity.getActivityId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\r\n");
          out.write("                                                   class=\"btn btn-sm btn-primary px-3\"\r\n");
          out.write("                                                   style=\"border-radius: 0 30px 30px 0;\">Book Now</a>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                                ");
          if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
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

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.count % 3 == 0 && status.count != content.size()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"row row-product\">\r\n");
        out.write("\r\n");
        out.write("                                ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_step_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("j");
    _jspx_th_c_forEach_1.setBegin(1);
    _jspx_th_c_forEach_1.setStep(1);
    _jspx_th_c_forEach_1.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPage}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <li class=\"page-item ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page == j ? 'active' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                    <a class=\"page-link\" href=\"home?page=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${j}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${j}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("                                </li>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_step_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
