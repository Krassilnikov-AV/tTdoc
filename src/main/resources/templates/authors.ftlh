<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>авторы</title>
</head>
<#--<style>-->
<#--input {-->
<#--background: w#FFFFFF; /* Цвет фона */-->
<#--color: #000000; /* Цвет текста */-->
<#--padding: 5px; /* Поля */-->
<#--border: transparent; /* Прячем рамку */-->
<#--width: 200px; /* Ширина поля */-->
<#--}-->
<#--::-webkit-input-placeholder {-->
<#--color: #000000; /* Chrome, Safari, Opera */-->
<#--}-->
<#--::-moz-placeholder {-->
<#--color: #000000; /* Firefox */-->
<#--}-->
<#--:-ms-input-placeholder {-->
<#--color: #000000; /* IE */-->
<#--}-->
<#--</style>-->
<body>
<h1>ТУки</h1><hr>
<h4>Авторы:</h4>
<form action="/authors" method="get">
	Поиск по названию: <input type="text" name="fio" placeholder="имя автора"><br>
	<input type="submit" value="Поиск"/>
</form>
<#list authors as author>
	<div>
		<p><b>${author.fio}</b> | <a href="/author/${author.id}">Подробнее...</a></p>
	</div>
<#else>
	<h3>Авторов нет :( </h3>
</#list>
<hr>
<hr>
<h3>Записать нового атора</h3>
<form action="/author/create" method="post">
	Имя автора: <input type="text" name="fio"/><br><br>
	Отдел автора: <input type="text" name="department"/><br><br>

	<input type="submit" value="Добавить автора"/>
</form>
</body>
</html>
