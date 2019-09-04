<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로또 프로그램</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<div>
<h1>회원가입</h1>
<form id="consumer_form"action="<%=request.getContextPath()%>/consumer.do">
    ID : <input type="text" name="cid"/><br />
    PASS : <input type="password" name="pass"/><br/>
    <input type="hidden" name="action" value="join"/>
    <input type="hidden" name="dest" value="login" />
    <input type="submit" id="text" value="전 송" />
</form>
</div>
<script>
$('#consumer_form').submit(function() {
    alert('가입 성공');
});
</script>
</body>
</html>
