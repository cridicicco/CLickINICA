<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Clickinica: risultato</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!-- webfonts -->
<link href='http://fonts.googleapis.com/css?family=Arimo:400,700'
	rel='stylesheet' type='text/css'>
<!-- webfonts -->
</head>
<body>
	<!-- container -->
	<!-- header -->
	<div class="header header-border">
		<div class="container">
			<!-- logo -->
			<div class="logo">
				<a href="index.html"><img src="images/logo.png"
					title="medicalpluse" /></a>
			</div>
			<!-- logo -->
			<!-- top-nav -->
			<div class="top-nav">
				<span class="menu"> </span>
				<ul>
					<li><a href="index.html">Home</a></li>
					<li><a href="faces/services.jsp">Services</a></li>
					<li><a href="faces/login.jsp">Log in</a></li>
					<li><a href="faces/newUtente.jsp">Sign in</a></li>
					<li><a href="faces/admin.jsp">Admin</a></li>
				</ul>
			</div>
			<!-- top-nav -->
			<!-- script-for-nav -->
			<script>
				$(document).ready(function() {
					$("span.menu").click(function() {
						$(".top-nav ul").slideToggle(300);
					});
				});
			</script>
			<!-- script-for-nav -->
			<div class="clearfix"></div>
		</div>
	</div>
	<!-- /header -->
	<!-- /container -->
	<!-- about-us -->
	<div class="about">
		<div class="container">
			<div class="about-grids">
				<div class="col-md-9 about-left">
					<f:view>
						<h1>${risultatoController.risultato.nome}</h1>
						<h2>Details</h2>
						<div>Valore: ${risultatoController.risultato.valore}</div>

					</f:view>
				</div>
				
		<!-- team -->
	</div>
	<!-- team-grids-caption -->
	<div class="team-grids-caption">
								<div class="container">
									<div class="team-grids-caption-left">
										<h4>La tua Clinica con un click</h4>
										<p>Al tuo servizio 24h su 24 </p>
									</div>
									<div class="team-grids-caption-right">
										<a class="team-btn" href="sign in.html">Contattaci</a>
									</div>
									<div class="clearfix"> </div>
								</div>
							</div>
		<!-- team-grids-caption -->
		<!-- footer -->
		<div class="footer">
			<div class="container">
				<p class="copy-right">Design by <a href="http://outsidertech.net">Cristian,Chiara,Matteo</a></p>
			</div>
	</div>
	<!-- /footer -->
</body>
</html>

