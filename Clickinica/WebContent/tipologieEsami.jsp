<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Clickinica: Tipologie Esami</title>
</head>
<body>
<f:view>
<h1>Tipologie Esami</h1>
<h:form>
<table>
	<tr>
		<th>Name</th><th>Price</th>
	</tr>
	<c:forEach var="tipologiaEsame" items="#{tipologiaEsameController.tipologieEsami}">
		<tr><td>
		<h:commandLink action="#{tipologiaEsameController.findTipologiaEsame}" value="#{tipologiaEsame.name}">
			<f:param name="id" value="#{tipologiaEsame.id}" />
		</h:commandLink>
		</td><td>prezzo:${tipologiaEsame.price}, id:${tipologiaEsame.id}</td></tr>
	</c:forEach>
</table>
</h:form>

</f:view>
</body>
</html>