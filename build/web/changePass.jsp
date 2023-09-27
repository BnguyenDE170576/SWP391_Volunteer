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
 <script>
            function checkPasswordMatch() {
                var newPassword = document.getElementById("new_password").value;
                var confirmNewPassword = document.getElementById("confirm_password").value;
                var errorElement = document.getElementById("error_message");

                if (newPassword !== confirmNewPassword) {
                    errorElement.innerHTML = "New Password and Confirm New Password do not match!";
                } else {
                    errorElement.innerHTML = ""; // Clear the error message if passwords match
                }
            }

            // Attach the checkPasswordMatch function to the "input" event of the "confirm_password" field
            document.getElementById("confirm_password").addEventListener("input", checkPasswordMatch);
        </script>
        <h2>Change Password</h2>
        <form action="changepass" method="post" onkeyup="checkPasswordMatch();">
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
