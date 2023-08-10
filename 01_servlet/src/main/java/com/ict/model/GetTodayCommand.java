package com.ict.model;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetTodayCommand implements Command {
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 일처리(오늘 날짜 구하기) - 자바식
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DATE);
		
		// 화면에 보여줄 내용을 request.setAttribute를 이용해서 저장하자
		request.setAttribute("year", year);  //"이름", 값
		request.setAttribute("month", month);  //"이름", 값
		request.setAttribute("day", day);  //"이름", 값
		
		// 결과를 보여줄 페이지 지정
		return "view/result01.jsp";
	}
}
