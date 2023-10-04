<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="entity.Account" %>
<%@ page import="dao.AccountDAO" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Vounteer</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="" name="keywords">
        <meta content="" name="description">

        <!-- Favicon -->
        <link href="img/favicon.ico" rel="icon">

        <!-- Google Web Fonts -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600&family=Nunito:wght@600;700;800&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
        <!-- Icon Font Stylesheet -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

        <!-- Libraries Stylesheet -->
        <link href="lib/animate/animate.min.css" rel="stylesheet">
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
        <link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

        <!-- Customized Bootstrap Stylesheet -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Template Stylesheet -->
        <link href="css/style.css" rel="stylesheet">


        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

        <style> .navbar-light {
                position: unset;
            }</style>
    </head>

    <body>

        <%@include file="duyettv.jsp" %>
        <%@include file="./components/header.jsp" %>


        <div class="container mt-5">
            <h1 class="display-4">Chi Tiết Hoạt Động</h1>
            <c:if test="${not empty detail}">
                <div class="card">
                    <div class="card-body">
                        <div class="row">
                            <div class="col-md-4">
                                <img src="img/package-1.jpg" alt="Hình ảnh hoạt động" class="img-fluid mb-3">
                            </div>
                            <div class="col-md-8">
                                <h5 class="card-title">${detail.activityName}</h5>                                                           
                                <c:if test="${detail.organizerId == userID}">
                                    <button id="approveButton" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">Xét duyệt</button>  
                                </c:if>
                                <p class="card-text">${detail.description}</p>
                                <p class="card-text"><strong>Ngày Bắt Đầu:</strong> ${detail.startDate}</p>
                                <p class="card-text"><strong>Ngày Kết Thúc:</strong> ${detail.endDate}</p>
                                <p class="card-text"><strong>Địa Điểm:</strong> ${detail.location}</p>
                                <p class="card-text"><strong>Người Tổ Chức ID:</strong> ${detail.organizerId}</p>
                                <p class="card-text"><strong>Số Lượng Thành Viên:</strong> ${detail.numberMember}</p>
                                <p class="card-text"><strong>Ngày Tạo:</strong> ${detail.createdDate}</p>
                                <p class="card-text"><strong>Ngày Cập Nhật:</strong> ${detail.updatedDate}</p>
                                <div class="text-center mt-4">
                                    <button class="btn btn-primary btn-lg">Tham gia</button>
                                    <button class="btn btn-success btn-lg">Donate</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </c:if>
        </div>

        <%@include file="./components/footer.jsp" %>
    </body>

</html>