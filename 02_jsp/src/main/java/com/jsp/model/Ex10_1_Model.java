package com.jsp.model;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Ex10_1_Model implements Command{ // 장바구니 담기
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 선택한 과일 장바구니에 담자
		String fruits = request.getParameter("fruits");
		HttpSession ss = request.getSession();
		
		// 과일을 담아야 하지만 크기를 알 수 없다.(형변환)★
		ArrayList<String> list = (ArrayList<String>)ss.getAttribute("list");
		
		// 맨 처음에 해당 페이지로 오면 당연히 session에는 list가 없다.(싱글톤패턴)
		if(list == null) { //맨 처음온 놈
			list = new ArrayList<>();
			ss.setAttribute("list", list);  //저장하기
		}
		// 리스트에 선택된 과일을 추가
		list.add(fruits);
		
		//위에 내용을 실행 후 보여질 화면
		return "view/ex10_session_cart.jsp";
	}
}
