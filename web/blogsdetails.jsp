<%-- 
    Document   : single
    Created on : Oct 19, 2023, 5:07:37 PM
    Author     : ytbhe
--%><%@page import="dao.AccountDAO"%>
<%@page import="entity.Account"%>
<%@page import="entity.Account"%>
<%@page import="entity.Blogs"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html class="no-js" lang="en">
    <head>

        <!--- basic page needs
        ================================================== -->
        <meta charset="utf-8">
        <title>Blog Single - Keep It Simple</title>
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- mobile specific metas
        ================================================== -->
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- CSS
        ================================================== -->
        <link rel="stylesheet" href="./BlogsComponent/css/base.css">
        <link rel="stylesheet" href="./BlogsComponent/css/main.css">

        <!-- script
        ================================================== -->
        <script src="./BlogsComponent/js/modernizr.js"></script>
        <script defer src="./BlogsComponent/js/fontawesome/all.min.js"></script>

        <!-- favicons
        ================================================== -->
        <link rel="apple-touch-icon" sizes="180x180" href="apple-touch-icon.png">
        <link rel="icon" type="image/png" sizes="32x32" href="favicon-32x32.png">
        <link rel="icon" type="image/png" sizes="16x16" href="favicon-16x16.png">
        <link rel="manifest" href="site.webmanifest">

    </head>

    <body id="top" class="ss-single">


        <!-- Header
        ================================================== -->
        <header class="s-header">

            <div class="row">

                <div class="s-header__content column">
                    <h1 class="s-header__logotext">
                        <a href="index.html" title="">Keep It Simple.</a>
                    </h1>
                    <p class="s-header__tagline">Put your awesome tagline here.</p>
                </div>

            </div> <!-- end row -->

            <nav class="s-header__nav-wrap">

                <div class="row">

                    <ul class="s-header__nav">
                        <li><a href="home">Home</a></li>

                        <li><a href="donation.jsp">Donation</a></li>	
                        <li><a href="archives.html">Activity</a></li>
                        <li class="has-children current"><a href="#0">Blog</a>
                            <ul>
                                <li><a href="blogs">Blog Entries</a></li>

                            </ul>
                        </li>

                    </ul> <!-- end #nav -->

                </div> 

            </nav> <!-- end #nav-wrap -->

            <a class="header-menu-toggle" href="#0" title="Menu"><span>Menu</span></a>

        </header> <!-- Header End -->



        <!-- Content
        ================================================== -->

        <%
            String name = ((Account) session.getAttribute("LOGIN_USER")).getUserName();
            Account a = new Account();
            AccountDAO dao = new AccountDAO();

            a = dao.getAccount_BYUSER(name);
            int userID = a.getAccId();


        %>
        <div class="s-content">

            <div class="row">

                <div id="main" class="s-content__main large-8 column">
                    <c:set var="p" value="${blogsdetails}"/>


                    <article class="entry">
                        <c:if test="${blogsdetails != null}">
                            <header class="entry__header">

                                <h2 class="entry__title h1">
                                    <a href=title=""><h2>${p.title}</h2></a>
                                </h2>

                                <div class="entry__meta">
                                    <ul>
                                        <li>${p.date}</li>
                                        <li><a href="#" title="" rel="category tag">Ghost</a></li>
                                        <li>${p.author}</li>
                                    </ul>
                                </div>

                            </header> <!-- entry__header -->

                            <div class="entry__content-media">
                                <img src=${p.photo}" 
                                     srcset="${p.photo} 1000w, 
                                     ${p.photo} 500w" 
                                     sizes="(max-width: 1000px) 100vw, 1000px" alt="null">
                            </div>

                            <div class="entry__content">
                                <p>
                                    ${p.content}
                                </p>

                            </div> <!-- entry__content -->

                        </c:if>

                        <p class="entry__tags">
                            <span>Tagged in </span>:
                            <a href="#0">orci</a>, <a href="#0">lectus</a>, <a href="#0">varius</a>, <a href="#0">turpis</a>
                        </p>

                        <ul class="entry__post-nav h-group">
                            <li class="prev"><a rel="prev" href="#0"><strong class="h6">Previous Article</strong> Duis Sed Odio Sit Amet Nibh Vulputate</a></li>
                            <li class="next"><a rel="next" href="#0"><strong class="h6">Next Article</strong> Morbi Elit Consequat Ipsum</a></li>
                        </ul>

                    </article> <!-- end entry -->

                    <form action="LikeServlet" method="post">

                        <input type="hidden" name="postId" value="${p.blogId}">

                        <input type="hidden" name="userId" value="<%=userID%>">

                        <button type="submit" name="action" value="Like">

                            <i class="fa fa-thumbs-up"></i> ${count}

                        </button>

                        <button id="commentButton" type="button" name="action" value="Comment">
                            <i class="fa fa-comment"></i> ${countcmt}
                        </button>


                    </form>



                    <div class="comments-wrap">

                        <div id="comments">

                            <h3>${countcmt} Comments</h3>

                            <!-- START commentlist -->

                            <ol class="commentlist">

                                <li class="depth-1 comment">
                                    <c:forEach var="o" items="${comments}">
                                        <div class="comment__avatar">
                                            <img class="avatar" src="${o.photoUser}" alt="./BlogsComponent/images/avatars/user-01.jpg" width="50" height="50">
                                        </div>

                                        <div class="comment__content">

                                            <div class="comment__info">


                                                <div class="comment__author">${o.commentAuthorName}</div>

                                                <div class="comment__meta">
                                                    <div class="comment__time">${o.commentDate}</div>

                                                </div>
                                            </div>

                                            <div class="comment__text">
                                                <p>${o.commentContent} </p>
                                                <c:if test="${o.commentAuthorId == userIDLG}">
                                                    <!-- Show the delete comment button here -->

                                                    <form action="blogsdetail" method="post" style="  text-align: end;">
                                                        <div class="a" style="
                                                             display: flex;
                                                             padding-left: 265px;
                                                             flex-wrap: wrap-reverse;
                                                             ">
                                                            <div class="b"> Delete comment </div>
                                                            <input type="hidden" name="postId" value="${p.blogId}">

                                                            <input type="hidden" name="userId" value="<%=userID%>">
                                                            <input type="hidden" name="cmtID" value="${o.commentId}">

                                                            <input type="submit" value="Delete Comment" style="
                                                                   height: 23px;
                                                                   padding: 8px;
                                                                   width: 5px;
                                                                   justify-content: center;
                                                                   font-size: 3px;
                                                                   text-align: start;
                                                                   ">
                                                            </form>
                                                        </c:if>
                                                    </div>







                                            </div>

                                        </c:forEach>

                                </li> <!-- end comment level 1 -->



                            </ol>

                            <!-- END commentlist -->

                        </div> <!-- end comments -->

                        <div class="comment-respond">

                            <!-- START respond -->
                            <div id="respond">

                                <h3>Add Comment <span>Your email address will not be published</span></h3>

                                <form name="contactForm" id="contactForm" method="post" action="BlogsComment" autocomplete="off">
                                    <fieldset>



                                        <div class="message form-field">
                                            <textarea name="cMessage" id="cMessage" class="h-full-width" placeholder="Your Message"></textarea>
                                            <input type="hidden" name="postId" value="${p.blogId}">

                                            <input type="hidden" name="userId" value="<%=userID%>">
                                        </div>

                                        <input name="submit" id="submit" class="btn btn--primary btn-wide btn--large h-full-width" value="Add Comment" type="submit">

                                    </fieldset>
                                </form> <!-- end form -->

                            </div>
                            <!-- END respond-->

                        </div> <!-- end comment-respond -->

                    </div> <!-- end comments-wrap -->

                </div> <!-- end main -->


                <div id="sidebar" class="s-content__sidebar large-4 column">

                    <div class="widget widget--search">
                        <h3 class="h6">Search</h3> 
                        <form action="#0">
                            <input type="text" value="Search here..." onblur="if (this.value == '') {
                                        this.value = 'Search here...';
                                    }" onfocus="if (this.value == 'Search here...') {
                                                this.value = '';
                                            }" class="text-search">
                            <input type="submit" value="" class="submit-search">
                        </form>
                    </div>

                    <div class="widget widget--categories">
                        <h3 class="h6">Categories.</h3> 
                        <ul>
                            <li><a href="#0" title="">Wordpress</a> (2)</li>
                            <li><a href="#0" title="">Ghost</a> (14)</li>
                            <li><a href="#0" title="">Joomla</a> (5)</li>
                            <li><a href="#0" title="">Drupal</a> (3)</li>
                            <li><a href="#0" title="">Magento</a> (2)</li>
                            <li><a href="#0" title="">Uncategorized</a> (9)</li>
                        </ul>
                    </div>

                    <div class="widget widget_text group">
                        <h3 class="h6">Widget Text.</h3>

                        <p>
                            Lorem ipsum Ullamco commodo laboris sit dolore commodo aliquip incididunt fugiat esse dolor 
                            aute fugiat minim eiusmod do velit labore fugiat officia ad sit culpa labore in consectetur 
                            sint cillum sint consectetur voluptate adipisicing Duis irure magna ut sit amet reprehenderit.
                        </p>
                    </div>

                    <div class="widget widget_tags">
                        <h3 class="h6">Post Tags.</h3>

                        <div class="tagcloud group">
                            <a href="#0">Corporate</a>
                            <a href="#0">Onepage</a>
                            <a href="#0">Agency</a>
                            <a href="#0">Multipurpose</a>
                            <a href="#0">Blog</a>
                            <a href="#0">Landing Page</a>
                            <a href="#0">Resume</a>
                        </div>
                    </div>

                    <div class="widget widget_popular">
                        <h3 class="h6">Popular Post.</h3>

                        <ul class="link-list">
                            <li><a href="#0">Sint cillum consectetur voluptate.</a></li>
                            <li><a href="#0">Lorem ipsum Ullamco commodo.</a></li>
                            <li><a href="#0">Fugiat minim eiusmod do.</a></li>
                        </ul>
                    </div>

                </div> <!-- end sidebar -->

            </div> <!-- end row -->

        </div> <!-- end content-wrap -->


        <!-- Footer
        ================================================== -->
        <footer class="s-footer">

            <div class="row s-footer__top">
                <div class="column">
                    <ul class="s-footer__social">
                        <li><a href="#0"><i class="fab fa-facebook-f" aria-hidden="true"></i></a></li>
                        <li><a href="#0"><i class="fab fa-twitter" aria-hidden="true"></i></a></li>
                        <li><a href="#0"><i class="fab fa-youtube" aria-hidden="true"></i></a></li>
                        <li><a href="#0"><i class="fab fa-vimeo-v" aria-hidden="true"></i></a></li>
                        <li><a href="#0"><i class="fab fa-instagram" aria-hidden="true"></i></a></li>
                        <li><a href="#0"><i class="fab fa-linkedin" aria-hidden="true"></i></a></li>
                        <li><a href="#0"><i class="fab fa-skype" aria-hidden="true"></i></a></li>
                    </ul>
                </div>
            </div> <!-- end footer__top -->

            <div class="row s-footer__bottom">

                <div class="large-6 tab-full column s-footer__info">
                    <h3 class="h6">About Keep It Simple</h3>

                    <p>
                        Lorem ipsum Ullamco commodo laboris sit dolore commodo aliquip incididunt fugiat esse dolor 
                        aute fugiat minim eiusmod do velit labore fugiat officia ad sit culpa labore in consectetur 
                        sint cillum sint consectetur voluptate adipisicing Duis
                    </p>

                    <p>
                        Lorem ipsum Sed nulla deserunt voluptate elit occaecat culpa cupidatat sit irure sint 
                        sint incididunt cupidatat esse in Ut sed commodo tempor consequat culpa fugiat incididunt.
                    </p>
                </div>

                <div class="large-6 tab-full column">
                    <div class="row">
                        <div class="large-8 tab-full column">

                            <h3 class="h6">Photostream</h3>

                            <ul class="photostream group">
                                <li><a href="#0"><img alt="thumbnail" src="images/thumb.jpg"></a></li>
                                <li><a href="#0"><img alt="thumbnail" src="images/thumb.jpg"></a></li>
                                <li><a href="#0"><img alt="thumbnail" src="images/thumb.jpg"></a></li>
                                <li><a href="#0"><img alt="thumbnail" src="images/thumb.jpg"></a></li>
                                <li><a href="#0"><img alt="thumbnail" src="images/thumb.jpg"></a></li>
                                <li><a href="#0"><img alt="thumbnail" src="images/thumb.jpg"></a></li>
                                <li><a href="#0"><img alt="thumbnail" src="images/thumb.jpg"></a></li>
                                <li><a href="#0"><img alt="thumbnail" src="images/thumb.jpg"></a></li>
                            </ul>

                        </div>

                        <div class="large-4 tab-full column">
                            <h3  class="h6">Navigate</h3>

                            <ul class="s-footer__list s-footer-list--nav group">
                                <li><a href="#0">Home</a></li>
                                <li><a href="#0">Blog</a></li>
                                <li><a href="#0">Demo</a></li>
                                <li><a href="#0">Archives</a></li>
                                <li><a href="#0">About</a></li>
                            </ul>
                        </div>
                    </div>
                </div>

                <div class="ss-copyright">
                    <span>© Copyright Keep It Simple 2019</span> 
                    <span>Design by <a href="https://www.styleshout.com/">StyleShout</a></span>
                </div>

            </div> <!-- end footer__bottom -->


            <div class="ss-go-top">
                <a class="smoothscroll" title="Back to Top" href="#top">
                    <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"><path d="M12 0l8 9h-6v15h-4v-15h-6z"/></svg>
                </a>
            </div> <!-- end ss-go-top -->

        </footer> <!-- end Footer-->


        <!-- Java Script
         ================================================== -->
        <script src="./BlogsComponent/js/jquery-3.2.1.min.js"></script>
        <script src="./BlogsComponent/js/main.js"></script>



    </body>

</html>