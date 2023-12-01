<!DOCTYPE html>
<html>
<head>
	<title>tTDoc</title>
</head>
<body>
<h1> Hello, tTDoc!!!</h1>
<h4>all documents</h4>
<#list tempTechDocs as tempTechDoc>
	<div>
		<p><b>${tempTechDoc.numberDocument}</b> || ${tempTechDoc.id_detail} деталь | <a
					href="/tempTechDoc/${tempTechDoc.id}">Подробнее...</a></p>
	</div>
</#list>

<hr>
<h3>Создать новый Документ</h3>
<form action="/tempTechDoc/create" method="post">
	№ Документа: <input type="text" name="numberDocument"><br><br>
	№ Детали: <input type="number" name="id_detail"><br><br>
	Шифр Доработки: <input type="number" name="reasonCod"><br><br>
	Дата окончания действия (при наличии): <input type="date" name="validityPeriod"><br><br>
	кооличество (при наличии): <input type="number" name="quantity"><br><br>
	№ операции: <input type="number" name="numberOperation"><br><br>
	Наименование станка: <input type="text" name="nameEquipment"><br><br>
	инвентарный № станка: <input type="number" name="inventoryNumber"><br><br>
	Тмаш: <input type="number" name="timeMachine"><br><br>
	Время операции: <input type="number" name="timeOperation"><br><br>
	разряд работ: <input type="number" name="jobСategory"><br><br>
	станочность: <input type="number" name="machineTool"><br><br>
	описание: <input type="text" name="description"><br><br>
	автор: <input type="text" name="author"><br><br>
	<input type="submit" value="добавить ТехДОк"><br><br>
</form>
</body>
</html>