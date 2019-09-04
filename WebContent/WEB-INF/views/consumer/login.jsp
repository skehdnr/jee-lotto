<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 관리 시스템</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<div>
	<h2>로그인</h2>
<form id ="login_form"action="<%=request.getContextPath()%>/consumer.do?action=login">
        아이디 <input type="text" /> <br/>
        비밀번호 <input type="text" /> <br/>
        <input type="submit" value="전송">

</form>
</div>
</body>
</html>