<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Tạo Sự Kiện</title>
        <!-- Sử dụng Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.5.2/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container mt-5">
            <h1 class="display-4">Tạo Sự Kiện Mới</h1>

            <form action="CreateActivityControl" method="post" onsubmit="return validateForm()">
                <div class="mb-3">
                    <label for="image" class="form-label">Hình ảnh:</label>
                    <input type="file" class="form-control" id="image" name="image" accept="image/*">
                </div>
                <div class="mb-3">
                    <label for="activityName" class="form-label">Tên Hoạt Động:</label>
                    <input type="text" class="form-control" id="activityName" name="activityName" required>
                </div>

                <div class="mb-3">
                    <label for="startDate" class="form-label">Ngày Bắt Đầu:</label>
                    <input type="date" class="form-control" id="startDate" name="startDate" min="2023-09-01" required>
                </div>

                <div class="mb-3">
                    <label for="endDate" class="form-label">Ngày Kết Thúc:</label>
                    <input type="date" class="form-control" id="endDate" name="endDate" min="2023-09-01" required>
                </div>
                <div class="mb-3">
                    <label for="location" class="form-label">Địa Chỉ:</label>
                    <input type="text" class="form-control" id="autocomplete" name="location" placeholder="Tìm kiếm địa chỉ" required>
                </div>

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
                if (activityName.length > 50) {
                    alert("Tên hoạt động không được quá 50 ký tự.");
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
