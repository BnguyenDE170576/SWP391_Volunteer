package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Volunteer</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/loginCSS.css\">\r\n");
      out.write("        <script src=\"./js/checkinput.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\" id=\"container\">\r\n");
      out.write("            <div class=\"form-container sign-up-container\">\r\n");
      out.write("                <form action=\"signup\" method=\"post\">\r\n");
      out.write("                    <h1>Create Account</h1>\r\n");
      out.write("                    <span id=\"error_message\" style=\"color: red;  white-space: pre-line;\"></span>\r\n");
      out.write("                    <input type=\"text\" id=\"username\" placeholder=\"username\" name=\"su_username\" onkeyup=\"checkUserNAme();lowerCase();\"/>\r\n");
      out.write("                    <input type=\"email\" id=\"email\" name=\"email\" placeholder=\"email\" onkeyup=\"checkEmail();trimInput();\"/>\r\n");
      out.write("                    <input type=\"password\" id=\"newpass\"  name=\"su_password\" placeholder=\"Password\" onkeyup=\"checkStrong();\" />\r\n");
      out.write("                    <input type=\"password\" id =\"repass\" name=\"repass\" placeholder=\"Repeat Password\" onkeyup=\"checkPasswordMatch();\"/>\r\n");
      out.write("\r\n");
      out.write("                    <button class=\"btn btn-dark btn-lg btn-block\" type=\"submit\">SIGN UP</button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-container sign-in-container\">\r\n");
      out.write("                <form action=\"login\" method =\"POST\">\r\n");
      out.write("                    <h1>Sign in</h1>\r\n");
      out.write("                    <div class=\"social-container\">\r\n");
      out.write("                        <a href=\"https://accounts.google.com/o/oauth2/auth?scope=email%20profile%20openid&redirect_uri=http://localhost:8080/CommunityUnity/LoginGoogleController&response_type=code&client_id=552963219492-rlahrheu7p4a3vab2pimmed69atebaeo.apps.googleusercontent.com&approval_prompt=force\" class=\"social\">\r\n");
      out.write("                            <img src=\"./images/OIP.jpg\" style=\"height: 100%;\" alt=\"Image Description\">\r\n");
      out.write("                            <i class=\"fab fa-google\"></i></a>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    <span>or use your account</span>\r\n");
      out.write("                    <span id=\"error_message1\" style=\"color: red;  white-space: pre-line;\"></span>\r\n");
      out.write("                    <input type=\"text\" id=\"username1\" placeholder=\"username\" name=\"username\"/>\r\n");
      out.write("                    <input type=\"password\" placeholder=\"Password\" name=\"password\" />\r\n");
      out.write("                    <a href=\"foget.jsp\">Forgot your password?</a>\r\n");
      out.write("                    <button class=\"btn btn-dark btn-lg btn-block\" type=\"submit\">Login</button>\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"overlay-container\">\r\n");
      out.write("                <div class=\"overlay\">\r\n");
      out.write("                    <div class=\"overlay-panel overlay-left\">\r\n");
      out.write("                        <h1>Welcome Back!</h1>\r\n");
      out.write("                        <p>To keep connected with us please login with your personal info</p>\r\n");
      out.write("                        <button class=\"ghost\" id=\"signIn\">Sign In</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"overlay-panel overlay-right\">\r\n");
      out.write("                        <h1>Hello, Friend!</h1>\r\n");
      out.write("                        <p>Enter your personal details and start journey with us</p>\r\n");
      out.write("                        <button class=\"ghost\" id=\"signUp\">Sign Up</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <footer>    \r\n");
      out.write("        </footer>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"./js/login.js\" type=\"text/javascript\"></script>\r\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty requestScope.ERROR_MASSEGE}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <!-- Error MSG -->\r\n");
        out.write("                        <div class=\"alert alert-danger\" role=\"alert\" style=\"color: red\">\r\n");
        out.write("                            ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.ERROR_MASSEGE}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
        out.write("                        </div>\r\n");
        out.write("                    ");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty requestScope.MSG_SUCCESS}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <!-- Error MSG -->\r\n");
        out.write("                        <div class=\"alert alert-success\" role=\"alert\">\r\n");
        out.write("                            ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.MSG_SUCCESS}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
        out.write("                        </div>\r\n");
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
