/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author ytbhe
 */
public class Blogs {

    private int blogId;
    private String title;
    private String content;
    private String author;
    private Date date;
    private String category;

    public Blogs() {
    }

    public Blogs(int blogId, String title, String content, String author, Date date, String category) {
        this.blogId = blogId;
        this.title = title;
        this.content = content;
        this.author = author;
        this.date = date;
        this.category = category;
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Blogs{" + "blogId=" + blogId + ", title=" + title + ", content=" + content + ", author=" + author + ", date=" + date + ", category=" + category + '}';
    }

}
