<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="../resources/css/login-style.scss">
    <link rel="shortcut icon" type="image/x-icon" href="../resources/files/pics/logo.png">
    <script src="../resources/js/login-js.js"></script>
    <title>Login Page</title>
</head>
<body>
<header><h1>Nura bank</h1></header>
<main>
    <section>
        <div class="container">
            <div class="login">
                <p class="title"><span>Login to your Account</span></p>
                <form name="f" action="/login-process" method="post">
                    <label for="username">Username</label>
                    <input type="text" id="username" name="username" required/>
                    <label for="password">Password</label>
                    <input type="password" id="password" name="password" required/>
                    <button type="submit">Login</button>
                </form>
                <p class="password">
                    <span><a href="forget.html">Forget password</a></span>
                </p>
                <p class="create">
              <span
              >Want to Create an Account?
                <a href="/signup">Click here</a></span
              >
                </p>
            </div>
        </div>
    </section>
</main>
</body>
</html>
