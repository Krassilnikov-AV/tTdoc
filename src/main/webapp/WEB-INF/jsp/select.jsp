<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Welcome Page</title>
</head>
<body>
<h1>Welcome to GeeksforGeeks!</h1>

<form:form action="submit" method="post" modelAttribute="select">
  <table>
    <tr>
      <td><form:label path="name">Enter your name: </form:label></td>
      <td><form:input path="name" /></td>
    </tr>
    <tr>
      <td><form:label path="education">Select your highest education: </form:label></td>
      <td><form:select id="highestEdu" path="education"
                       items="${educationDetails}" size="2"
                       cssStyle="font-family:monospace" onclick="color()">
      </form:select></td>
    <tr>
      <td><form:label path="subject">Select the subject: </form:label></td>
      <td><form:select path="subject" title="SUBJECT" multiple="true"
                       size="3">
        <form:option value="Java" label="Java Programming" />
        <form:option value="SQL" label="SQL language" />
        <form:option value="Python" label="Python programming" />
        <form:option value="JavaScript" label="JavaScript" />
        <form:option value="PHP" label="PHP" />
      </form:select></td>
    </tr>
    <tr>
      <td><form:button>Submit</form:button></td>
    </tr>
  </table>
</form:form>
<script type="text/javascript">

  function color(){
    document.getElementById("highestEdu").style.backgroundColor = "palegreen";
  }


</script>
</body>
</html>
