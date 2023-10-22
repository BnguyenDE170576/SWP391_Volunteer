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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
        String query = "SELECT A. blog_id, A.title, A.content, B.name, A.date,A.category, A.photo,A.shortcontent\n"
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
                String shortcontent =rs.getString(8);
                Blogs blogs = new Blogs(blogsID, title, content, author, date, cate, photo,shortcontent);
                list.add(blogs);
            }
        } catch (Exception e) {
        }

        return list;
    }

    public Blogs getBlogByID(int id) {

        try {
            String query = "  SELECT A. blog_id, A.title, A.content, B.name, A.date,A.category, A.photo, A.shortcontent\n"
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
                Blogs p = new Blogs(blogsID, title, content, author, date, cate, photo,shortcontent);

                return p;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public static void main(String[] args) {
        BlogsDAO a = new BlogsDAO();

        System.out.println("" + a.getBlogByID(1));
    }
}
