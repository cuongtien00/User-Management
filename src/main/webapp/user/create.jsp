<%--
  Created by IntelliJ IDEA.
  User: Phong Vu
  Date: 11/10/2021
  Time: 10:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Management Application</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="/users">List All Users</a>
    </h2>
</center>
<div align="center" style="width: 500px;height: 300px;margin-left: 500px">
    <form method="post">
        <table class="table table-dark table-striped" border="1" cellpadding="5">
            <caption>
                <h2 class="text-center">Add New User</h2>
            </caption>
            <tr>
                <td>User Name:</td>
                <td><input type="text" name="name" id="name" size="45"></td>
            </tr>
            <tr>
                <td>User Email:</td>
                <td><input type="text" name="email" id="email" size="45"></td>
            </tr>
            <tr>
                <td>Country:</td>
                <td><input type="text" name="country" id="country" size="15"></td>
            </tr>
            <tr>
                <td>Type</td>
                <td>
                    <select name="type">
                    <c:forEach items="${typeList}" var="t">
                        <option value="${t.id}">${t.name}</option>
                    </c:forEach>
                    </select>
                </td>
            </tr>

            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>

            </tr>

        </table>
    </form>

</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
        integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
        integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
        crossorigin="anonymous"></script>

</body>
</html>
