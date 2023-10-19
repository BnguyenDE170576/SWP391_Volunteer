<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <meta charset="UTF-8">
<head>
    <!-- Import Bootstrap CSS nếu cần -->
</head>
<body>
    <h1>Thông Tin Hoạt Động</h1>
    <p>Tên Hoạt Động: <c:out value="${sessionScope.activityName}" /></p>
    <p>Mô Tả: <c:out value="${sessionScope.description}" /></p>
    <p>Ngày Bắt Đầu: <c:out value="${sessionScope.startDateStr}" /></p>
    <p>Ngày Kết Thúc: <c:out value="${sessionScope.endDateStr}" /></p>
    <p>Địa Chỉ: <c:out value="${sessionScope.location}" /></p>
    <p>Số Lượng Thành Viên: <c:out value="${sessionScope.memberLimit}" /></p>
</body>
</html>
