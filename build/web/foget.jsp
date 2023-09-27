<<<<<<< HEAD
<%-- 
    Document   : login2
    Created on : Jul 3, 2023, 5:27:10 PM
    Author     : Twna21
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Volunteer</title>
        <link rel="stylesheet" href="./css/loginCSS.css">
        <script src="./js/checkinput.js"></script>
    </head>

    <body>


        <div class="box login">
            <div class="content">


                <form name="forget" action="forget" method="POST" style="border: 2px">
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
                    Enter your Email.
                      <span id="error_message" style="color: red;  white-space: pre-line;"></span>
                    <input type="email" id="email" name="email" placeholder="abc@gmail.com" onkeyup="checkEmail();">
                    <button type="submit">SUBMIT</button>

                </form>
            </div>
        </div>


        <script src="./js/login.js" type="text/javascript"></script>
    </body>

=======
<%-- 
    Document   : login2
    Created on : Jul 3, 2023, 5:27:10 PM
    Author     : Twna21
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Volunteer</title>
        <link rel="stylesheet" href="./css/loginCSS.css">

    </head>

    <body>


        <div class="box login">
            <div class="content">


                <form action="forget" method="post"id="form">
                    <h4>
                        We will send to mail a you Account! Please input it.
                    </h4>


                    <div class="form_input">
                        <input type="email" name="email" id="name" placeholder="abc@gmail.com" required>

                    </div>
                  

                        <button class="btn submit"  onclick="showAlert()">
                            Send
                        </button>
                        <a href="login.jsp" style="color: black">Back</a>
              


                </form>
            </div>
        </div>


        <script src="./js/login.js" type="text/javascript"></script>
    </body>

>>>>>>> origin/DAT
</html>