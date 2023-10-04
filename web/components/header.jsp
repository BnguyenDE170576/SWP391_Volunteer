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
            <a href="index.html" class="nav-item nav-link active">Home</a>
            <a href="about.html" class="nav-item nav-link">About</a>
            <a href="service.html" class="nav-item nav-link">Services</a>
            <a href="package.html" class="nav-item nav-link">Packages</a>
            <div class="nav-item dropdown"> 
                <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Activity</a>
                <div class="dropdown-menu m-0">
                    <a href="./CreateActivity.jsp" class="dropdown-item">Create Activity</a>
                    <a href="booking.html" class="dropdown-item">Manager Activity</a>
                </div>
            </div>
            <a href="contact.html" class="nav-item nav-link">Contact</a>


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
                        <a class="dropdown-item" href="#">View Profile</a>
                        <a class="dropdown-item" href="#">Edit Profile</a>
                        <a class="dropdown-item" href="logout.jsp">Log Out</a>
                    </div>
                </div>
            </c:otherwise>
        </c:choose>


    </div>
</nav>