<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">

  .error{color:red}

</style>

</head>
<body>

Fill out the form.

<form:form action="processForm" modelAttribute="customer">

First Name:<form:input path="firstName"/>

<br><br>

Last Name(*):<form:input path="lastName"/>
<form:errors path="lastName" cssClass="error" />
<br><br>


FreePasses:<form:input path="freePasses"/>
<form:errors path="freePasses" cssClass="error"></form:errors>
<br><br>



Postal:<form:input path="postalCode"/>
<form:errors path="postalCode" cssClass="error"></form:errors>


<br><br>
Course Code:<form:input path="courseCode"/>
<form:errors path="courseCode" cssClass="error"></form:errors>



<input type="submit" value="submit"/>

</form:form>


</body>
</html>