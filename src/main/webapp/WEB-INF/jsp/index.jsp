<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored ="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>autorization</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css"/>
    <script src="script.js"></script>

</head>
<body>
    <p>
        <%=  new java.util.Date() %>
    </p>
    <div class="contener">
    <div class="digblocform">
    <div class="myform">

        <form action="login" method="post"><br><br>
            Введите email:<br>
            <input type="text" name="login">
            <br>
            Введите пароль:<br>
            <input type="password" name="password">
            <br><br>
             <input type="submit" name="vhod" placeholder="Вход">
            <!-- <input type="button" value="Вход" id="vhod1" onclick="myFunction3()"/>-->
            <br><br>
            <input type="button" value="Зарегистрироваться" onclick="javascript:window.location='registration'">
            <br>
            <br><br>
        </form>

    </div>
    </div>
    </div>

</body>
</html>