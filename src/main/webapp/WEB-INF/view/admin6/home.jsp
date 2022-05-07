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
    <link rel="stylesheet" href="../bootstrap-4.0.0-dist/css/bootstrap.css">
</head>
<body>


<div class="container">
    <div class="row">
        <nav>
            <ul class="nav">
                <li class="nav-item">
                    <a class="nav-link" href="/home/admin6">Create</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/home/admin6/list">list</a>
                </li>

            </ul>
        </nav>
    </div>
    <div class="row">
        <div class="col">
            <div class="card">
                <div class="card-header bg-primary text-white">
                    <div class="title"><h1 class=" text-center">Add Student of 6 Month</h1></div>
                </div>
                <div class="card-body">
                    <form action="" method="get">
                        <div class="form-group">
                            <label for="username">firstname:</label>
                            <input type="text" class="form-control" placeholder="Enter firstname" id="username" name="firstname">
                        </div>
                        <div class="form-group">
                            <label for="lastname">lastname:</label>
                            <input type="text" class="form-control" placeholder="Enter lastname" id="lastname" name="lastname">
                        </div>
                        <div class="form-group">
                            <label for="dateOfBirth">date Of Birth:</label>
                            <input type="date" class="form-control" placeholder="Enter dateOfBirth" id="dateOfBirth" name="dateOfBirth">
                        </div>
                        <div class="form-group">
                            <label for="registrationDate">registration Date:</label>
                            <input type="date" class="form-control" placeholder="Enter registrationDate" id="registrationDate" name="registrationDate">
                        </div>
                        <button type="submit" class="btn btn-primary">Add</button>
                    </form>
                </div>
            </div>

        </div>
    </div>


</div>
</body>
</html>
