<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jtc" %>
<!DOCTYPE html>
<%@ page isELIgnored = "false" %>
<html>
<h2>course information:</h2>
<ul><jtc:forEach var="cou" items="${AL}">
<li><h1>${cou}</h1>
</jtc:forEach>
</ul>
</html>