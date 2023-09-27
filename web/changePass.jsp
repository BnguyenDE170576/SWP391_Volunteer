<%-- 
    Document   : changePass
    Created on : Sep 27, 2023, 4:40:56 PM
    Author     : ytbhe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Change Password</title>
    </head>
    <body>
        <h2>Change Password</h2>
        <form action="changepass" method="post">
            <c:if test="${not empty requestScope.ERROR_MASSEGE}">
                <!-- Error MSG -->
                <div class="alert alert-danger" role="alert" style="color: red">
                    ${requestScope.ERROR_MASSEGE}
                </div>
            </c:if>
            <c:if test="${not empty requestScope.MSG_SUCCESS}">
                <!-- Error MSG -->
                <div class="alert alert-success" role="alert">
                    ${requestScope.MSG_SUCCESS}
                </div>
            </c:if>
            <label for="new_password">New Password:</label>
            <input type="password" id="new_password" name="new_password" required><br><br>
            <input type="email"  name="email" value="${email}" readonly ><br><br>

            <label for="confirm_password">Confirm New Password:</label>
            <input type="password" id="confirm_password" name="repass" required><br><br>

            <input type="submit" value="Change Password">
        </form>
    </body>
</html>
