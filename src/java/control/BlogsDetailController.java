/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.AccountDAO;
import dao.BlogsDAO;
import dao.CommentDAO;
import dao.likeDAO;
import entity.Blogs;
import entity.Comment;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ytbhe
 */
public class BlogsDetailController extends HttpServlet {

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
            out.println("<title>Servlet BlogsDetailController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BlogsDetailController at " + "</h1>");
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

        String email = "";
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                String name = cookie.getName();

                if (name.equals("email")) {
                    email = cookie.getValue().trim();
                }
            }

            AccountDAO a = new AccountDAO();
            int userIDLG = a.GetUSERID(a.getUserName_byEmail(email));

            likeDAO l = new likeDAO();
            int id_blogs = Integer.parseInt(request.getParameter("id"));
            BlogsDAO dao = new BlogsDAO();
            Blogs b = dao.getBlogByID(id_blogs);
            int count = l.getToTalLike(id_blogs);
            CommentDAO o = new CommentDAO();
            List<Comment> list = o.getAllComment(id_blogs);
            int countcmt = o.getToTalComment(id_blogs);

            request.setAttribute("userIDLG", userIDLG);
            request.setAttribute("countcmt", countcmt);
            request.setAttribute("comments", list);
            request.setAttribute("blogsdetails", b);
            request.setAttribute("count", count);
            request.getRequestDispatcher("blogsdetails.jsp").forward(request, response);
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        int post_id = Integer.parseInt(request.getParameter("postId"));
        int userId = Integer.parseInt(request.getParameter("userId"));
        int cmtID = Integer.parseInt(request.getParameter("cmtID"));

        CommentDAO dao = new CommentDAO();
        dao.deleteComment(cmtID);
        response.sendRedirect("blogsdetail?id=" + post_id);

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
