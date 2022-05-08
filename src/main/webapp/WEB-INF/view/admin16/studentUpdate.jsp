<%@ page import="com.saraya.model.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: ibrah
  Date: 02/05/2022
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">--%>
    <link rel="stylesheet" href="../../../bootstrap-4.0.0-dist/css/bootstrap.css">
</head>
<body>


<div class="container">
    <div class="row">
        <nav>
            <ul class="nav">
                <li class="nav-item">
                    <a class="nav-link" href="/home/admin16/create">Create</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/home/admin16/list">list</a>
                </li>

            </ul>
        </nav>
    </div>
    <%  Student student = (Student)  request.getAttribute("student");%>
    <% int id = (Integer) request.getAttribute("id"); %>
    <div class="row">
        <div class="col">
            <div class="card">
                <div class="card-header bg-primary text-white">
                    <div class="title"><h1 class=" text-center">Update Student of 16 Month</h1></div>
                </div>
                <div class="card-body">
                    <form action="" method="post">
                        <div class="form-group">
                            <label for="username">firstname:</label>
                            <input type="text" class="form-control" placeholder="Enter firstname" id="username" value="<%= student.getFirstname() %>" name="firstname">
                        </div>
                        <div class="form-group">
                            <label for="lastname">lastname:</label>
                            <input type="text" class="form-control" placeholder="Enter lastname" id="lastname" value="<%= student.getLastname() %>" name="lastname">
                        </div>
                        <div class="form-group">
                            <label for="dateOfBirth">date Of Birth:</label>
                            <input type="date" class="form-control" placeholder="Enter dateOfBirth" id="dateOfBirth" value="<%= student.getDateOfBirth() %>" name="dateOfBirth">
                        </div>
                        <div class="form-group">
                            <label for="registrationDate">registration Date:</label>
                            <input type="date" class="form-control" placeholder="Enter registrationDate" id="registrationDate" value="<%= student.getRegistrationDate() %>" name="registrationDate">
                        </div>
                        <input type="number" value="<%= student.getId() %>" name="id">
                        <button type="submit" class="btn btn-primary">Update</button>
                    </form>
                </div>
            </div>

        </div>
    </div>


</div>
</body>
</html>
