<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Chọn Tỉnh/Thành Phố, Quận/Huyện và Xã/Phường</title>
    </head>
    <body>
        <h1>Chọn Tỉnh/Thành Phố, Quận/Huyện và Xã/Phường</h1>

        <!-- Dropdown tỉnh/thành phố -->
        <div class="mb-3">
            <label for="province" class="form-label">Tỉnh/Thành Phố:</label>
            <select id="province" class="form-select">
                <option value="">Chọn tỉnh/thành phố</option>
            </select>
        </div>

        <!-- Dropdown quận/huyện -->
        <div class="mb-3">
            <label for="district" class="form-label">Quận/Huyện:</label>
            <select id="district" class="form-select">
                <option value="">Chọn quận/huyện</option>
            </select>
        </div>

        <!-- Dropdown xã/ward -->
        <div class="mb-3">
            <label for="ward" class="form-label">Xã/Phường:</label>
            <select id="ward" class="form-select">
                <option value="">Chọn xã/phường</option>
            </select>
        </div>

        
    </body>
</html>
