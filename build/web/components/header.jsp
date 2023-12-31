<%@page import="dao.AccountDAO" %>
<%@page import="entity.Account" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-expand-lg custom-navbar">
    <a href="" class="navbar-brand p-0">
        <a href="home">
            <h1 class="text-primary m-0"><i class="fa fa-map-marker-alt me-3"></i>Volunteer</h1>
        </a>
    </a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
        <span class="fa fa-bars"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarCollapse">
        <div class="navbar-nav ms-auto py-0">
            <a href="home" class="nav-item nav-link active">Home</a>
            <a href="about.jsp" class="nav-item nav-link">About</a>
            <a href="blogs" class="nav-item nav-link">Blogs</a>
            <c:if test="${sessionScope.LOGIN_USER.role  == 2 || sessionScope.LOGIN_USER.role  == 0}">
                <div class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Activity</a>
                    <div class="dropdown-menu m-0">
                        <a href="./CreateActivity.jsp" class="dropdown-item">Create Activity</a>
                        <a href="booking.html" class="dropdown-item">Manager Activity</a>
                    </div>
                </div>
                <a href="donation.jsp" class="nav-item nav-link">Donation</a>
            </c:if>

        </div>

        <c:choose>
            <c:when test="${sessionScope.LOGIN_USER == null}">
                <li class="nav-item">
                    <a href="login.jsp"><i class="fa fa-user"></i></a>
                </li>
            </c:when>
            <c:otherwise>

                <div class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="userDropdown"
                       data-bs-toggle="dropdown">
                        <img class="rounded-circle-perfect" src="${sessionScope.LOGIN_USER.photo}" alt="">
                        <label
                            class="font-weight-bold text-primary">${sessionScope.LOGIN_USER.userName}</label>
                    </a>

                    <div class="dropdown-menu m-0">
                        <a class="dropdown-item" href="changepass">Reset Password</a>
                        <a class="dropdown-item" href="./Profile.jsp">View Profile</a>
                        <a class="dropdown-item" href="./HistoryControl">View History</a>
                        <c:if test="${ sessionScope.LOGIN_USER.role  == 0}">
                            <a class="dropdown-item" href="admin">Admin</a>
                        </c:if>

                        <a class="dropdown-item" href="logout">Log Out</a>
                    </div>
                </c:otherwise>
            </c:choose>


        </div>

</nav>

<style>
    .rounded-circle-perfect {
        width: 35px;
        height: 35px;
        border-radius: 50%;
        object-fit: cover;
        margin-right: 5px
    }

    .custom-navbar {
        background-color: #333;
        color: #fff;
        padding-right: 1%;
        padding-left: 1%;
    }

    .custom-navbar .navbar-brand {
        color: #fff;
    }

    .custom-navbar .navbar-nav .nav-link {
        color: #fff;
    }
</style>