<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ano e aniversário</title>
</head>
<body>

	<form action="Concatenar" method="get">
	     Nome: <input type="text" name="nome" size=60 ><br><br>
	     Estado civil: <br><br>
	     <input  type="radio" name=estado_civil value="solteiro(a)" size=15 > Solteiro(a) <br><br>	     
	     <input  type="radio" name=estado_civil value="casado(a)" size=15 > Casado(a) <br><br>
	     <input  type="radio" name=estado_civil value="casado(a)" size=15 > Viúvo(a) <br><br>
	     <input  type="radio" name=estado_civil value="casado(a)" size=15 > Divorciado(a) <br><br>
	     Faixa etária: <br><br> 
	     <input  type="radio" name=faixa_etaria value="3-10" size=15 > 3 a 10 anos <br><br>	     
	     <input  type="radio" name=faixa_etaria value="11-25" size=15 > 11 a 25 anos <br><br>
	     <input  type="radio" name=faixa_etaria value="26-55" size=15 > 26 a 55 anos <br><br>
	     <input  type="radio" name=faixa_etaria value="56-100" size=15 > 56 a 100 anos <br><br>
	     <input type="submit" value="Enviar">
	</form>
</body>
</html>