<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Clickinica: Esame</title>
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
	<!-- /container -->
	<!-- about-us -->
	<div class="about">
		<div class="container">
			<div class="about-grids">
				<div class="col-md-9 about-left">
					<f:view>
						
						<h2>Details</h2>
						<div>Tipologia: ${esameController.tipologiaEsame.nome} </div>
						<div>Dottore: ${esameController.dottore.nome} ${esameController.dottore.cognome}</div>
						<div>Paziente: ${esameController.paziente.nome} ${esameController.paziente.cognome}</div>
						<div>Prezzo: ${esameController.tipologiaEsame.prezzo} </div>
				
				   <h2>Vai ai risultati di questo esame</h2>
						<h:form>
								<div>
									<h:commandButton value="Vai" styleClass="btn btn-lg btn-primary"
									action="#{risultatoController.listRisultati}">
									<f:param value="#{esameController.esame.id}"></f:param>
								</h:commandButton>
								</div>
							</h:form>
							
					</f:view>
				</div>
				<div class="col-md-3 about-left">
					<h2>Latest News</h2>
					<!-- news-grid -->
					<div class="news-grid">
						<img src="images/about-pic.jpg" title="name">
					</div>
					<!-- news-grid -->
					<!-- recent-news -->
					<div class="recent-posts">
						<h2>Recent-posts</h2>
						<!-- recent-post-grids -->
						<div class="recent-post-grids">
							<div class="r-post-grid">
								<div class="r-post-grid-left">
									<a href="#"><img src="images/d1.jpg" title="name"></a>
								</div>
								<div class="r-post-grid-right">
									<h4>risus elit dignissim</h4>
									<p>Dolor in commodo rutrum, risus elit dignissim mi,ligula
										eros nec nunc.</p>
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="r-post-grid">
								<div class="r-post-grid-left">
									<a href="#"><img src="images/d2.jpg" title="name"></a>
								</div>
								<div class="r-post-grid-right">
									<h4>risus elit dignissim</h4>
									<p>Dolor in commodo rutrum, risus elit dignissim mi,ligula
										eros nec nunc.</p>
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="r-post-grid">
								<div class="r-post-grid-left">
									<a href="#"><img src="images/d3.jpg" title="name"></a>
								</div>
								<div class="r-post-grid-right">
									<h4>risus elit dignissim</h4>
									<p>Dolor in commodo rutrum, risus elit dignissim mi,ligula
										eros nec nunc.</p>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
						<!-- recent-post-grids -->
					</div>
					<!-- recent-news -->
				</div>
			</div>
		</div>

		<!-- about-us -->
		<!-- team -->
		<div class="team">
			<div class="container">
				<div class="team-head text-center">
					<h3>Our team</h3>
				</div>
				<!-- team-grids -->
				<div class="team-grids">
					<div class="col-md-4">
						<div class="team-grid">
							<div class="team-people">
								<div class="team-people-pic">
									<img src="images/d1.jpg" title="name">
								</div>
								<div class="team-people-info">
									<h3>Established</h3>
									<p>reader will be distracted by the readable</p>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-4">
						<div class="team-grid">
							<div class="team-people">
								<div class="team-people-pic">
									<img src="images/d2.jpg" title="name">
								</div>
								<div class="team-people-info">
									<h3>Established</h3>
									<p>reader will be distracted by the readable</p>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-4">
						<div class="team-grid">
							<div class="team-people">
								<div class="team-people-pic">
									<img src="images/d3.jpg" title="name">
								</div>
								<div class="team-people-info">
									<h3>Established</h3>
									<p>reader will be distracted by the readable</p>
								</div>
							</div>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
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

