<!DOCTYPE html>
<html>
<head>
	<title>Тех_Указ</title>
</head>
<body>
<h1>Тех_Указ</h1><hr>
<h4>Подробная информация о документе</h4>
<#list images as img>
	<img src="/images/${img.id}" height="60px"/><br><br>
</#list>
<b>Название товара: </b>${document.title}<br>
<b>Описание товара: </b>${document.description}<br>
<b>Цена: </b>${document.price}<br>
<b>Город: </b>${document.city}<br>
<b>Автор: </b>${document.author}<br>
<hr>
<form action="/document/delete/${document.id}" method="post">
	<input type="submit" value="Удалить товар"/>
</form>
</body>
</html>
<#--<!DOCTYPE html>-->
<#--<html>-->
<#--<head>-->
	<#--<title>tTDoc</title>-->
<#--</head>-->
<#--<body>-->
<#--<h1> Hello, tTDoc!!!</h1><hr>-->
<#--<h4>Данные временного документа</h4>-->
<#--<#list images as img>-->
	<#--<img src="/images/${img.id}" height="60px"/><br><br>-->
<#--</#list>-->

<#--<b>№ Документа: </b>${temptechdoc.numberdocument}<br>-->
<#--<b> Описание: </b>${temptechdoc.description}<br>-->
<#--<b>№ детали: </b>${temptechdoc.id_detail}<br>-->
<#--<b>автор: </b>${temptechdoc.id_author}<br>-->
<#--<b>дата окончания действия: </b>${temptechdoc.validity_period}<br>-->
<#--<b>количество, шт: </b>${temptechdoc.quantity}<br>-->
<#--<b>код отклонения: </b>${temptechdoc.reasoncod}<br><hr>-->

<#--<form action="/temptechdoc/delete/${temptechdoc.id}" method="post">-->
	<#--<input type="submit" value="Удалить!"/>-->
<#--</form>-->
<#--</body>-->
<#--</html>-->
<#--<b>№ Детали: </b>${temptechdoc.id_detail}<br>-->
<#--<b>Шифр Доработки: </b>${temptechdoc.reasonCod}<br>-->
<#--<b>Дата окончания действия (при наличии): </b>${temptechdoc.validityPeriod}<br>-->
<#--<b>количество (при наличии): </b>${temptechdoc.quantity}<br>-->
<#--<b>№ операции: </b>${temptechdoc.numberOperation}<br>-->
<#--<b>Наименование станка: </b>${temptechdoc.nameEquipment}<br>-->
<#--<b>инвентарный № станка:</b>${temptechdoc.inventoryNumber}<br>-->
<#--<b>Тмаш: </b>${temptechdoc.timeMachine}<br>-->
<#--<b>Время операции:  </b>${temptechdoc.timeOperation}<br>-->
<#--<b>разряд работ: </b>${temptechdoc.jobСategory}<br>-->
<#--<b>станочность: </b>${temptechdoc.machineTool}<br>-->
<#--<b>описание: </b>${temptechdoc.description}<br>-->
<#--<b>автор: </b>${temptechdoc.author}<br>-->
