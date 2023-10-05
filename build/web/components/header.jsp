<nav class="navbar navbar-expand-lg navbar-light px-4 px-lg-5 py-3 py-lg-0">
    <a href="" class="navbar-brand p-0">
        <a href ="home"><h1 class="text-primary m-0" ><i class="fa fa-map-marker-alt me-3"></i>Volunteer</h1></a>
        <!-- <img src="img/logo.png" alt="Logo"> -->
    </a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
        <span class="fa fa-bars"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarCollapse">
        <div class="navbar-nav ms-auto py-0">
            <a href="home" class="nav-item nav-link active">Home</a>
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
            <a href="donation.jsp" class="nav-item nav-link">Donation</a>


        </div>

        <c:choose>
            <c:when test="${sessionScope.LOGIN_USER == null}">
                <li class="nav-item">
                    <a href="login.jsp"><i class="fa fa-user"></i></a>
                </li>
            </c:when>
            <c:otherwise>
                <div class="nav-item dropdown"> 
                    <a class="nav-link dropdown-toggle" href="#" id="userDropdown" data-bs-toggle="dropdown">
                        <i class="fa fa-user"></i> 
                    </a>
                    <div class="dropdown-menu m-0">
                        <a class="dropdown-item" href="#">Change Password</a>
                        <a class="dropdown-item" href="./Profile.jsp">View Profile</a>
                        <a class="dropdown-item" href="#">Edit Profile</a>
                        <a class="dropdown-item" href="logout">Log Out</a>
                    </div>
                </div>
            </c:otherwise>
        </c:choose>


    </div>
</nav>