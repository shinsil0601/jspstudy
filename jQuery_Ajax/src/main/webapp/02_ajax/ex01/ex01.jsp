<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		<%-- XMLHttpRequest 객체 : ajax를 실행할 때 사용하는 객체 --%>
		
		// 1. 객체 생성
		var request = new XMLHttpRequest();
		
		// 2. open("전송방식", "경로", "비동기여부")
		request.open("POST", "data.html", false);
		
		// 3. send() : 실행
		request.send();
		
		// 4. 화면에 출력 : innerHTML, append
		//document.body.append(request.responseText)  => 태그까지 텍스트형태로 불러와진다.
		document.body.innerHTML += request.responseText;
		
	</script>
</body>
</html>