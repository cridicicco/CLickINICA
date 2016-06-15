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
		<th>Clicca sul nome del paziente per gestirne i dati</th>
	</tr>
	<c:forEach var="utente" items="#{utenteController.utenti}">
		<tr><td>
		<h:commandLink action="#{utenteController.findUtente}" value=" #{utente.nome} #{utente.cognome}" >
		<f:param name="id" value="#{utente.id}" />
		</h:commandLink>
		
	</c:forEach>
</table>
</h:form>

</f:view>
</body>
</html>