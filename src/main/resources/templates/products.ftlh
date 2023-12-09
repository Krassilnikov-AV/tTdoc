<!DOCTYPE html>
<html>
<head>
	<title>BUYSELL</title>
</head>
<body>
<h1>BUYSELL</h1><hr>
<h4>Товары со всей России</h4>
<form action="/" method="get">
	Поиск по названию объявления: <input type="text" name="title"><br>
	<input type="submit" value="Поиск"/>
</form>
<#list products as product>
	<div>
		<p><b>${product.title}</b> ${product.price} руб. | <a href="/product/${product.id}">Подробнее...</a></p>
	</div>
<#else>
	<h3>Товаров нет</h3>
</#list>
<hr>
<h3>Создать новый товар</h3>
<form action="/product/create" method="post" enctype="multipart/form-data">
	Название объявления: <input type="text" name="title"/><br><br>
	Описание объявления: <input type="text" name="description"/><br><br>
	Цена: <input type="number" name="price"/><br><br>
	Город: <input type="text" name="city"/><br><br>
	Имя: <input type="text" name="author"/><br><br>
	Первая фотография: <input type="file" name="file1"/><br><br>
	Вторая фотография: <input type="file" name="file2"/><br><br>
	Третья фотография: <input type="file" name="file3"/><br><br>
	<input type="submit" value="Добавить товар"/>
</form>
</body>
</html>

<#--<!DOCTYPE html>-->
<#--<html>-->
<#--<head>-->
	<#--<title>tTDoc</title>-->
<#--</head>-->
<#--<body>-->
<#--<h1> Hello, tTDoc!!!</h1>-->
<#--<h4>all documents</h4>-->
<#--<form action="/" method="get">-->
	<#--Поиск по номеру ТУКа:  <input type="text" name="numberdocument" value="0"><br>-->
	<#--<input type="submit" value="Поиск"/>-->
<#--</form>-->
<#--<#list temptechdocs as temptechdoc>-->
	<#--<div>-->
		<#--<p><b>${temptechdoc.numberdocument}</b> || ${temptechdoc.id} № ТУКа | <a-->
					<#--href="/temptechdoc/${temptechdoc.id}">Подробнее...</a></p>-->
	<#--</div>-->
	<#--<#else>-->
<#--<h3> нет временных документов </h3>-->
<#--</#list>-->

<#--<hr>-->
<#--<h3>Создать новый Документ</h3>-->
<#--<form action="/temptechdoc/create" method="post" enctype="multipart/form-data">-->
	<#--№ Документа: <input type="text" name="numberdocument"><br><br>-->
	<#--описание: <input type="text" name="description"><br><br>-->
	<#--№ Детали: <input type="number" name="id_detail"><br><br>-->

	<#--вставить скан: <input type="file" name="file1"/><br><br>-->
	<#--вставить скан: <input type="file" name="file2"/><br><br>-->
	<#--вставить скан: <input type="file" name="file3"/><br><br>-->
	<#--автор: <input type="number" name="id_author"><br><br>-->
	<#--Дата окончания действия (при наличии): <input type="date" name="validity_period"><br><br>-->
	<#--кооличество (при наличии): <input type="number" name="quantity"><br><br>-->
	<#--Шифр Доработки: <input type="number" name="reasoncod"><br><br>-->

	<#--&lt;#&ndash;№ операции: <input type="number" name="numberOperation"><br><br>&ndash;&gt;-->
	<#--&lt;#&ndash;Наименование станка: <input type="text" name="nameEquipment"><br><br>&ndash;&gt;-->
	<#--&lt;#&ndash;инвентарный № станка: <input type="number" name="inventoryNumber"><br><br>&ndash;&gt;-->
	<#--&lt;#&ndash;Тмаш: <input type="number" name="time_machine"><br><br>&ndash;&gt;-->
	<#--&lt;#&ndash;Время операции: <input type="number" name="timeOperation"><br><br>&ndash;&gt;-->
	<#--&lt;#&ndash;разряд работ: <input type="number" name="jobCategory"><br><br>&ndash;&gt;-->
	<#--&lt;#&ndash;станочность: <input type="number" name="machineTool"><br><br>&ndash;&gt;-->

	<#--<input type="submit" value="добавить ТехДОк"><br><br>-->
<#--</form>-->
<#--</body>-->
<#--</html>-->