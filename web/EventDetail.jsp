<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    </head>

    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-white px-4 px-lg-5">
            <div class="container">
                <a class="navbar-brand" href="home.jsp">
                    <h1 class="text-dark m-0"><i class="fa fa-map-marker-alt me-3"></i>Volunteer</h1>
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarCollapse">
                    <ul class="navbar-nav ms-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="home.jsp">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="about.html">About</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="service.html">Services</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="package.html">Packages</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" data-bs-toggle="dropdown">
                                Pages
                            </a>
                            <div class="dropdown-menu" aria-labelledby="pagesDropdown">
                                <a class="dropdown-item" href="destination.html">Destination</a>
                                <a class="dropdown-item" href="booking.html">Booking</a>
                                <a class="dropdown-item" href="team.html">Travel Guides</a>
                                <a class="dropdown-item" href="testimonial.html">Testimonial</a>
                                <a class="dropdown-item" href="404.html">404 Page</a>
                            </div>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="contact.html">Contact</a>
                        </li>
                        <c:choose>
                            <c:when test="${sessionScope.LOGIN_USER == null}">
                                <li class="nav-item">
                                    <a class="nav-link" href="login.jsp"><i class="fa fa-user"></i></a>
                                </li>
                            </c:when>
                            <c:otherwise>
                                <li class="nav-item">
                                    <a class="nav-link" href="Profile.jsp">
                                        <i class="fa fa-user"></i> ${sessionScope.LOGIN_USER.fullName}
                                    </a>
                                </li>
                            </c:otherwise>
                        </c:choose>
                    </ul>
                </div>
            </div>
        </nav>


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




    </body>

</html>