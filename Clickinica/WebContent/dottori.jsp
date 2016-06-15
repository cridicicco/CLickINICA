<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Dottori</title>
</head>
<body>
<f:view>
<h1>Dottori</h1>


  
	<div>

<h:form>

	<tr>
		<th>Clicca sul nome del dottore per gestirne i dati</th>
	</tr>
	<br></br>
	<c:forEach var="dottore" items="#{dottoreController.dottori}">
		<tr><td>
		<h:commandLink action="#{dottoreController.findDottore}" value="#{dottore.nome} #{dottore.cognome }">
			<f:param name="id" value="#{dottore.id}" />
			<br></br>
		</h:commandLink>
	</c:forEach>

</h:form>



</f:view>
</body>
</html>





