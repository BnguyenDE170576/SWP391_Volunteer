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
</head>
<body>
    <div class="container mt-5">
        <h1 class="mb-4">Pending Events</h1>
        <div class="list-group">
            <c:forEach items="${pendingEvents}" var="event">
                <a href="#" class="list-group-item list-group-item-action">
                    <div class="d-flex w-100 justify-content-between">
                        <h5 class="mb-1">${event.activityName}</h5>
                        <small>Status: Pending</small>
                    </div>
                    <p class="mb-1">${event.description}</p>
                    <p class="mb-1">Start Date: ${event.startDate}</p>
                    <p class="mb-1">End Date: ${event.endDate}</p>
                    <p class="mb-1">Location: ${event.location}</p>
                    <div class="text-right">
                        <a href="#" class="btn btn-success btn-sm mr-2"><i class="fas fa-check"></i> Approve</a>
                        <a href="#" class="btn btn-danger btn-sm"><i class="fas fa-times"></i> Reject</a>
                    </div>
                </a>
            </c:forEach>
        </div>
    </div>
</body>
</html>
