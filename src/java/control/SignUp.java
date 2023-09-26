/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.AccountDAO;
import dao.Login;
import entity.SendMail;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ytbhe
 */
public class SignUp extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SignUp</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SignUp at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String otp = request.getParameter("otp");

        PrintWriter out = response.getWriter();

        out.print(email);
        out.print(otp);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     *
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        String user = request.getParameter("su_username");
        String pass = request.getParameter("su_password");

        String repass = request.getParameter("repass");
        String email = request.getParameter("email");
        if (!pass.equals(repass)) {
            request.setAttribute("ERROR_MASSEGE", "Account creation failed");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            AccountDAO dao = new AccountDAO();
            boolean a = dao.checkAccountExits(user);
            if (!a) {
                request.setAttribute("ERROR_MASSEGE", "Account creation success. Please check your email to verify your identity");
                Login l = new Login();
                int otp = l.generateOTP(6);
                l.insertOTP(email, otp);
                
                SendMail send = new SendMail();
                String link = "http://localhost:8080/CommunityUnity/signup";
                send.sendEmail(email, otp,link);
                request.getRequestDispatcher("login.jsp").forward(request, response);
                //out.println("<script>alert('Please check your email to verify your identity.');</script>");
            } else {
                //Day ve trang login
                request.setAttribute("ERROR_MASSEGE", "Account already exists");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
