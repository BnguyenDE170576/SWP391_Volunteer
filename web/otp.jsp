<%-- 
    Document   : otp
    Created on : Sep 22, 2023, 7:47:44 PM
    Author     : ytbhe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Enter OTP</title>
        <style>
            /* Add some CSS for styling the countdown timer */
            #countdown {
                font-size: 24px;
                font-weight: bold;
                color: red;
            }
        </style>
    </head>
    <body>
        <h1>Enter OTP</h1>
        <p>Please enter the OTP sent to your email address.</p>
        <div id="countdown">60</div>

        <script>
            // JavaScript to create the countdown timer
            var countdown = 60; // Set the initial countdown time in seconds
            var countdownDisplay = document.getElementById("countdown");

            function updateCountdown() {
                countdown -= 1;
                countdownDisplay.textContent = countdown;

                if (countdown <= 0) {
                    countdownDisplay.textContent = "OTP had expired ";
                    clearInterval(interval);
                }
            }

            // Update the countdown every 1000 milliseconds (1 second)
            var interval = setInterval(updateCountdown, 1000);
        </script>
        <form action="forget" method="get">
            <label for="otp">OTP:</label>

            <input type="text" id="otp" name="otp" required>
            <input type="text" id="email" name="email" value="${email}" >
            <br><br>

            <button type="submit">Verify OTP</button>
        </form>
    </body>
</html>