<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" 
integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" 
crossorigin="anonymous">
</head>
<body>
<div class="container">
<div class="row justify-content-center">
			<div class="col-5 border shadow p-3 mt-4">
				<h1>Login Page</h1>
	<form action="login-check" method="post">
	<input type='text' class="form-control mt-2" placeholder="Enter Username" name="username">
	<input type='password' class="form-control mt-2" placeholder="Enter Password" name="password">
	<input type='submit'  class="btn btn-dark mt-2 w-100" value="Submit">
		</form>
		</div>
	</div>
</div>
</body>
</html>