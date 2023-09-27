<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ano e aniversário</title>
</head>
<body>

	<form action="CalcularIdade" method="get">
	     Ano de nascimento: <input type="number" name="ano" size=15 ><br><br>
	     Já fez aniversário? <br><br>
	     <input  type="radio" name=aniversario value="sim" size=15 > Sim <br><br>	     
	     <input  type="radio" name=aniversario value="não" size=15 > Não <br><br>
	     <input type="submit" value="Enviar">
	</form>
</body>
</html>