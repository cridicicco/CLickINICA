<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Admin</title>
<!--<c:if test="${!utenteController.utente.admin}">
<meta http-equiv="refresh" content="0;URL=faces/login.jsp">
</c:if>-->
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
						    <li><a href="index.html">Home</a></li>
							<li><a href="faces/services.jsp">Servizi</a></li>
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
<body>
	<div class="section">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					
					<div class="jumbotron">
						<h2>Crea una nuova tipologia d'esame</h2>
						<a href="faces/newTipologiaEsame.jsp" class="btn btn-primary btn-large">Vai</a>
					</div>
					
					<div class="jumbotron">
					<h2>Aggiungi un prerequisito ad una tipologia</h2>
						<a href="faces/newPrerequisito.jsp" class="btn btn-primary btn-large">Vai</a>
					</div>
					
					<div class="jumbotron">
					<h2>Aggiungi un indicatore ad una tipologia</h2>
						<a href="faces/newIndicatore.jsp" class="btn btn-primary btn-large">Vai</a>
					</div>
					
					<div class="jumbotron">
					<h2>Crea una nuovo esame</h2>
						<a href="faces/newEsame.jsp" class="btn btn-primary btn-large">Vai</a>
					</div>
					
					<div class="jumbotron">
					<h2>Aggiungi risultato ad un esame</h2>
						<a href="faces/newRisultato.jsp" class="btn btn-primary btn-large">Vai</a>
					</div>
					
					<div class="jumbotron">
						<h2>Aggiungi un nuovo utente nell'anagrafica</h2>
						<a href="faces/newUtente.jsp" class="btn btn-primary btn-large">Vai</a>
					</div>
					
					<div class="jumbotron">
					
					<h2>Aggiungi un nuovo dottore</h2>
						<a href="faces/newDottore.jsp" class="btn btn-primary btn-large">Vai</a>
					</div>
					<div class="jumbotron">
						<h2>Gestione pazienti</h2>
						<f:view>
							<h:form>
								<div>
									<h:commandButton value="Vai" styleClass="btn btn-lg btn-primary"
									action="#{utenteController.listUtenti}">
								</h:commandButton>
								</div>
							</h:form>
					</div>
					<div class="jumbotron">
						<h2>Gestione dottori</h2>

						<h:form>
							<div>
								<h:commandButton value="Vai" styleClass="btn btn-lg btn-primary"
									action="#{dottoreController.listDottori}">
								</h:commandButton>
							</div>
						</h:form>
						</f:view>
					</div>
				</div>
			</div>
		</div>
</body>
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
			Design by <a href="http://outsidertech.net">Cristian,Matteo,Chiara</a>
		</p>
	</div>
</div>
<!-- /footer -->
</body>
</html>
