
<!-- Navbar & Hero Start -->
<div class="container-fluid position-relative p-0">
    <nav class="navbar navbar-expand-lg navbar-light px-4 px-lg-5 py-3 py-lg-0">
        <a href="" class="navbar-brand p-0">
            <a href ="home"><h1 class="text-primary m-0" ><i class="fa fa-map-marker-alt me-3"></i>Community Unity</h1></a>

        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
            <span class="fa fa-bars"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <div class="navbar-nav ms-auto py-0">
                <a href="index.html" class="nav-item nav-link active">Home</a>
                <a href="about.html" class="nav-item nav-link">About</a>
                <a href="service.html" class="nav-item nav-link">Services</a>
                <a href="package.html" class="nav-item nav-link">Packages</a>
                <div class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Pages</a>
                    <div class="dropdown-menu m-0">
                        <a href="destination.html" class="dropdown-item">Destination</a>
                        <a href="booking.html" class="dropdown-item">Booking</a>
                        <a href="team.html" class="dropdown-item">Travel Guides</a>
                        <a href="testimonial.html" class="dropdown-item">Testimonial</a>
                        <a href="404.html" class="dropdown-item">404 Page</a>
                    </div>
                </div>
                <a href="logout" class="nav-item nav-link">Logout</a>


            </div>


            <c:if test="${sessionScope.LOGIN_USER == null}">
                <a href="login.jsp"><i style="" class="fa-solid fa-user"></i></a>
                </c:if>
                <c:if test="${sessionScope.LOGIN_USER != null}">
                <a href="Profile.jsp"><i style="" class="fa-solid fa-user"> ${sessionScope.LOGIN_USER.fullName}</i></a>

            </c:if>
        </div>
    </nav>




