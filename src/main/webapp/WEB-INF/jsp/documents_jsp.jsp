<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Добрро пожаловать на страницу создания ТУ</title>
</head>
<body>
<%="This is my JSP page"%>
<%--<h3>Hello ${select.name}, details submitted successfully!!</h3>--%>

<%--@elvariable id="select" type="java"--%>
<%--<form:form action="submit" method="post" >--%>

<%--<hr>--%>
<%--<h3>Создать новое ТУ:</h3>--%>
<%--<form action="/doc/create" method="post" enctype="multipart/form-data" >--%>
  <%--<table>--%>
    <%--<tr>--%>
      <%--<form:form action="submit" method="get" modelAttribute="select">--%>
      <%--<td><form:label path="selectFio">Выберите автора ТУ: </form:label></td>--%>
      <%--<td><form:select id="highestEdu" path="selectFio"--%>
                       <%--items="${authors}" size="2"--%>
                       <%--cssStyle="font-family:monospace" onclick="color()">--%>
      <%--</form:select></td>--%>
      <%--&lt;%&ndash;<tr>&ndash;%&gt;--%>
      <%--&lt;%&ndash;<td><form:button>Submit</form:button></td>&ndash;%&gt;--%>
      <%--&lt;%&ndash;</tr>&ndash;%&gt;--%>
      <%--&lt;%&ndash;<#--начало преобразования-->&ndash;%&gt;--%>
  <%--</table>--%>


  <%--Номер ТУ: <input type="text" name="title"/><br><br>--%>
  <%--Описание ТУ: <input type="text" name="description"/><br><br>--%>
  <%--Цена: <input type="number" name="price"/><br><br>--%>
  <%--Город: <input type="text" name="city"/><br><br>--%>
  <%--Имя: <input type="text" name="author"/><br><br>--%>
    <%--&lt;%&ndash;<#--конец преобразования-->&ndash;%&gt;--%>
  <%--Первая фотография: <input type="file" name="file1"/><br><br>--%>
  <%--Вторая фотография: <input type="file" name="file2"/><br><br>--%>
  <%--Третья фотография: <input type="file" name="file3"/><br><br>--%>

  <%--<input type="submit" value="Добавить ТУ"/>--%>
<%--</form>--%>
<hr>
</body>
</html>