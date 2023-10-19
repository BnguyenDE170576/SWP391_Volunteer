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
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityDAO {

    private static final String GET_LIST_EVENT_FROM_TO = "select * from ("
            + "select *, ROW_NUMBER() over (order by activity_id) as rownumber from volunteer_activities"
            + ") as activity "
            + "where activity.rownumber >= ? and activity.rownumber <=?";

    private static final String GET_WITH_ID = "SELECT * FROM volunteer_activities WHERE activity_id = ?;";

    private static final String GET_TOTAL_ROWS = "SELECT COUNT(*) FROM volunteer_activities;";
    private static final String GET_PENDING_ACTIVITY = "SELECT * FROM Pending_activity;";
    private static final String SET_PENDING_USER = "INSERT INTO UserPending (UserID, ActivityID) VALUES (?, ?);";
    private static final String CHECK_PENDING_USER = "SELECT COUNT(*) FROM Userpending WHERE UserID = ? AND ActivityID = ?";
    private static final String REMOVE_PENDING_USER = "DELETE FROM Userpending WHERE UserID = ? AND ActivityID = ?";
    private static final String CHECK_PARTICIPATION_EXIST = "SELECT * FROM volunteer_participation WHERE volunteer_id = ? AND activity_id = ?";
    private static final String ADD_PARTICIPATION = "INSERT INTO volunteer_participation (volunteer_id, activity_id, registration_date) VALUES (?, ?, GETDATE())";
    private static final String SELECT_PARTICIPANTS_BY_ACTIVITY = "SELECT volunteer_id FROM volunteer_participation WHERE activity_id = ?";
    private static final String SELECT_USERPENDING_BY_ACTIVITY = "SELECT UserID FROM UserPending WHERE ActivityID = ?";
    private static final String SELECT_ACTIVITIES_BY_USER = "SELECT activity_id FROM volunteer_participation WHERE volunteer_id = ?";
    private static final String CREATE_ACTIVITY = "INSERT INTO volunteer_activities (activity_name, description, start_date, end_date, location, organizer_id, numberMember, created_date, updated_date) VALUES (?, ?, ?, ?, ?, ?, ?, GETDATE(), GETDATE())";
    private static final String CREATE_PENDING_ACTIVITY = "INSERT INTO Pending_activity (activity_name, description, start_date, end_date, location, organizer_id, numberMember, created_date, updated_date) VALUES (?, ?, ?, ?, ?, ?, ?, GETDATE(), GETDATE())";
    private static final String UPDATE_ACTIVITY = "UPDATE volunteer_activities "
            + "SET activity_name = ?, "
            + "description = ?, "
            + "start_date = ?, "
            + "end_date = ?, "
            + "location = ?, "
            + "numberMember = ?, "
            + "updated_date = GETDATE() "
            + // Sử dụng GETDATE() trong SQL Server
            "WHERE activity_id = ?";

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

    public List<VolunteerActivity> getPendingActivity() throws SQLException {
        List<VolunteerActivity> activities = new ArrayList<>();
        Connection conn = null;
        PreparedStatement psm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            psm = conn.prepareStatement(GET_PENDING_ACTIVITY);
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

    public void UpdateActivity(String activityName, String description, Date startDate, Date endDate, String location, int memberLimit) throws SQLException, ClassNotFoundException {
        try ( Connection conn = DBUtils.getConnection();  PreparedStatement psm = conn.prepareStatement(UPDATE_ACTIVITY)) {

            psm.setString(1, activityName);
            psm.setString(2, description);
            psm.setTimestamp(3, new Timestamp(startDate.getTime()));
            psm.setTimestamp(4, new Timestamp(endDate.getTime()));
            psm.setString(5, location);
            psm.setInt(6, memberLimit);
            psm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Xử lý lỗi tại đây
        }
    }

    public void CreateActivity(String activityName, String description, Date startDate, Date endDate, String location, int organizerId, int memberLimit) {
        Connection conn = null;
        PreparedStatement psm = null;

        try {
            conn = DBUtils.getConnection();
            psm = conn.prepareStatement(CREATE_ACTIVITY);
            psm.setString(1, activityName);
            psm.setString(2, description);
            psm.setTimestamp(3, new Timestamp(startDate.getTime()));
            psm.setTimestamp(4, new Timestamp(endDate.getTime()));
            psm.setString(5, location);
            psm.setInt(6, organizerId);
            psm.setInt(7, memberLimit);
            psm.executeUpdate();

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

    }

    public void CreatePendingActivity(String activityName, String description, Date startDate, Date endDate, String location, int organizerId, int memberLimit) {
        Connection conn = null;
        PreparedStatement psm = null;

        try {
            conn = DBUtils.getConnection();
            psm = conn.prepareStatement(CREATE_PENDING_ACTIVITY);
            psm.setString(1, activityName);
            psm.setString(2, description);
            psm.setTimestamp(3, new Timestamp(startDate.getTime()));
            psm.setTimestamp(4, new Timestamp(endDate.getTime()));
            psm.setString(5, location);
            psm.setInt(6, organizerId);
            psm.setInt(7, memberLimit);
            psm.executeUpdate();

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

    }

    public void setPendingUser(int userid, int activityid) throws SQLException {
        Connection conn = null;
        PreparedStatement psm = null;

        try {
            conn = DBUtils.getConnection();
            psm = conn.prepareStatement(SET_PENDING_USER);
            psm.setInt(1, userid);
            psm.setInt(2, activityid);
            psm.executeUpdate();

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

    }

    public boolean isPendingUserExists(int userid, int activityid) throws SQLException {
        Connection conn = null;
        PreparedStatement psm = null;
        ResultSet rs = null;
        boolean exists = false;

        try {
            conn = DBUtils.getConnection();
            psm = conn.prepareStatement(CHECK_PENDING_USER);
            psm.setInt(1, userid);
            psm.setInt(2, activityid);
            rs = psm.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                if (count > 0) {
                    exists = true; // Cặp ID đã tồn tại
                }
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

        return exists;
    }

    public void removePendingUser(int userid, int activityid) throws SQLException {
        Connection conn = null;
        PreparedStatement psm = null;

        try {
            conn = DBUtils.getConnection();
            psm = conn.prepareStatement(REMOVE_PENDING_USER);
            psm.setInt(1, userid);
            psm.setInt(2, activityid);
            psm.executeUpdate();

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
    }

    public boolean isParticipationExist(int volunteerId, int activityId) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement psm = null;
        ResultSet rs = null;

        try {
            conn = DBUtils.getConnection();
            psm = conn.prepareStatement(CHECK_PARTICIPATION_EXIST);
            psm.setInt(1, volunteerId);
            psm.setInt(2, activityId);
            rs = psm.executeQuery();

            return rs.next(); // Nếu có kết quả, tức là cặp ID tồn tại

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
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
    }

    public List<Integer> getPendingUserByActivity(int activityId) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement psm = null;
        ResultSet rs = null;
        List<Integer> pendingUser = new ArrayList<>();

        try {
            conn = DBUtils.getConnection();

            psm = conn.prepareStatement(SELECT_USERPENDING_BY_ACTIVITY);
            psm.setInt(1, activityId);
            rs = psm.executeQuery();

            while (rs.next()) {
                int volunteerId = rs.getInt("UserID");
                pendingUser.add(volunteerId);
            }

        } catch (SQLException e) {
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

        return pendingUser;
    }

    public void addParticipation(int volunteerId, int activityId) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement psm = null;

        try {
            conn = DBUtils.getConnection();
            psm = conn.prepareStatement(ADD_PARTICIPATION);
            psm.setInt(1, volunteerId);
            psm.setInt(2, activityId);
            psm.executeUpdate();

        } catch (SQLException e) {
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
    }

    public List<Integer> getParticipatingUsersByActivity(int activityId) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement psm = null;
        ResultSet rs = null;
        List<Integer> participatingUsers = new ArrayList<>();

        try {
            conn = DBUtils.getConnection();

            psm = conn.prepareStatement(SELECT_PARTICIPANTS_BY_ACTIVITY);
            psm.setInt(1, activityId);
            rs = psm.executeQuery();

            while (rs.next()) {
                int volunteerId = rs.getInt("volunteer_id");
                participatingUsers.add(volunteerId);
            }

        } catch (SQLException e) {
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

        return participatingUsers;
    }

    public List<Integer> getParticipatedActivitiesByUser(int userId) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement psm = null;
        ResultSet rs = null;
        List<Integer> participatedActivities = new ArrayList<>();

        try {
            conn = DBUtils.getConnection();

            psm = conn.prepareStatement(SELECT_ACTIVITIES_BY_USER);
            psm.setInt(1, userId);
            rs = psm.executeQuery();

            while (rs.next()) {
                int activityId = rs.getInt("activity_id");
                participatedActivities.add(activityId);
            }

        } catch (SQLException e) {
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

        return participatedActivities;
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

    public VolunteerActivity getActivityById(int eid) {
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
                activities = activity;
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
