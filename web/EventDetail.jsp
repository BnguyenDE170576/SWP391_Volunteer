
<%@page import="entity.VolunteerActivity"%>
<%@page import="java.text.SimpleDateFormat"%>
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
                                <p class="card-text"><strong>Status:</strong> ${status}</p>
                                <p class="card-text">${detail.description}</p>
                                <p class="card-text"><strong>Ngày Bắt Đầu:</strong> ${detail.startDate}</p>
                                <p class="card-text"><strong>Ngày Kết Thúc:</strong> ${detail.endDate}</p>
                                <p class="card-text"><strong>Địa Điểm:</strong> ${detail.location}</p>
                                <p class="card-text"><strong>Người Tổ Chức ID:</strong> ${detail.organizerId}</p>
                                <p class="card-text"><strong>Số Lượng Thành Viên:</strong> ${detail.numberMember}</p>
                                <p class="card-text"><strong>Ngày Tạo:</strong> ${detail.createdDate}</p>
                                <p class="card-text"><strong>Ngày Cập Nhật:</strong> ${detail.updatedDate}</p>
                                <div class="text-center mt-4">




                                    <div class="grouptbt" style="
                                         justify-content: space-between;
                                         display: flex;
                                         text-align: center;
                                         ">
                                        <c:if test="${detail.organizerId == userID}">
                                            <button id="approveButton" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">Xét duyệt</button>  
                                        </c:if>
                                        <form action="donationevent" method="post">
                                            <input type="hidden" value="${detail.organizerId}" name="id">
                                            <button id="donation" class="btn btn-primary btn-lg">Donation</button>  
                                        </form>
                                    </div>

                                    <button id="editButton" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#editModal">Edit</button>  

                                    <c:if test="${detail.organizerId != userID && check==0}">
                                        <form action="PendingUser"  method="POST">
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
                    </div>
                </div>
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
                                    <input type="hidden" name="startDateStr" class="form-control" value="${detail.startDate}">
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
                            <label for="location">Location:</label>
                            <input type="text" id="location" name="location" class="form-control" required value="${detail.location}">
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

        <script src="./js/BrowserJoin.js"></script>    
        <script>
                            $(document).ready(function () {
                                $("#myModal").on("click", "button[data-action='reject']", function () {
                                    // Xử lý từ chối thành viên
                                    // Đóng modal sau khi xử lý
                                    $("#myModal").modal("hide");
                                });

                                $("#myModal").on("click", "button[data-action='approve']", function () {
                                    // Xử lý xét duyệt thành viên
                                    // Đóng modal sau khi xử lý
                                    $("#myModal").modal("hide");
                                });
                            });

                            //---------------------------------------------------------------------------
                            function updateActivity() {
                                if (validateForm()) {
                                    var activityName = $("#activityName").val();
                                    var description = $("#description").val();
                                    var startDate = $("#startDateStr").val();
                                    var endDate = $("#endDateStr").val();
                                    var location = $("#location").val();
                                    var memberLimit = $("#memberLimit").val();

                                    var data = {
                                        activityName: activityName,
                                        description: description,
                                        startDate: startDate,
                                        endDate: endDate,
                                        location: location,
                                        memberLimit: memberLimit
                                                // Thêm dữ liệu từ các trường khác
                                    };

                                    $.ajax({
                                        type: "POST",
                                        url: "UpdateActivityControl", //URL của servlet 
                                        data: data,
                                        success: function (response) {
                                            // Xử lý kết quả trả về từ servlet
                                            $("#result").html(response);
                                        },
                                        error: function () {
                                            alert("Đã xảy ra lỗi khi gửi yêu cầu.");
                                        }
                                    });
                                }
                            }
                            document.getElementById("editButton").addEventListener("click", function () {
                                // Hiển thị form chỉnh sửa bằng cách thay đổi thuộc tính style.display
                                document.getElementById("editForm").style.display = "block";
                            });
                            function cancelEdit() {
                                // Ẩn form chỉnh sửa bằng cách thay đổi thuộc tính style.display
                                document.getElementById("editForm").style.display = "none";
                            }
                            //----------------------------------------------------------------
                            function validateForm() {
                                var activityName = document.getElementById("activityName").value;
                                var startDate = new Date(document.getElementById("startDateStr").value);
                                var endDate = new Date(document.getElementById("endDateStr").value);
                                var currentDate = new Date();
                                currentDate.setHours(0, 0, 0, 0);
                                startDate.setHours(0, 0, 0, 0);
                                endDate.setHours(0, 0, 0, 0);
                                // Kiểm tra tên hoạt động
                                if (activityName.length > 70) {
                                    alert("Tên hoạt động không được quá 70 ký tự.");
                                    return false;
                                }

                                // Kiểm tra ngày bắt đầu và ngày kết thúc
                                if (startDate < currentDate && startDate != null) {
                                    alert("Ngày bắt đầu phải lớn hơn hoặc bằng ngày hiện tại.");
                                    return false;
                                }

                                if (endDate <= startDate && startDate != null) {
                                    alert("Ngày kết thúc phải lớn hơn ngày bắt đầu.");
                                    return false;
                                }

                                return true;
                            }
        </script>
    </body>

</html>