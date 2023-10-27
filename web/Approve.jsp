<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Pending Events</title>
        <!-- Import Bootstrap CSS -->
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
        <!-- Import Font Awesome for icons -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

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
        <%@include file="./components/header.jsp" %>
        <div class="container mt-5">
            <h4>Xét duyệt các hoạt động:</h4>
            <hr/><br>
            <div class="list-group">
                <c:forEach items="${pendingEvents}" var="event">
                    <div class="list-group-item d-flex justify-content-between align-items-center"
                         date-eventid="${event.activityId}"
                         data-activityname="${event.getActivityName()}"
                         data-description="${event.description}"
                         data-startdate="${event.startDate}"
                         data-enddate="${event.endDate}"
                         data-memberlimit="${event.numberMember}"
                         data-location="${event.location}">
                        <span class="col-5">${event.activityName}</span>
                        <span class="col-3">${event.location}</span>
                        <span class="col-1">${event.organizerId}</span>
                        <div clas="col-1">
                            <button class="btn btn-link detail-button" data-toggle="modal" data-target="#eventModal">Detail</button>
                        </div>
                        <div clas="col-1">
                            <button class="btn btn-danger" onclick="rejectEvent(${event.activityId}, this, this.nextElementSibling)">Từ chối</button>  
                        </div>
                        <div clas="col-1">
                            <button class="btn btn btn-success" onclick="approveEvent(${event.activityId}, this, this.previousElementSibling)">Xét duyệt</button>
                        </div>

                    </div>
                    <br>
                </c:forEach>
            </div>
        </div>



        <div class="modal fade" id="eventModal" tabindex="-1" role="dialog" aria-labelledby="eventModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="eventModalLabel">Thông Tin Chi Tiết Sự Kiện</h5>
                    </div>
                    <div class="modal-body">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-6">
                                    <h4>Tên Sự Kiện:</h4>
                                    <p id="event-name">Event Name</p>

                                    <h4>Mô Tả:</h4>
                                    <p id="event-description">Event Description</p>

                                    <h4>Ngày Bắt Đầu:</h4>
                                    <p id="event-start-date">Start Date</p>

                                    <h4>Ngày Kết Thúc:</h4>
                                    <p id="event-end-date">End Date</p>
                                </div>
                                <div class="col-md-6">
                                    <h4>Số Lượng:</h4>
                                    <p id="modal-memberLimit">Member Limit</p>

                                    <h4>Địa Điểm:</h4>
                                    <p id="modal-location">Location</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="./js/location.js"></script> 
        <script src="./js/approveEvent.js"></script>    
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
