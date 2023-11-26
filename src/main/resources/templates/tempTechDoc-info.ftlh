<!DOCTYPE html>
<html>
<head>
	<title>tTDoc</title>
</head>
<body>
<h1> Hello, tTDoc!!!</h1><hr>
<h4>Данные временного документа</h4>
<b>№ Документа: </b>${tempTechDoc.numberDocument}<br>
<b>№ Детали: </b>${tempTechDoc.id_detail}<br>
<b>Шифр Доработки: </b>${tempTechDoc.reasonCod}<br>
<#--<b>Дата окончания действия (при наличии): </b>${tempTechDoc.validityPeriod}<br>-->
<b>количество (при наличии): </b>${tempTechDoc.quantity}<br>
<b>№ операции: </b>${tempTechDoc.numberOperation}<br>
<b>Наименование станка: </b>${tempTechDoc.nameEquipment}<br>
<b>инвентарный № станка:</b>${tempTechDoc.inventoryNumber}<br>
<b>Тмаш: </b>${tempTechDoc.timeMachine}<br>
<b>Время операции:  </b>${tempTechDoc.timeOperation}<br>
<b>разряд работ: </b>${tempTechDoc.jobСategory}<br>
<b>станочность: </b>${tempTechDoc.machineTool}<br>
<b>описание: </b>${tempTechDoc.description}<br>
<b>автор: </b>${tempTechDoc.author}<br>
<hr>

<form action="/tempTechDoc/delete/${tempTechDoc.id}" method="post">
	<input type="submit" value="Удалить!"/>
</form>
</body>
</html>