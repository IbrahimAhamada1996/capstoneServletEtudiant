<%--
  Created by IntelliJ IDEA.
  User: ibrah
  Date: 02/05/2022
  Time: 01:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
<%--    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">--%>
    <link rel="stylesheet" href="bootstrap-4.0.0-dist/css/bootstrap.css">

</head>
<body>
 <div class="container">
     <form action="" method="post">
         <div class="form-group">
             <label for="username">Username:</label>
             <input type="text" class="form-control" placeholder="Enter username" id="username" name="username">
         </div>
         <div class="form-group">
             <label for="pwd">Password:</label>
             <input type="password" class="form-control" placeholder="Enter password" id="pwd" name="password">
         </div>
         <button type="submit" class="btn btn-primary">Connexion</button>
     </form>
 </div>
</body>
</html>
