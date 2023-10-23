/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBUtils;
import entity.Blogs;

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
public class BlogsDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public BlogsDAO() {
        try {
            conn = new DBUtils().getConnection();
        } catch (Exception e) {
        }
    }

    public List<Blogs> getAllBlogs() {
        List<Blogs> list = new ArrayList<>();
        String query = "SELECT A. blog_id, A.title, A.content, B.name, A.date,A.category, A.photo,A.shortcontent,A.pending\n"
                + "FROM Blogs A\n"
                + "JOIN Accounts B ON A.author = B.UserID; ";

        try {
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {

                int blogsID = rs.getInt(1);
                String title = rs.getString(2);
                String content = rs.getString(3);
                String author = rs.getString(4);

                Date date = rs.getDate(5);
                String cate = rs.getString(6);
                String photo = rs.getString(7);
                String shortcontent = rs.getString(8);
                int pending = rs.getInt(9);
                Blogs blogs = new Blogs(blogsID, title, content, author, date, cate, photo, shortcontent, pending);
                list.add(blogs);
            }
        } catch (Exception e) {
        }

        return list;
    }

    public Blogs getBlogByID(int id) {

        try {
            String query = "  SELECT A. blog_id, A.title, A.content, B.name, A.date,A.category, A.photo, A.shortcontent, A.pending\n"
                    + "             FROM Blogs A\n"
                    + "                JOIN Accounts B ON A.author = B.UserID\n"
                    + "				where blog_id = ?; ";
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                int blogsID = rs.getInt(1);
                String title = rs.getString(2);
                String content = rs.getString(3);
                String author = rs.getString(4);

                Date date = rs.getDate(5);
                String cate = rs.getString(6);
                String photo = rs.getString(7);
                String shortcontent = rs.getString(8);
                int pending = rs.getInt(9);
                Blogs p = new Blogs(blogsID, title, content, author, date, cate, photo, shortcontent, pending);

                return p;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public void insertBlogs(String title, String content, String shortContent, int auhorID, String cate, String photo) {
        Connection conn = null;
        PreparedStatement psm = null;

        try {
            try {
                conn = DBUtils.getConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BlogsDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            psm = conn.prepareStatement("INSERT INTO Volunteer.dbo.Blogs VALUES (?,?,?,?,GETDATE(),?,?,0);");
            psm.setString(1, title);
            psm.setString(2, content);
            psm.setString(3, shortContent);
            psm.setInt(4, auhorID);
            psm.setString(5, cate);
            psm.setString(6, photo);
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

    public boolean pendingBlogs(int id_blogs) {
        boolean check = false;
        Connection conn = null;
        PreparedStatement stm = null;

        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                stm = conn.prepareStatement(" UPDATE Blogs\n"
                        + "SET pending = 1\n"
                        + "WHERE blog_id = ?;");

                stm.setInt(1, id_blogs);

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
    public boolean  deleteBlogs(int id_blogs) {
        boolean check = false;
        Connection conn = null;
        PreparedStatement stm = null;

        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                stm = conn.prepareStatement("delete Blogs WHERE blog_id = ?;");

                stm.setInt(1, id_blogs);

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
        BlogsDAO a = new BlogsDAO();

        a.pendingBlogs(3);
    }
}
