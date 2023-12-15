<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Summary page</title>
</head>
<body>
<h3>Hello ${select.name}, details submitted successfully!!</h3>

<span>Highest Education: </span>
<span>${select.education}</span>
<br>
<span>Subject Selected: </span>
<span>${select.subject}</span>

</body>
</html>