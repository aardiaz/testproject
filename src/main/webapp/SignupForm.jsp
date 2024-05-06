<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>signup</title>
</head>
<body>

     <h1> User Login </h1>
           <hr>
            <a href="index.jsp"> back </a>
            
            <form action="SignupServlet" method="post" >
            
                UserName <input type="text" name="fname" > <br><br>
                UserName <input type="text" name="lname" > <br><br>
                UserName <input type="text" name="username" > <br><br>
                Password <input type="password" name="password" > <br><br>
                
                        <input type="submit" name="Signup" > <br><br>
            </form>

</body>
</html>