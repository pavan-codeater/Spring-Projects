
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Hello World the Cookies</h1>


<form:form action="${pageContext.request.contextPath}/logout">

  <input type="submit" value="Logout   ">

</form:form>


</body>
</html>