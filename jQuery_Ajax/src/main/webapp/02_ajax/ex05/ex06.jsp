<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{width: 800px; margin: 0 auto; border-collapse: collapse;}
	table, th, td { border: 1px solid gray; text-align: center;}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript" src="/js/jquery.ajax-cross-origin.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#btn1").click(function() {
			$("#out").empty();
			$.ajax({
				crossOrigin : true,
				url:"http://www.kma.go.kr/XML/weather/sfc_web_map.xml",
				method : "get",
				dataType : "xml",
				success:function(respons){
					console.log(data);
				},
				error:function(){
					console.log(data);
					alert("읽기실패");
				}
			});
		});
		$("#btn2").click(function() {
			$("#out").empty();
			$.ajax({
				
				url:"/MyController02",
				method : "post",
				dataType : "json",
				success:function(data){
					var table = "<table>";
					table += "<thead>";
					table += "<tr>";
					table += "<th>도서관이름</th><th>주소</th><th>전화번호</th><th>휴관일</th>";
					table += "</tr>";
					table += "</thead>";
					table += "<tbody>";
					$.each(data,function(){
						$.each(this["row"],function(){
							table += "<tr>";
							table += "<td>"+this["LBRRY_NAME"]+"</td>";
							table += "<td>"+this["ADRES"]+"</td>";
							table += "<td>"+this["TEL_NO"]+"</td>";
							table += "<td>"+this["FDRM_CLOSE_DATE"]+"</td>";
							table += "</tr>";
						});
					});
					table += "</tbody>";
					table += "</table>";
					$("#out").append(table);
				},
				error:function(){
					alert("읽기실패");
				}
			});
		});
	});
</script>
</head>
<body>
	<div>
		<button id="btn1">xml 파일 가져오기</button>
		<button id="btn2">json 파일 가져오기</button>
	</div>
	<br><br><br>
	<hr>
	<br><br><br>
	<div id="out"></div>
</body>
</html>