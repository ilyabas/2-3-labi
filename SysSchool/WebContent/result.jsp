<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Таблица</title>
<link rel="stylesheet" type="text/css" href = "styles/sample.css">
</head>
<body>

	  <div id="container">
                        <div id="header">
                        	<center class="header-font">Список учащихся</center> 
                        </div>
                        
                          
                        <div id="content">
                        
	                        <div id="buttons" >
	                        	<center>
 									<a href="Controller?command=show" class="enjoy-css" >Просмотреть список </a>
									<a href="Controller?command=show&sort=yes" class="enjoy-css" name = "sort" >Отсортировать список </a> 
									<a href="Controller?command=goInsert" class="enjoy-css">Добавить в список</a>
									<a href="Controller?command=goUpdate" class="enjoy-css">Редактирование</a>
								</center>
	                        </div>
                        
 							<div id = "menu2" class="CSSTableGenerator">
 							
 								<center >
 								 		<table border="1">
										<tr>
											<td>ID</td><td>Имя</td><td>Фамилия</td><td>Класс</td><td>Математика</td><td>Русский язык</td><td>Английский язык</td><td>Средний балл</td><td>Классный руководитель</td>
										</tr>
										<c:forEach var="elem" items="${lst}" varStatus="status" >
											<tr>
												<td align="center"><c:out value = "${elem.id}"/> </td>
												<td align="center"><c:out value="${ elem.name }" />  </td> <td align="center"><c:out value="${ elem.surname }" /></td>
												<td align="center"><c:out value="${ elem.clas }" />  </td> <td align="center"><c:out value="${ elem.math }" /></td>
												<td align="center"><c:out value="${ elem.rus }" />  </td> <td align="center"><c:out value="${ elem.english }" /></td>
												<td align="center"><c:out value="${ elem.average }" /></td><td align="center"><c:out value="${ elem.id_classhead }" /></td>
											</tr>
										</c:forEach>
									</table>
									<a href="Controller?command=home" class = "work-buttons enjoy">вернуться на главную</a>
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