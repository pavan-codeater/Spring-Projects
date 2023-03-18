
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>

<title>Customer Confirmatino</title>
</head>
<body>
  
  
  the Customer :${customer.firstName} ${customer.lastName};
  
  
  Freepasses is :${customer.freePasses};
  
  <br>
  <hr>
  
  postalCode:${customer.postalCode};
  
  
  <br>
  <hr>
  
  courseCode:${customer.courseCode};
  
  
  
  
  
</body>
</html>