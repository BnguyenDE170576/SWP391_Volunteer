package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Account;
import dao.AccountDAO;

public final class QRcode_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/./components/header.jsp");
    _jspx_dependants.add("/./components/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
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
      out.write("        <link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/donationcss.css\">\r\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,700italic,400italic' rel='stylesheet'\r\n");
      out.write("              type='text/css'>\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("            .navbar-light {\r\n");
      out.write("                background-color: black;\r\n");
      out.write("            }\r\n");
      out.write("            .py-5{\r\n");
      out.write("                padding-top: 10rem !important;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
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
      out.write("        ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("        <!-- About Start -->\r\n");
      out.write("        <div class=\"container-xxl py-5\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row g-5\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-lg-6 wow fadeInUp\" data-wow-delay=\"0.3s\">\r\n");
      out.write("                        <div class=\"donation-container\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-7\" style=\"background-color: #f5f7f9;   font-size: 20px;\">\r\n");
      out.write("                                <form id=\"donationForm\" action=\"donationpage\" method=\"post\" >\r\n");
      out.write("\r\n");
      out.write("                                    <table >\r\n");
      out.write("                                        <tr><h3>Thông Tin Đơn Hàng</h3></tr>\r\n");
      out.write("                                        <tr>--------------------------</tr><br>\r\n");
      out.write("\r\n");
      out.write("                                        <tr>Số tiền thanh toán</tr><br>\r\n");
      out.write("                                        <tr>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${donation}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" vnđ</tr><br><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <tr>Giá trị đơn hàng</tr><br>\r\n");
      out.write("                                        <tr>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${donation}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" vnd</tr> <br><br>\r\n");
      out.write("\r\n");
      out.write("                                        <tr>Phí giao dịch</tr> <br>\r\n");
      out.write("                                        <tr>0 vnđ</tr><br><br>\r\n");
      out.write("                                        <tr>Mã đơn hàng</tr><br>\r\n");
      out.write("                                        <tr>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${maDH}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</tr> <br><br>\r\n");
      out.write("                                        <tr>Thời gian</tr><br>\r\n");
      out.write("                                        <tr>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${time}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</tr> <br><br>\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                      </div>\r\n");
      out.write("                            <div style=\"padding-left: 90px; font-size: 17px; padding-top:4%;\">\r\n");
      out.write("                                        <button>\r\n");
      out.write("                                            <span class=\"btn-text font-size: 20px;\">\r\n");
      out.write("                                                Đã thanh toán\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-lg-6 wow fadeInUp\" data-wow-delay=\"0.1s\" style=\"min-height: 400px;\">\r\n");
      out.write("\r\n");
      out.write("                        <h4 style=\"justify-content: center;padding-left: 86px;\">Quét mã qua ứng dụng Ví VNPAY</h4>\r\n");
      out.write("                        <form>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"position-relative h-100 \" >\r\n");
      out.write("                                <img class=\"\" src='https://img.vietqr.io/image/mbbank-038888059999-print.png?amount=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${donation}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&addInfo=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${text}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&accountName=NGUYEN+MANH+TUONG' alt=\"\" style=\"object-fit: cover;\">\r\n");
      out.write("                               \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div style=\"padding-left: 213px;\">\r\n");
      out.write("                                <button>\r\n");
      out.write("                                    <span class=\"btn-text\">\r\n");
      out.write("                                        <a href=\"donation.jsp\">Hủy thanh toán</a>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <img class=\"\" src=\"images/bankpng.png\" alt=\"\" style=\"object-fit: cover; padding: 6%;\" loading=\"lazy\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </button>\r\n");
      out.write("    <!-- About End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"./js/myjs.js\"></script>\r\n");
      out.write("    <script src=\"https://raw.githubusercontent.com/jerryluk/jquery.autogrow/master/jquery.autogrow-min.js\"></script>\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://raw.githubusercontent.com/jerryluk/jquery.autogrow/master/jquery.autogrow-min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        function updateDonationValue(input) {\r\n");
      out.write("            // Get the input value\r\n");
      out.write("            var customValue = input.value;\r\n");
      out.write("\r\n");
      out.write("            // Find the radio button with class \"set-amount\"\r\n");
      out.write("            var radioButton = document.querySelector('input[type=\"radio\"].set-amount');\r\n");
      out.write("\r\n");
      out.write("            // Update the radio button's value attribute\r\n");
      out.write("            if (radioButton) {\r\n");
      out.write("                radioButton.value = customValue;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
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
      out.write("</body>\r\n");
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
        out.write("                        <a class=\"dropdown-item\" href=\"#\">Change Password</a>\r\n");
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
}
