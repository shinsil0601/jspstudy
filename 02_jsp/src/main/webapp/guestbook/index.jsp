<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	/* function list_go() {
		location.href="/02_jsp/GuestController?cmd=list";  //경로는 /프로젝트이름/파일이름?cmd(실행)=list list는 문자인식
	} */
</script>
</head>
<body>
	<!-- <button onclick="list_go()">리스트</button> -->
	<jsp:forward page="/GuestController">
	<jsp:param value="list" name="cmd"/>
	</jsp:forward>
</body>
</html>