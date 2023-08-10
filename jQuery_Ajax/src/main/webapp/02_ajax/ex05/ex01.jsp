<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
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
				url: "data01.xml",
				method: "get",
				dataType: "xml",
				success: function(data) {
					var table = "<table>";
					table += "<thead><tr><th>�̸�</th><th>����</th></tr></thead>";
					table += "<tbody>";
					// ���ϴ� �±� �˻�
					$(data).find("product").each(function() {
						var name = $(this).find("name").text();
						var price = $(this).find("price").text();
						table += "<tr>";
						table += "<td>" + name + "</td>";
						table += "<td>" + price + "</td>";
						table += "</tr>";
					});
					table += "</tbody></table>";
					$("#out").append(table);
				},
				error: function() {
					alert("�������� ����");
				}
			});
		});
	});
</script>
</head>
<body>
	<div id="btn">xml ���� ��������</div>
	<div id="out"></div>
</body>
</html>