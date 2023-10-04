/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.internet.ParseException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author datka
 */
@WebServlet(name = "CreateActivityControl", urlPatterns = {"/CreateActivityControl"})
public class CreateActivityControl extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CreateActivityControl</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CreateActivityControl at " + request.getContextPath() + "</h1>");
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
        // Lấy dữ liệu từ biểu mẫu
        String eventName = request.getParameter("event_name");
        String description = request.getParameter("description");
        String startDateStr = request.getParameter("start_date");
        String endDateStr = request.getParameter("end_date");

        // Chuyển đổi ngày tháng từ chuỗi thành đối tượng Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = null;
        try {
            startDate = dateFormat.parse(startDateStr);
        } catch (java.text.ParseException ex) {
            Logger.getLogger(CreateActivityControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date endDate = null;
        try {
            endDate = dateFormat.parse(endDateStr);
        } catch (java.text.ParseException ex) {
            Logger.getLogger(CreateActivityControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Lấy ngày hiện tại
        Date currentDate = new Date();
        // Kiểm tra tính hợp lệ của ngày bắt đầu và ngày kết thúc
        if (startDate.before(currentDate)) {
            // Ngày bắt đầu bé hơn ngày hiện tại, xử lý lỗi hoặc thông báo
            response.sendRedirect("error.jsp"); // Thay "error.jsp" bằng trang lỗi của bạn
        } else if (endDate.before(startDate)) {
            // Ngày kết thúc bé hơn ngày bắt đầu, xử lý lỗi hoặc thông báo
            response.sendRedirect("error.jsp"); // Thay "error.jsp" bằng trang lỗi của bạn
        } else {
            // Tạo sự kiện và lưu vào cơ sở dữ liệu (hoặc xử lý tùy ý)
            // ...
            
            // Sau khi xử lý thành công, chuyển hướng đến trang thành công hoặc trang danh sách sự kiện
            response.sendRedirect("home"); // Thay "success.jsp" bằng trang thành công của bạn
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
