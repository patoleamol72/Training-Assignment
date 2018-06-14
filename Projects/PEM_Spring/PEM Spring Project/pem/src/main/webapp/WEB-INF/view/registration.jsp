<!DOCTYPE html>
<html lang="en">
<head>
	<title>Registration</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="../static/img/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../static/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../static/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../static/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../static/css/util.css">
	<link rel="stylesheet" type="text/css" href="../static/css/main.css">
<!--===============================================================================================-->
</head>
<body>
	<jsp:include page="./common/header.jsp" />
	<div class="limiter">
		<div class="container-login100" style="background-image: url('images/bg-01.jpg');">
			<div class="wrap-login100 p-t-30 p-b-50">
				<span class="login100-form-title p-b-41">
					Register Account 
				</span>
				<form class="login100-form validate-form p-b-33 p-t-5" action="submitUserRegister.htm" method="post">

					<div class="wrap-input100 validate-input">
						<input class="input100" type="text" name="name" placeholder="User name">
						<span class="focus-input100" data-placeholder="&#xe82a;"></span>
					</div>
					<div class="wrap-input100 validate-input">
						<input class="input100" type="text" name="email" placeholder=" Email Id">
						<span class="focus-input100" data-placeholder="&#xe82a;"></span>
					</div>
					<div class="wrap-input100 validate-input">
						<input class="input100" type="text" name="address" placeholder="Address">
						<span class="focus-input100" data-placeholder="&#xe82a;"></span>
					</div>
					<div class="wrap-input100 validate-input">
						<input class="input100" type="text" name="loginName" placeholder="Login Name">
						<span class="focus-input100" data-placeholder="&#xe82a;"></span>
					</div>

					<div class="wrap-input100 validate-input">
						<input class="input100" type="password" name="password" placeholder="Password">
						<span class="focus-input100" data-placeholder="&#xe80f;"></span>
					</div>

					<div class="container-login100-form-btn m-t-32">
						<button class="login100-form-btn">
							Register
						</button>
					</div>

				</form>
			</div>
		</div>
	</div>
	<jsp:include page="./common/footer.jsp" />

</body>
</html>