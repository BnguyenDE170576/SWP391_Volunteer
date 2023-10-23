<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Tạo Sự Kiện</title>
        <!-- Sử dụng Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.5.2/dist/css/bootstrap.min.css" rel="stylesheet">

        <style>
            /* Định dạng phần tử form */
            form {
                max-width: 400px;
                margin: 0 auto;
                padding: 20px;
                background-color: #f7f7f7;
                border: 1px solid #ccc;
                border-radius: 5px;
            }

            /* Định dạng phần tử input */
            input[type="text"],
            input[type="date"],
            textarea {
                width: 100%;
                padding: 10px;
                margin-bottom: 10px;
                border: 1px solid #ccc;
                border-radius: 3px;
            }

            /* Định dạng nút submit */
            button[type="submit"] {
                background-color: #007bff;
                color: #fff;
                padding: 10px 20px;
                border: none;
                border-radius: 3px;
                cursor: pointer;
            }

            /* Định dạng nút submit khi rê chuột lên */
            button[type="submit"]:hover {
                background-color: #0056b3;
            }
            h1.display-4 {
                text-align: center; /* Căn giữa nội dung theo chiều ngang */
                margin-top: 20px; /* Tạo khoảng cách từ phía trên */
                margin-bottom: 20px; /* Tạo khoảng cách từ phía dưới */
            }
            select option {
                background-color: #f2f2f2; /* Màu nền */
                color: #333; /* Màu văn bản */
                padding: 5px; /* Khoảng cách bên trong option */
                border: 1px solid #ccc; /* Đường viền */
                border-radius: 4px; /* Góc bo tròn */
            }

            /* Tùy chỉnh màu nền và văn bản cho option khi hover */
            select option:hover {
                background-color: #e0e0e0;
                color: #000;
            }
        </style>

    </head>
    <body>
        <div class="container mt-5 ">
            <h1 class="display-4">Tạo Sự Kiện Mới</h1>

            <form action="ActivityPendingControl" method="post"  onsubmit="return validateForm()">
                <div class="mb-3">
                    <label for="image" class="form-label">Hình ảnh:</label>

                </div>
                <br>
                <div class="mb-3">
                    <label for="activityName" class="form-label">Tên Hoạt Động:</label>
                    <input type="text" class="form-control" id="activityName" name="activityName" required>
                </div>
                <br>
                <div class="mb-3">
                    <label for="startDate" class="form-label">Ngày Bắt Đầu:</label>
                    <input type="date" class="form-control" id="startDate" name="startDate" min="2023-09-01" required>
                </div>
                <br>
                <div class="mb-3">
                    <label for="endDate" class="form-label">Ngày Kết Thúc:</label>
                    <input type="date" class="form-control" id="endDate" name="endDate" min="2023-09-01" required>
                </div>
                <br>
                <div class="mb-3">
                    <label  class="form-label">Số Lượng Thành Viên:</label>
                    <input type="number" class="form-control" id="memberLimit" name="memberLimit" min="1" max="50" required>
                </div>

                <br>
                <div class="mb-3">
                    <label for="province" class="form-label" >Tỉnh/Thành Phố:</label>
                    <select id="province" class="form-select" name="province">
                        <option value="">Chọn tỉnh/thành phố</option>
                    </select>
                </div>
                <br>
                <!-- Dropdown quận/huyện -->
                <div class="mb-3">
                    <label for="district" class="form-label" >Quận/Huyện:    </label>
                    <select id="district" class="form-select" name="district">
                        <option value="">Chọn quận/huyện</option>
                    </select>
                </div>
                <br>
                <!-- Dropdown xã/ward -->
                <div class="mb-3">
                    <label for="ward" class="form-label">Xã/Phường:</label>
                    <select id="ward" class="form-select" name="ward">
                        <option value="">Chọn xã/phường</option>
                    </select>
                </div>

                <br>
                <div class="mb-3">
                    <label for="description" class="form-label">Mô Tả:</label>
                    <textarea class="form-control" id="description" name="description"></textarea>
                </div>

                <!-- Các trường dữ liệu khác -->

                <button type="submit" class="btn btn-primary">Tạo Sự Kiện</button>
            </form>
        </div>

        <!-- Sử dụng Bootstrap JS và jQuery -->
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.5.2/dist/js/bootstrap.min.js"></script>
        <script src="./js/location.js"></script> 

        <script>
                function validateForm() {
                    var activityName = document.getElementById("activityName").value;
                    var startDate = new Date(document.getElementById("startDate").value);
                    var endDate = new Date(document.getElementById("endDate").value);
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
                    if (startDate < currentDate) {
                        alert("Ngày bắt đầu phải lớn hơn hoặc bằng ngày hiện tại.");
                        return false;
                    }

                    if (endDate <= startDate) {
                        alert("Ngày kết thúc phải lớn hơn ngày bắt đầu.");
                        return false;
                    }

                    return true;
                }

        </script>
    </body>
</html>
