<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table {
	width: 600px;
	margin-top: 50px;
	border-collapse: collapse;
}

table, th, td {
	border: 1px solid red;
	text-align: center;
}
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#btn").on("click", function() {
			$("#out").empty();
			$.ajax({
				url: "data04.json",
				method: "get",
				dataType: "json",
				success: function(data) {
					var table = "<table>";
					table += "<thead><tr><th>이름</th><th>카운트</th></tr></thead>";
					table += "<tbody>";
					$.each(data, function(k,v) {
						table += "<tr><td>" + v["name"] + "</td><td>" + v["scope"] + "</td></tr>" 
					});
					table += "</tbody></table>";
					$("#out").append(table);
				},
				error: function() {
					alert("가져오기 실패");
				},
			});
		});
	});
</script>
</head>
<body>
	<div id="btn">json 파일 가져오기</div>
	<div id="out"></div>
</body>
</html>