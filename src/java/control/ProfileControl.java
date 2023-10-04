package control;

import dao.AccountDAO;

import entity.Account;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author twna21
 */
public class ProfileControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String Username = request.getParameter("username");
        AccountDAO data = new AccountDAO();
        Account a = data.getAccount_BYUSER(Username);
        request.setAttribute("LOGIN_USER", a);
        request.getRequestDispatcher("Profile.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        Lấy thông tin muốn cập nhật từ JSP xuống
        request.setCharacterEncoding("UTF-8");
        String user = request.getParameter("username");

        String name = request.getParameter("name");
        String address = request.getParameter("address");
//        String birthday = request.getParameter("birthday");
        String phone = request.getParameter("phone");

        String email = request.getParameter("email");

        AccountDAO data = new AccountDAO();
//        Lấy UserID khi muốn cập nhật UserInfor sẽ chính xác hơn
        int userID = data.GetUSERID(user);
//     

//        Cập nhật information có UserID trên
        data.updateACCOUNT(userID, phone, address, name, email);
        //dao.updateACCOUNT(4,"1234","085989589", "2003-12-2", "FPT", "Manh Tuong", "E@gmail.com");

        Account a = data.getAccount_BYUSER(user);
        request.setAttribute("LOGIN_USER", a);
        request.getRequestDispatcher("Profile.jsp").forward(request, response);

    }
}
