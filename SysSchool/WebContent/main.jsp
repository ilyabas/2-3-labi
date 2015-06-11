<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=2">
<title>Main</title>
<link rel="stylesheet" type="text/css" href = "styles/sample.css">
</head>
<body>
	  <div id="container">
                        <div id="header"  >
	                      <center class="header-font">Cистема учёта школьников </center> 
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
                        
 							<div id = "menu3">
 							
 								<center >
 								 	<p><img src="school.jpg" alt="error"></p>
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