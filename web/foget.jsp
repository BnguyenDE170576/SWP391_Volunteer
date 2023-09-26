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
                Enter your Email.

                <form name="forget" action="forget" method="POST" style="border: 2px">

                    <input type="email" name="email" placeholder="abc@gmail.com">
                    <button type="submit">SUBMIT</button>

                </form>
            </div>
        </div>


        <script src="./js/login.js" type="text/javascript"></script>
    </body>

</html>