package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Account;
import dao.AccountDAO;

public final class Profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Document</title>\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/profile.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/templatemo-style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/fontawesome.min.css\" />\r\n");
      out.write("        <style>\r\n");
      out.write("            .photo-frame {\r\n");
      out.write("                border: 2px;\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("                width: 150px;\r\n");
      out.write("                height: 150px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .photo-frame img {\r\n");
      out.write("                max-width: 80%;\r\n");
      out.write("                max-height: 80%;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");

            String name = ((Account) session.getAttribute("LOGIN_USER")).getUserName();
            Account a = new Account();
            AccountDAO dao = new AccountDAO();

            a = dao.getAccount_BYUSER(name);

        
      out.write("\r\n");
      out.write("        <form action=\"\" method=\"post\" class=\"form1\">\r\n");
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"edit-profile\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-6 col-md-6\">\r\n");
      out.write("                        <h5>MY PROFILE</h5>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <hr>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"container mt-12\">\r\n");
      out.write("\r\n");
      out.write("                        <!-- row -->\r\n");
      out.write("                        <div class=\"row tm-content-row\">\r\n");
      out.write("                            <div class=\"tm-block-col tm-col-avatar\">\r\n");
      out.write("                                <div class=\"tm-bg-primary-dark tm-block tm-block-avatar\">\r\n");
      out.write("                                    <h2 class=\"tm-block-title\">Change Avatar</h2>\r\n");
      out.write("                                    <div class=\"tm-avatar-container\">\r\n");
      out.write("                                        <div class=\"photo-frame\">\r\n");
      out.write("                                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.LOGIN_USER.photo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <button class=\"btn btn-primary btn-block text-uppercase\">\r\n");
      out.write("                                        Upload New Photo\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"tm-block-col tm-col-account-settings\">\r\n");
      out.write("                                <div class=\"tm-bg-primary-dark tm-block tm-block-settings\">\r\n");
      out.write("                                    <h2 class=\"tm-block-title\">Account Settings</h2>\r\n");
      out.write("                                    <form action=\"\" class=\"tm-signup-form row\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group col-lg-6\">\r\n");
      out.write("                                            <label for=\"name\">Account Name</label>\r\n");
      out.write("\r\n");
      out.write("                                            <input\r\n");
      out.write("                                                id=\"email\"\r\n");
      out.write("                                                name=\"username\"\r\n");
      out.write("                                                type=\"text\"\r\n");
      out.write("                                                placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.LOGIN_USER.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly\r\n");
      out.write("                                                class=\"form-control validate\"\r\n");
      out.write("                                                />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                                    <div class=\"form-group col-lg-6\">\r\n");
      out.write("                                            <label for=\"SEX\">SEX</label>\r\n");
      out.write("                                            <input\r\n");
      out.write("                                                id=\"phone\"\r\n");
      out.write("                                                name=\"sex\"\r\n");
      out.write("                                                type=\"text\"\r\n");
      out.write("                                                placeholder=\"Female\"\r\n");
      out.write("                                                class=\"form-control validate\"\r\n");
      out.write("                                                />\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group col-lg-6\">\r\n");
      out.write("                                            <label for=\"email\">Account Email</label>\r\n");
      out.write("                                            ");
      out.print(a.getEmail());
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group col-lg-6\">\r\n");
      out.write("                                            <label for=\"phone\">Phone</label>\r\n");
      out.write("                                            <input\r\n");
      out.write("                                                id=\"phone\"\r\n");
      out.write("                                                name=\"phone\"\r\n");
      out.write("                                                type=\"text\"\r\n");
      out.write("                                                placeholder=\"");
      out.print(a.getPhone());
      out.write("\"\r\n");
      out.write("                                                class=\"form-control validate\"\r\n");
      out.write("                                                />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group col-lg-6\">\r\n");
      out.write("                                            <label for=\"DateBirth\">DateBirth</label>\r\n");
      out.write("                                            <input\r\n");
      out.write("                                                id=\"phone\"\r\n");
      out.write("                                                name=\"dateBirth\"\r\n");
      out.write("                                                type=\"text\"\r\n");
      out.write("                                                placeholder=\"01/06/2003\"\r\n");
      out.write("                                                class=\"form-control validate\"\r\n");
      out.write("                                                />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                        <div class=\"form-group col-lg-6\">\r\n");
      out.write("                                            <label for=\"Address\">Address</label>\r\n");
      out.write("                                            <input\r\n");
      out.write("                                                id=\"phone\"\r\n");
      out.write("                                                name=\"address\"\r\n");
      out.write("                                                type=\"text\"\r\n");
      out.write("                                                placeholder=\"");
      out.print(a.getAddress());
      out.write("\"\r\n");
      out.write("                                                class=\"form-control validate\"\r\n");
      out.write("                                                />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\" data-bs-whatever=\"@getbootstrap\">EDIT</button>\r\n");
      out.write("                        <a href=\"home\" class=\"btn btn-primary\" data-bs-whatever=\"@getbootstrap\"> BACK HOME </a>\r\n");
      out.write("                        <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("                            <div class=\"modal-dialog\">\r\n");
      out.write("                                <div class=\"modal-content\">\r\n");
      out.write("                                    <div class=\"modal-header\">\r\n");
      out.write("                                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Cập Nhập Thông Tin</h5>\r\n");
      out.write("                                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <form action=\"ProfileControl\" method=\"post\"> \r\n");
      out.write("                                        <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"mb-3\">\r\n");
      out.write("                                                <label for=\"recipient-name\" class=\"col-form-label\">Username: </label>\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"recipient-name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.LOGIN_USER.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"username\" readonly>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"mb-3\">\r\n");
      out.write("                                                <label for=\"recipient-name\" class=\"col-form-label\">Name</label>\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"recipient-name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.LOGIN_USER.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"name\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <!--                                                <div class=\"mb-3\">\r\n");
      out.write("                                                                                                <label for=\"recipient-name\" class=\"col-form-label\">Birth Day: </label>\r\n");
      out.write("                                                                                                <input type=\"text\" class=\"form-control\" id=\"recipient-name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.LOGIN_USER.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"yyyy-mm-dd\" name=\"birthday\">\r\n");
      out.write("                                                                                            </div>-->\r\n");
      out.write("                                            <div class=\"mb-3\">\r\n");
      out.write("                                                <label for=\"recipient-name\" class=\"col-form-label\">Phone:</label>\r\n");
      out.write("                                                <input type=\"number\" class=\"form-control\" id=\"recipient-name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.LOGIN_USER.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"phone\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"mb-3\">\r\n");
      out.write("                                                <label for=\"message-text\" class=\"col-form-label\">Address</label>\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"message-text\" value=\"");
      out.print(a.getAddress());
      out.write("\" name=\"address\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"mb-3\">\r\n");
      out.write("                                                <label for=\"message-text\" class=\"col-form-label\">Email:</label>\r\n");
      out.write("                                                <input type=\"email\" class=\"form-control\" id=\"message-text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.LOGIN_USER.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"email\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"modal-footer\">\r\n");
      out.write("\r\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"recipient-name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.LOGIN_USER.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"username\" hidden=\"\">\r\n");
      out.write("                                            <input type=\"submit\" class=\"btn btn-primary\" value=\"Update\"> \r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<!-- <script src=\"profile/\"></script> -->");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("p");
    _jspx_th_c_set_0.setValue(new String(""));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.LOGIN_USER.photo == null  || sessionScope.LOGIN_USER.photo eq ''}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                <img src=\"./images/uer.png\" alt=\"images/uer.png\">\r\n");
        out.write("                                            ");
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
}
