<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Utenti</title>
</head>
<body>
<f:view>
<h1>Utenti</h1>
<h:form>
<table>
	<tr>
		<th>Clicca sul risultato per vedere i dettagli</th>
	</tr>
	<c:forEach var="risultato" items="#{risultatoController.risultati}">
		<tr><td>
		<h:commandLink action="#{risultatoController.findRisultato}" value=" #{risultato.nome}" >
		<f:param name="id" value="#{risultato.id}" />
		</h:commandLink>
		
	</c:forEach>
</table>
</h:form>

</f:view>
</body>
</html>