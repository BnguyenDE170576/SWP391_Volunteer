<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="entity.Account" %>
<%@ page import="dao.AccountDAO" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Vounteer</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="" name="keywords">
        <meta content="" name="description">

        <!-- Favicon -->
        <link href="img/favicon.ico" rel="icon">

        <!-- Google Web Fonts -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600&family=Nunito:wght@600;700;800&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
        <!-- Icon Font Stylesheet -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

        <!-- Libraries Stylesheet -->
        <link href="lib/animate/animate.min.css" rel="stylesheet">
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
        <link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

        <!-- Customized Bootstrap Stylesheet -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Template Stylesheet -->
        <link href="css/style.css" rel="stylesheet">

        <link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="./css/donationcss.css">
        <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,700italic,400italic' rel='stylesheet'
              type='text/css'>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <style>
            .navbar-light {
                background-color: black;
            }
            .py-5{
                padding-top: 10rem !important;
            }

            .donation-box .title {
                background-color: #86B817;
            }

            .donation-box .donate-button {
                background-color: #86B817;}

            .donation-box .amount .button {
                background-color: #86B817;
                text-transform: lowercase;

            }

        </style>

    </head>

    <body>



        <%@include file="./components/header.jsp" %>
        <!-- About Start -->
        <div class="container-xxl py-5">
            <div class="container">
                <div class="row g-5">
                    <div class="col-lg-6 wow fadeInUp" data-wow-delay="0.1s" style="min-height: 400px;">
                        <div class="position-relative h-100">
                            <img class="img-fluid position-absolute w-100 h-100" src="images/volunteer.jpg" alt="" style="object-fit: cover;">
                        </div>
                    </div>
                    <div class="col-lg-6 wow fadeInUp" data-wow-delay="0.3s">
                        <div class="donation-container">

                            <div class="donation-box">
                                <form id="donationForm" action="donationpage" method="post" onsubmit="return validateDonation()">
                                    <div class="title">Donation Information</div>

                                    <div class="fields">
                                        <input type="text" id="firstName" placeholder="First Name" required> 
                                        <input type="email" id="email" placeholder="Email" required>
                                        <input type="text" name="text" id="text" placeholder="Describe - option">


                                    </div>

                                    <div class="amount">
                                        <div class="button"> <label>
                                                <input type="radio" name="donation" value="50000" checked >50.000đ</label></div>
                                        <div class="button"> <label>
                                                <input type="radio" name="donation" value="100000">100.000đ</label></div>
                                        <div class="button"> <label>
                                                <input type="radio" name="donation" value="200000">200.000đ</label></div>

                                        <div class="button">
                                            <label>
                                                <input type="radio" class="set-amount" name="donation" value="">
                                                <input type="number" name="donation"  id="customAmount" oninput="updateDonationValue(this)" style="width:100%;">
                                            </label>
                                        </div>


                                    </div>


                                    <div class="checkboxes">
                                        <input type="checkbox" id="receipt" class="checkbox" />
                                        <label for="receipt">Email Me A Receipt</label>
                                        <br />
                                        <input type="checkbox" id="anon" class="checkbox" />
                                        <label for="anon">Give Anonymously</label>
                                        <br />
                                        <input type="checkbox" id="list" class="checkbox" />
                                        <label for="list">Add Me To Email List</label>
                                    </div>



                                    <div class="donate-button"><input type="submit" style="background-color: #7beb7b" value="Donate"> </div>
                                </form>
                            </div>

                        </div>

                    </div>
                </div>
            </div>
        </div>
        <!-- About End -->


        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script src="./js/myjs.js"></script>
        <script src="https://raw.githubusercontent.com/jerryluk/jquery.autogrow/master/jquery.autogrow-min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

        <script src="https://raw.githubusercontent.com/jerryluk/jquery.autogrow/master/jquery.autogrow-min.js"></script>
        <script>
            function updateDonationValue(input) {
                // Get the input value
                var customValue = input.value;

                // Find the radio button with class "set-amount"
                var radioButton = document.querySelector('input[type="radio"].set-amount');

                // Update the radio button's value attribute
                if (radioButton) {
                    radioButton.value = customValue;
                }
            }
            
             function validateDonation() {
        var selectedDonation = document.querySelector('input[name="donation"]:checked');
        var customAmountInput = document.getElementById('customAmount');

        // Check if either the radio button is checked or a custom amount is entered
        if (!selectedDonation && customAmountInput.value.trim() === "") {
            alert("Please choose a donation amount or enter a custom amount.");
            return false; // Prevent form submission
        }
        
        // If the "set-amount" radio button is checked, ensure that a custom amount is entered
        if (selectedDonation && selectedDonation.classList.contains("set-amount") && customAmountInput.value.trim() === "") {
            alert("Please enter a custom amount.");
            return false; // Prevent form submission
        }
        
        return true; // Allow form submission
    }
        </script>





        <%@include file="./components/footer.jsp" %>
    </body>

</html>