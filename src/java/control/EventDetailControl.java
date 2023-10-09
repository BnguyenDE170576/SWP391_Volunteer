/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package control;

import dao.AccountDAO;
import dao.ActivityDAO;
import entity.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author datka
 */
public class EventDetailControl extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException {
        try {
            HttpSession session = request.getSession();
            int eid = Integer.parseInt(request.getParameter("id"));
            ActivityDAO aDAO = new ActivityDAO();
            String name = ((Account) session.getAttribute("LOGIN_USER")).getUserName();
            AccountDAO dao = new AccountDAO();
            int check=0;
            
            if (aDAO.isPendingUserExists(dao.GetUSERID(name),eid)) check=1;
            else if (aDAO.isParticipationExist(dao.GetUSERID(name),eid)) check=2;
            List<Integer> pendinglistid = new ArrayList<>();
            List<UserPending> pendinglist = new ArrayList<>();
            pendinglistid = aDAO.getPendingUserByActivity(eid);
         
            for (int a : pendinglistid){
                Account x = dao.getAnAccountById(a);
                if (x !=null){
                pendinglist.add(new UserPending(x.getUserName(),x.getPhoto(),x.getAccId()));
           
                }
            }
            request.setAttribute("pendinglist", pendinglist);
            request.setAttribute("userID", dao.GetUSERID(name));
            request.setAttribute("check", check);
            request.setAttribute("detail", aDAO.getActivityById(eid));
            request.getRequestDispatcher("EventDetail.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(EventDetailControl.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EventDetailControl.class.getName()).log(Level.SEVERE, null, ex);
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
