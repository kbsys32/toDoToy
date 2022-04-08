<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>To do list </title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<br>
	<div>
		<h2>To Do List</h2>
		<form>
			<div>
				<div >
					<input type="text" placeholder="일정을 추가하세요" id="todo">
				</div>
				<div>
					<button id="btn-todo">일정 추가</button>
				</div>
			</div>
			<c:forEach var="todo"  items="${todolist.content}">
				<br>
				<div>
					<div >
						<p>${todo.createDate.getMonth()+1 }월 ${todo.createDate.getDate() }일</p>
						<div>
						<div>
						<h4 >${todo.todo}</h4>
						</div>
						<div >
						<button onClick="index.deleteById(${todo.id})" >일정 완료</button>
						</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</form>
	</div>
	<script src="/todo.js"></script>
</body>
</html>

