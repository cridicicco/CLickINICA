<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<title>medical-pluse Website Template | Services :: w3layouts</title>
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
	<!-- Services -->
	<div class="services">
		<div class="container">
			<div class="services-grids">
				<div class="col-md-9 services-left">
					<h1>Our services</h1>
					<div class="services-left-grids">
						<div class="col-md-6 services-left-grid">
							<h3>Analisi del sangue</h3>
							<p>Analisi del sangue e dei leucociti</p>
							<f:view>
								<h:form>
									<div>
										<h:commandButton value="MORE" styleClass="btn btn-lg btn-primary"
											action="#{tipologiaEsameController.findTipologiaEsame}">
											<f:param name="id" value="351" />
										</h:commandButton>
									</div>
								</h:form>
						</div>
						<div class="col-md-6 services-left-grid">
							<h3>Analisi delle urine</h3>
							<p>Anche test per THC</p>

							<h:form>
								<div>
									<h:commandButton value="MORE" styleClass="btn btn-lg btn-primary"
										action="#{tipologiaEsameController.findTipologiaEsame}">
										<f:param name="id" value="352" />
									</h:commandButton>
								</div>
							</h:form>

						</div>
						<div class="col-md-6 services-left-grid">
							<h3>Analisi delle feci</h3>
							<p>Analisi per scoprire infezioni e malattie</p>

							<h:form>
								<div>
									<h:commandButton value="MORE" styleClass="btn btn-lg btn-primary"
										action="#{tipologiaEsameController.findTipologiaEsame}">
										<f:param name="id" value="352" />
									</h:commandButton>
								</div>
							</h:form>

						</div>
						<div class="col-md-6 services-left-grid">
							<h3>Esame oculistico</h3>
							<p>Tieni sotto controllo la tua vista</p>

							<h:form>
								<div>
									<h:commandButton value="MORE" styleClass="btn btn-lg btn-primary"
										action="#{tipologiaEsameController.findTipologiaEsame}">
										<f:param name="id" value="4" />
									</h:commandButton>
								</div>
							</h:form>

						</div>
						<div class="col-md-6 services-left-grid">
							<h3>Esame uditivo</h3>
							<p>Tieni sotto controllo il tuo udito</p>

							<h:form>
								<div>
									<h:commandButton value="MORE" styleClass="btn btn-lg btn-primary"
										action="#{tipologiaEsameController.findTipologiaEsame}">
										<f:param name="id" value="5" />
									</h:commandButton>
								</div>
							</h:form>

						</div>
						<div class="col-md-6 services-left-grid">
							<h3>Tac</h3>
							<p>Come diceva Renato Pozzetto</p>

							<h:form>
								<div>
									<h:commandButton value="MORE" styleClass="btn btn-lg btn-primary"
										action="#{tipologiaEsameController.findTipologiaEsame}">
										<f:param name="id" value="6" />
									</h:commandButton>
								</div>
							</h:form>
							</f:view>
						</div>
						<div class="clearfix"></div>
						<ul class="pagenation">
							<li><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
						</ul>
					</div>
				</div>
				<div class="col-md-3 services-right">
					<h3>Recent-Services</h3>
					<ul>
						<li><a href="#"><span> </span>tortor sit amet molestie
								fringilla</a></li>
						<li><a href="#"><span> </span>packages and web page
								editors</a></li>
						<li><a href="#"><span> </span>desktop publishing packages</a></li>
						<li><a href="#"><span> </span>tweb page editors now use</a></li>
						<li><a href="#"><span> </span>opposed to using Many
								desktop</a></li>
						<li><a href="#"><span> </span>Many desktop publishing</a></li>
						<li><a href="#"><span> </span>packages and web page
								editors</a></li>
						<li><a href="#"><span> </span>desktop publishing packages</a></li>
						<li><a href="#"><span> </span>tweb page editors now use</a></li>
					</ul>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
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
	<!-- Services -->
	<!-- team-grids-caption -->
	<div class="team-grids-caption">
		<div class="container">
			<div class="team-grids-caption-left">
				<h4>He point of using Lorem Ipsum is that</h4>
				<p>as opposed to using Many desktop publishing packages and web
					page editors now use</p>
			</div>
			<div class="team-grids-caption-right">
				<a class="team-btn" href="contact.html">Contact</a>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<!-- team-grids-caption -->
	<!-- footer -->
	<div class="footer">
		<div class="container">
			<p class="copy-right">
				Design by <a href="http://w3layouts.com/">W3layouts</a>
			</p>
		</div>
	</div>
	<!-- /footer -->
</body>
</html>

