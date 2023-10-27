/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ytbhe
 */
public class PayMentDAO {

    private String INSERT_PAY = "insert into Payment values (?,?,?,?,getDATe(),?,?,?)";
    private String Update_STATUS = "update Payment set status=? where payment_id=?";

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

    public static void main(String[] args) {
        PayMentDAO e = new PayMentDAO();
        e.updateStaus(2, 1);

    }
}
