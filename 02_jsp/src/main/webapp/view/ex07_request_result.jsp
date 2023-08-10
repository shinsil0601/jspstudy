<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>로그인 결과 페이지</h2>
	<%  //Model파일에 있는 결과값이 숫자
	// request.getAttribute 결과값이 나올땐 Object로 나오므로 형변환 하자
		int result = (int)request.getAttribute("logInChk");
	
		if(result == 1){ // 성공
			out.println("<h2>로그인 성공</h2>");
		} else if(result == 0){ // 실패
			/* out.println("<h2>로그인 실패</h2>"); */%>
			<script type="text/javascript">
				alert("로그인 실패 아이디와 비밀번호가 다름");
				// 다시 로그인 창으로 이동 방법 1 (창이동)
				//location.href="view/ex07_request_input.jsp";
				// 다시 로그인 창으로 이동 방법 2 (뒤로가기)
				history.go(-1)
			</script>
		<%}
	%>
</body>
</html>