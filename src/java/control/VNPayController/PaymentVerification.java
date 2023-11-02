/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.VNPayController;

import java.io.IOException;
import java.io.PrintWriter;

import dao.PayMentDAO;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Twna21
 */
public class PaymentVerification extends HttpServlet {

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
        String vnp_TxnRef = request.getParameter("vnp_TxnRef").replaceAll("[a-zA-Z]", "");
        int id_TxnRef = Integer.parseInt(vnp_TxnRef);
        String vnp_BankTranNo = request.getParameter("vnp_BankTranNo");
        String vnp_TransactionNo = request.getParameter("vnp_TransactionNo");
        String vnp_ResponseCode = request.getParameter("vnp_ResponseCode");

        HttpSession session = request.getSession();
        PayMentDAO paydao = new PayMentDAO();

        PrintWriter out = response.getWriter();

        try {
            if (vnp_TxnRef != null && Integer.parseInt(vnp_TxnRef) > 0
                    && vnp_BankTranNo != null && vnp_ResponseCode != null && vnp_ResponseCode.equals("00")
                    && vnp_TransactionNo != null && Integer.parseInt(vnp_TransactionNo) > 0) {

                paydao.updateStaus(id_TxnRef, 1);

                response.sendRedirect(request.getContextPath() + "/success");
                return;
            } else {
                paydao.updateStaus(id_TxnRef, 0);
                response.sendRedirect(request.getContextPath() + "/failed");
            }

        } catch (IOException e) {
            System.out.println(e);
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
        processRequest(request, response);
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
        processRequest(request, response);
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