/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBUtils;
import entity.Payment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ytbhe
 */
public class PayMentDAO {

    private String INSERT_PAY = "insert into Payment values (?,?,?,?,getDATe(),?,?,?)";
    private String Update_STATUS = "update Payment set status=? where payment_id=?";
    private String TOP5_TRANS = "   select  top (5) A.*, B.name, B.photo from Accounts B Join Payment A On A.giverID=b.UserID where A.status=1 ORDER BY A.transaction_date DESC ;";

    public boolean insertPayment(int idPay, int giverID, int receiverID, int eventID, String text, long amount, int status) {
        boolean check = false;
        Connection conn = null;
        PreparedStatement stm = null;

        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                stm = conn.prepareStatement(INSERT_PAY);
                stm.setInt(1, idPay);
                stm.setInt(2, giverID);
                stm.setInt(3, receiverID);
                stm.setInt(4, eventID);

                stm.setString(5, text);
                stm.setLong(6, amount);
                stm.setInt(7, status);

                check = stm.executeUpdate() > 0 ? true : false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return check;
    }

    public boolean updateStaus(int vnp_code, int status) {
        boolean check = false;
        Connection conn = null;
        PreparedStatement stm = null;

        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                stm = conn.prepareStatement(Update_STATUS);

                stm.setInt(1, status);
                stm.setInt(2, vnp_code);

                check = stm.executeUpdate() > 0 ? true : false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {

                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {

                }
            }
        }
        return check;
    }

    public List<Payment> Top5Trans() {
        List<Payment> l = new ArrayList<>();
        Connection conn = null;
        PreparedStatement psm = null;
        ResultSet rs = null;
        Payment o = null;
        try {
            conn = DBUtils.getConnection();
            psm = conn.prepareStatement(TOP5_TRANS);
            rs = psm.executeQuery();

            while (rs.next()) {

                int id = rs.getInt(1);
                int giverID = rs.getInt(2);
                int receiverId = rs.getInt(3);
                int eventID =  rs.getInt(4);
                Date date = rs.getTimestamp(5);
                String text = rs.getString(6);
                long amount = rs.getLong(7);
                int status = rs.getInt(8);
                String photo = rs.getString("photo");
                String name = rs.getString("name");
                o = new Payment(id, giverID, receiverId, eventID, date, text, amount, status, name, photo);
                l.add(o);
            }
             

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (psm != null) {
                try {
                    psm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return l;
    }

    public static void main(String[] args) {
        PayMentDAO e = new PayMentDAO();
        System.out.println("" + e.Top5Trans());

    }
}