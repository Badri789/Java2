<%--
  Created by IntelliJ IDEA.
  User: badri
  Date: 24.03.21
  Time: 00:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Animal</title>
</head>
<body>
<form action="animal-register" method="post" style="display: flex; flex-direction: column; width: 50%">
    <label>
        <input type="text" name="name" placeholder="Enter name...">
    </label>
    <label>
        <input type="text" name="breed" placeholder="Enter breed...">
    </label>
    <label>
        <input type="text" name="gender" placeholder="Enter gender...">
    </label>
    <label>
        <input type="text" name="age" placeholder="Enter age...">
    </label>
    <input type="submit" value="Register"/>
</form>
</body>
</html>
