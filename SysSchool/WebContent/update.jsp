<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Обновление</title>
<link rel="stylesheet" type="text/css" href = "styles/sample.css">
</head>
<body>

	<div id="container">
                        <div id="header">
                        	<center class="header-font">Редактирование </center> 
                        </div>
                        
                          
                        <div id="content">
                        
	                        <div id="buttons">
	                        	<center>
 									<a href="Controller?command=show" class="enjoy-css" >Просмотреть список </a>
									<a href="Controller?command=show&sort=yes" class="enjoy-css" name = "sort" >Отсортировать список </a> 
									<a href="Controller?command=goInsert" class="enjoy-css">Добавить в список</a>
									<a href="Controller?command=goUpdate" class="enjoy-css">Редактирование</a>
								</center>
	                        </div>
                        
 							<div id = "menu" class = "sample-text">
 							
 								<center >
 								 	<form name="main" method = "POST" action="Controller">
									
										Введите id ученика: <br>
										<input type = "hidden" name = "command" value="update"  />
										<input type = "number" name = "id" min="1" value = "" class = "input-css enjoy" required/><br>
										Введите имя:<br>
										<input type = "text" name = "name" value = "" class = "input-css enjoy" required/><br>
										Введите фамилию:<br>
										<input type = "text" name = "surname" value = "" class = "input-css enjoy" required/><br>
										Введите id классa:<br>
										<input type = "number" name = "clas" min="1" max="3"  value = "" class = "input-css enjoy" required/><br>
										Введите оценку по математике:<br>
										<input type = "number" name = "math" min="1" max="10" value = "" class = "input-css enjoy" required/><br>
										Введите оценку по русскому языку:<br>
										<input type = "number" name = "rus" min="1" max="10" value = "" class = "input-css enjoy" required/><br>
										Введите оценку по английскому языку:<br>
										<input type = "number" name = "english" min="1" max="10" value = "" class = "input-css enjoy" required/><br>
										Введите id классного руководителя:<br>
										<input type = "number" name = "id_classhead" min="1" max="3"  value = "" class = "input-css enjoy" required/><br>
										<input type = "submit" value = "Обновить базу" class = "work-buttons enjoy"  /><br>
									</form>
									
									<form name="main" method = "POST" action="Controller">
									Удалить по id<br>
										<input type = "hidden" name = "command" value="delete"  />
										<input type = "number" name = "idDel" value = "" min="1" class = "input-css enjoy" required/><br>
										<input type = "submit" value = "Удалить запись" class = "work-buttons enjoy" /><br>
									</form>
									<a href="Controller?command=home" class = "work-buttons enjoy" >вернуться на главную </a>
								</center>
 							</div>
                        </div>
 
                        <div id="clear">
 
                        </div>
                       
                        <div id="footer">
 								<center class="footer-font">Илья Бассалыго 2015</center>
                        </div>
            </div>

		
			
		
</body>
</html>