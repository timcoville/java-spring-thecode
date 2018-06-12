<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Secret Code</title>
</head>
<body>
	<div id="wrapper">
		<c:out value="${error}"/>
		<h1>What is the code?</h1>
		<form action="/check" method="post">
			<input type="text" name="guess">
			<input type="submit" value="Try Code">
		</form>
	</div>
</body>
</html>