
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>    
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>    
       
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>My Custom Login Page</h3>

<form:form action="${pageContext.request.contextPath}/authenticateTheUsers" method="POST">


		<c:if test="${param.error !=null }">
		
			<i>Sorry invalid UserName/password</i>
		
		</c:if>
     <p>
     
         UserName: <input type="text" name="username">
         </p>
			
			  <p>
     
         Password : <input type="password" name="password">
         </p>
			
			
	  <input type="submit" value="Login  ">		

</form:form>


</body>
</html>