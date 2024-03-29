<%@ page import="com.saraya.model.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: ibrah
  Date: 06/05/2022
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
    <h2>Student of List</h2>
    <p>The student list for 16 month</p>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Id</th>
            <th>Firstname</th>
            <th>Lastname</th>
            <th>date Of Birth</th>
            <th>registration Date</th>
            <th>training Duration</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <%  List<Student> students = (List<Student>)  request.getAttribute("students");
            if(students!=null){
                for (Student student:students
                ) {%>
        <tr>
            <td><%= student.getId()  %></td>
            <td><%= student.getFirstname() %></td>
            <td><%= student.getLastname() %></td>
            <td><%= student.getDateOfBirth()%></td>
            <td><%= student.getRegistrationDate() %></td>
            <td><%= student.getTrainingDuration() %></td>
            <td>
                <a href="/home/admin16/delete?delete=<%= student.getId() %>" ><button type="button" class="btn btn-danger">delele</button> </a>

                <a href="/home/admin16/update?update=<%= student.getId() %>" ><button type="button" class="btn btn-primary"> update </button></a>

            </td>
        </tr>
        <%
                }
            }
        %>

        </tbody>
    </table>

</div>
</body>
</html>
