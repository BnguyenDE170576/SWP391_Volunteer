
<%@page import="entity.VolunteerActivity"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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

        <style>
            .navbar-light {
                background-color: black;
            }
            .py-5{
                padding-top: 10rem !important;
            }

            .donation-box .title {
                background-color: #86B817;
            }

            .donation-box .donate-button {
                background-color: #86B817;}

            .donation-box .amount .button {
                background-color: #86B817;
                text-transform: lowercase;

                position: unset;
            }

            .icon-hover:hover {
                border-color: #3b71ca !important;
                background-color: white !important;
                color: #3b71ca !important;
            }

            .icon-hover:hover i {
                color: #3b71ca !important;
            }

        </style>
    </head>

    <body>


        <%@include file="./components/header.jsp" %>

        <!-- content -->
        <div class="container mt-5">

            <h1 class="display-4" style="
                padding-top: 12%;
                ">Chi Tiết Hoạt Động</h1>

            <c:if test="${not empty detail}">
                <section class="py-5">
                    <div class="container">
                        <div class="row gx-5">
                            <aside class="col-lg-6">
                                <div class="border rounded-4 mb-3 d-flex justify-content-center">
                                    <a data-fslightbox="mygalley" class="rounded-4" target="_blank" data-type="image" href="https://bootstrap-ecommerce.com/bootstrap5-ecommerce/images/items/detail1/big.webp">
                                        <img style="max-width: 100%; max-height: 100vh; margin: auto;" class="rounded-4 fit" src="https://bootstrap-ecommerce.com/bootstrap5-ecommerce/images/items/detail1/big.webp" />
                                    </a>
                                </div>
                            </aside>
                            <main class="col-lg-6">
                                <div class="ps-lg-3">
                                    <h4 class="title text-dark">
                                        ${detail.activityName}
                                    </h4>
                                    <h6 class="title text-dark">
                                        ${status}
                                    </h6>

                                    <div class="d-flex flex-row my-3">
                                        <span class="text-muted"></i>${detail.organizerId}</span>
                                    </div>
                                    <div class="row">
                                        <dt class="col-3">Ngày Bắt Đầu:</dt>
                                        <dd class="col-3"><fmt:formatDate value="${detail.startDate}" pattern="yyyy-MM-dd" /></dd>
                                        <dt class="col-3">Ngày Kết Thúc:</dt>
                                        <dd class="col-3"><fmt:formatDate value="${detail.endDate}" pattern="yyyy-MM-dd" /></dd>
                                        <dt class="col-3">Ngày Tạo:</dt>
                                        <dd class="col-3"><fmt:formatDate value="${detail.createdDate}" pattern="yyyy-MM-dd" /></dd>
                                        <dt class="col-3">Ngày Cập Nhật:</dt>
                                        <dd class="col-3"><fmt:formatDate value="${detail.updatedDate}" pattern="yyyy-MM-dd" /></dd>        
                                    </div>
                                    <hr /> 
                                    <p style="word-wrap: break-word;">
                                        ${detail.description}
                                    </p>
                                    <hr /> 
                                    <div class="row">
                                        <dt class="col-4">Địa Điểm:</dt>
                                        <dd class="col-8"> ${detail.location}</dd>
                                        <dt class="col-4">Số Lượng Thành Viên:</dt>
                                        <dd class="col-8">${detail.numberMember}</dd>

                                    </div>
                                    <hr />                                
                                    <div class="text-center mt-4">
                                        <div class="grouptbt" style="display: flex; justify-content: space-between; align-items: center;">
                                            <c:if test="${detail.organizerId == userID}">
                                                <button id="approveButton" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">Xét duyệt</button>  
                                            </c:if>
                                            <form action="donationevent" method="post">
                                                <input type="hidden" value="${detail.organizerId}" name="id">
                                                <button id="donation" class="btn btn-primary btn-lg">Donation</button>  
                                            </form>
                                            <c:if test="${detail.organizerId == userID}">
                                                <button id="editButton" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#editModal">Edit</button>  
                                            </c:if>
                                            <c:if test="${detail.organizerId != userID && check==0}">
                                                <form action="PendingUser" method="POST">
                                                    <input type="hidden" name="activityId" value="${detail.activityId}">
                                                    <input type="hidden" name="userID" value="${userID}">
                                                    <button class="btn btn-primary btn-lg">Tham gia</button>
                                                </form>
                                            </c:if>
                                            <c:if test="${detail.organizerId != userID && check==1}">
                                                <box class="btn btn-primary btn-lg">Đợi xét duyệt</box>
                                                </c:if>
                                                <c:if test="${detail.organizerId != userID && check==2}">
                                                <box class="btn btn-primary btn-lg">Đã Tham gia</box>
                                                </c:if> 
                                        </div>
                                    </div>

                                </div>
                            </main>
                        </div>
                    </div>
                </section>
            </c:if>
        </div>


        <%@include file="./components/footer.jsp" %>
        <div class="modal fade" id="myModal">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Xét duyệt thành viên</h4>
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <div class="modal-body">
                        <!-- Hiển thị danh sách thành viên và các nút từ chối/xét duyệt tại đây -->
                        <ul>
                            <c:forEach var="us" items="${pendinglist}" varStatus="status">    
                                <li>
                                    <span>${us.getUserName()}</span>
                                    <div class="btn-group" role="group">
                                        <button onclick="rejectMember(${us.getId()}, ${detail.activityId}, this, this.nextElementSibling)">Từ chối</button>
                                        <button onclick="approveMember(${us.getId()}, ${detail.activityId}, this, this.previousElementSibling)">Xét duyệt</button>
                                    </div>
                                </li>
                            </c:forEach>   
                        </ul>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-danger" data-dismiss="modal">Đóng</button>
                    </div>
                </div>
            </div>
        </div>

        <div class="modal fade" id="editModal" tabindex="-1" role="dialog" aria-labelledby="editModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="editModalLabel">Edit Activity</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <!-- Nội dung của modal -->

                        <div class="mb-3">
                            <label for="activityName">Activity Name:</label>
                            <input type="text" id="activityName" name="activityName" class="form-control" required value="${detail.activityName}">
                        </div>
                        <div class="mb-3">
                            <label for="description">Description:</label>
                            <textarea id="description" name="description" class="form-control" value="${detail.description}"></textarea>
                        </div>

                        <c:choose>
                            <c:when test="${status == 'Đang diễn ra'}">
                                <div class="mb-3">
                                    <label for="endDateStr">End Date:</label>
                                    <input type="date" id="endDateStr" name="endDateStr" class="form-control" required>
                                    <input type="hidden" name="startDateStr" id="startDateStr" class="form-control" value="${detail.startDate}">
                                </div>
                            </c:when>
                            <c:when test="${status == 'Sắp diễn ra'}">
                                <div class="mb-3">
                                    <label for="startDateStr">Start Date:</label>
                                    <input type="date" id="startDateStr" name="startDateStr" class="form-control" required>
                                </div>
                                <div class="mb-3">
                                    <label for="endDateStr">End Date:</label>
                                    <input type="date" id="endDateStr" name="endDateStr" class="form-control" required>
                                </div>
                                <input type="hidden" name="editcase" class="form-control" value="2">
                            </c:when>          
                        </c:choose>


                        <div class="mb-3">
                            <label for="province" class="form-label" >Tỉnh/Thành Phố:</label>
                            <select id="province" class="form-select" name="province">
                                <option value="">Chọn tỉnh/thành phố</option>
                            </select>
                        </div>
                        <!-- Dropdown quận/huyện -->
                        <div class="mb-3">
                            <label for="district" class="form-label" >Quận/Huyện:    </label>
                            <select id="district" class="form-select" name="district">
                                <option value="">Chọn quận/huyện</option>
                            </select>
                        </div>
                        <!-- Dropdown xã/ward -->
                        <div class="mb-3">
                            <label for="ward" class="form-label">Xã/Phường:</label>
                            <select id="ward" class="form-select" name="ward">
                                <option value="">Chọn xã/phường</option>
                            </select>
                        </div>
                        <div class="mb-3">
                            <label for="memberLimit">Member Limit:</label>
                            <input type="number" id="memberLimit" name="memberLimit" class="form-control" min="1" max="50" required  value="${detail.numberMember}">
                        </div>

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary" onclick="updateActivity()">Save</button>
                    </div>
                </div>
            </div>
        </div>

        <script src="./js/location.js"></script> 
        <script src="./js/BrowserJoin.js"></script>    
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
        <script src="lib/wow/wow.min.js"></script>
        <script src="lib/easing/easing.min.js"></script>
        <script src="lib/waypoints/waypoints.min.js"></script>
        <script src="lib/owlcarousel/owl.carousel.min.js"></script>
        <script src="lib/tempusdominus/js/moment.min.js"></script>
        <script src="lib/tempusdominus/js/moment-timezone.min.js"></script>
        <script src="lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>

        <!-- Template Javascript -->
        <script src="js/main.js"></script>
    </body>

</html>