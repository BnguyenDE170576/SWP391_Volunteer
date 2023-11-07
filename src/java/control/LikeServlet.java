/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.AccountDAO;
import dao.BlogsDAO;
import dao.CommentDAO;
import dao.NotificateDAO;
import dao.likeDAO;
import entity.Account;
import entity.Blogs;
import entity.Comment;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static org.apache.coyote.http11.Constants.a;

/**
 *
 * @author ytbhe
 */
public class LikeServlet extends HttpServlet {

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
            out.println("<title>Servlet LikeServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LikeServlet at " + request.getContextPath() + "</h1>");
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the action (Like or Unlike)

  
            HttpSession session = request.getSession();
            
            int userIDLG = ((Account) session.getAttribute("LOGIN_USER")).getAccId();
             AccountDAO a = new AccountDAO();

            String action = request.getParameter("action");
            likeDAO l = new likeDAO();

            // Get the user ID and post ID from the request
            int userId = Integer.parseInt(request.getParameter("userId"));
            int postId = Integer.parseInt(request.getParameter("postId"));
            int receiver = 0;
            BlogsDAO blog = new BlogsDAO();
            for(Blogs b : blog.getAllBlogs()){
                if(b.getBlogId() == postId){
                    receiver = a.GetUSERID_byfullname(b.getAuthor());
                    break;
                    
                }
            }
            // Your logic to handle liking or unliking the post
            if ("Like".equals(action)) {
                if (l.checkValid(userId, postId)) {
                    l.deleteLikePost(userId, postId);
                } else {
                    l.insertAccount(userId, postId);
                    NotificateDAO noti = new NotificateDAO();
                    Date date = new Date();
  
                    try {
                        noti.addNotification(receiver , "You Received 1 Like From  "+a.GetUserName(userId), date, "blogsdetail?id="+postId, userIDLG);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(LikeServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            
                
            }

            // Redirect back to the post.jsp page after processing
            int count = l.getToTalLike(postId);

            BlogsDAO dao = new BlogsDAO();
            Blogs b = dao.getBlogByID(postId);
            CommentDAO o = new CommentDAO();
            List<Comment> list = o.getAllComment(postId);

            int countcmt = o.getToTalComment(postId);
            request.setAttribute("userIDLG", userIDLG);
            request.setAttribute("countcmt", countcmt);
            request.setAttribute("comments", list);
            request.setAttribute("blogsdetails", b);
            request.setAttribute("blogsdetails", b);
            request.setAttribute("count", count);
            request.setAttribute("id", postId);

            request.getRequestDispatcher("blogsdetails.jsp").forward(request, response);
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
