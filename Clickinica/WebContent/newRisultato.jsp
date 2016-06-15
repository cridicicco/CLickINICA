<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Clickinica: Nuovo Risultato</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
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
					<li class="active"><a href="index.html">Home</a></li>
							<li><a href="faces/services.jsp">Services</a></li>
							<li><a href="faces/login.jsp">Log in</a></li>
							<li><a href="faces/newUtente.jsp">Sign in</a></li>
							<li><a href="faces/admin.jsp">Admin</a></li>
				</ul>
			</div>
			<!-- top-nav -->
			<!-- script-for-nav -->
			<script>
						$(document).ready(function(){
							$("span.menu").click(function(){
								$(".top-nav ul").slideToggle(300);
							});
						});
					</script>
			<!-- script-for-nav -->
			<div class="clearfix"></div>
		</div>
	</div>
	<!-- /header -->

	<!-- insertEsame -->
	<div class="section">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<f:view>
						<h:form>
							<div>
								Nome:
								<h:inputText value="#{risultatoController.nome}"
									required="true" requiredMessage="Name is mandatory" id="name" />
								<h:message for="name" />
							</div>
							<div>
								Valore:
								<h:inputText value="#{risultatoController.valore}"
									required="true" requiredMessage="valore is mandatory" id="valore" />
								<h:message for="valore" />
							<div>
								
								<h:commandButton value="Submit"
									action="#{risultatoController.createRisultato}" />
							</div>
							<a href="services.html" /></a>
						</h:form>
					</f:view>
				</div>
			</div>
		</div>
	</div>

	</div>
	<!-- team-grids-caption -->
	<div class="team-grids-caption">
		<div class="container">
			<div class="team-grids-caption-left">
				<h4>La tua Clinica con un click</h4>
				<p>Assistenza 24h su 24</p>
			</div>
			<div class="team-grids-caption-right">
				<a class="team-btn" href="contact.html">Contattaci</a>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<!-- team-grids-caption -->
	<!-- footer -->
	<div class="footer">
		<div class="container">
			<p class="copy-right">
				Design by <a href="http://facebook.com/Matteomandolini">Matteo,Cristian,Chiara</a>
			</p>
		</div>
	</div>
	<!-- /footer -->
</body>
</html>
