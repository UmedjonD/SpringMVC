<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored ="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>registaration</title>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>

</head>
<body>
    <div class="contener">
    <div class="digblocform">
    <div class="myform">
        <form action="" name="registration"><br></br>

            <input type="text" name="firstname" id="firstname" placeholder="Введите имя"/>
            <br><br>
            <input type="text" name="lastname" id="lastname" placeholder="Введите фамилию"/>
            <br><br>
            <input type="text" width="100px" name="email" placeholder="izhevsk@epam.com"/>
            <br><br>
            <input type="text" width="100px" name="password" placeholder="Введите пароль"/>
            <br><br>
            <input type="text" width="100px" name="password2" placeholder="Повторить пароль"/>
            <br><br>
            <div class="knopka1">
                <button type="submit">Зарегистрироваться</button>
            </div>
        </form>
    </div>
    </div>
    </div>

</body>
<script src="js/jquery.min.js"></script>
<script src="js/jquery.validate.min.js"></script>
<script src="js/script.js"></script>
</html>