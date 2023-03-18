
      <%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Hello World the Cookies</h1>


<p>
  User: <security:authentication property="principal.username" />

<br>

Roles:(s): <security:authentication property="principal.authorities"/>

</p>


<security:authorize access="hasRole('MANAGER')">

<p>

 <a href="${pagecontext.request.contextPath}/leaders">Leadership_Meetings</a>

</p>
</security:authorize>


<security:authorize access="hasRole('ADMIN')">

<p>

 <a href="${pagecontext.request.contextPath}/systems">ADMINS</a>

</p>

</security:authorize>

<form:form action="${pageContext.request.contextPath}/logout">

  <input type="submit" value="Logout   ">

</form:form>


</body>
</html>