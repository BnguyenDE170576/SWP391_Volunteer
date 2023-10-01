/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author datka
 */
import context.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import entity.*;
import java.util.ArrayList;
import java.util.List;

public class ActivityDAO {

    private static final String GET_LIST_EVENT_FROM_TO = "select * from ("
                + "select *, ROW_NUMBER() over (order by activity_id) as rownumber from volunteer_activities"
                + ") as activity "
                + "where activity.rownumber >= ? and activity.rownumber <=?";
    private static final String GET_WITH_ID = "SELECT * FROM volunteer_activities WHERE activity_id = ?;";
    private static final String GET_TOTAL_ROWS = "SELECT COUNT(*) FROM volunteer_activities;";

    public List<VolunteerActivity> getActivityFromTo(int page, int pageSize) throws SQLException {
        int from = page * pageSize - (pageSize - 1);
        int to = page * pageSize;
        List<VolunteerActivity> activities = new ArrayList<>();
        Connection conn = null;
        PreparedStatement psm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            psm = conn.prepareStatement(GET_LIST_EVENT_FROM_TO);
            psm.setInt(1, from);
            psm.setInt(2, to);
            rs = psm.executeQuery();

            while (rs.next()) {
                VolunteerActivity activity = new VolunteerActivity();
                activity.setActivityId(rs.getInt("activity_id"));
                activity.setActivityName(rs.getString("activity_name"));
                activity.setDescription(rs.getString("description"));
                activity.setStartDate(rs.getTimestamp("start_date"));
                activity.setEndDate(rs.getTimestamp("end_date"));
                activity.setLocation(rs.getString("location"));
                activity.setOrganizerId(rs.getInt("organizer_id"));
                activity.setNumberMember(rs.getInt("numberMemBer"));
                activity.setCreatedDate(rs.getTimestamp("created_date"));
                activity.setUpdatedDate(rs.getTimestamp("updated_date"));

                activities.add(activity);
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

        return activities;
    }

    public int getTotalRow() {
        Connection conn = null;
        PreparedStatement psm = null;
        ResultSet rs = null;
        int rowCount = 0;
        try {
            conn = DBUtils.getConnection();
            psm = conn.prepareStatement(GET_TOTAL_ROWS);
            rs = psm.executeQuery();
            if (rs.next()) {
                rowCount = rs.getInt(1);
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
        return rowCount;
    }
    
    public VolunteerActivity getActivityById(int eid){
        VolunteerActivity activities = new VolunteerActivity();
        Connection conn = null;
        PreparedStatement psm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            psm = conn.prepareStatement(GET_WITH_ID);
            psm.setInt(1, eid);
            rs = psm.executeQuery();

            while (rs.next()) {
                VolunteerActivity activity = new VolunteerActivity();
                activity.setActivityId(rs.getInt("activity_id"));
                activity.setActivityName(rs.getString("activity_name"));
                activity.setDescription(rs.getString("description"));
                activity.setStartDate(rs.getTimestamp("start_date"));
                activity.setEndDate(rs.getTimestamp("end_date"));
                activity.setLocation(rs.getString("location"));
                activity.setOrganizerId(rs.getInt("organizer_id"));
                activity.setNumberMember(rs.getInt("numberMemBer"));
                activity.setCreatedDate(rs.getTimestamp("created_date"));
                activity.setUpdatedDate(rs.getTimestamp("updated_date"));
                activities=activity;
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

        return activities;
    }
}
