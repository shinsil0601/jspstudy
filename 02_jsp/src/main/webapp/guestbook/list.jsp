<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록</title>
<style type="text/css">
	a{text-decoration: none;}
	table{
		width: 600px; border-collapse: collapse; text-align: center;
	}
	table, th, td{
		border: 1px solid black; padding: 3px;
	}
	div{
		width: 600px;
		text-align: center;
		margin: auto;
	}
</style>
</head>
<body>
	<div>
		<h2>방명록 리스트</h2>
		<hr>
		<p>[<a href="/02_jsp/GuestController?cmd=write">방명록 쓰기</a>]</p>
		<table>
			<thead>
				<tr style="background-color: #99ccff">
					<th>번호</th><th>작성자</th><th>제목</th><th>작성일</th>
				</tr>
			</thead>
			<tbody>
			<!-- 입력값이 없을때와 아닐때 조건문 -->
				<c:choose> 
					<c:when test="${empty list}">  <!-- 각 열을 합쳐서 입력값이 있는지 확인 -->
						<tr><td colspan="4"><h2>원하는 정보가 존재하지 않습니다.</h2></td></tr>
					</c:when>
					<c:otherwise>
						<c:forEach var="k" items="${list}" varStatus="vs"> <!-- 입력값이 있으면 테이블 한줄 생성 -->
							<tr>
								<td>${vs.count}</td>
								<td>${k.name}</td>
								<td><a href="/02_jsp/GuestController?cmd=onelist&idx=${k.idx}">${k.subject}</a></td>
								<td>${k.regdate.substring(0,10)}</td>  <!-- substring(0,10) =>시분초 생략 -->
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>
	</div>
</body>
</html>