package com.jsp.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Ex10_3_Model implements Command{ //장바구니 비우기
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 장바구니 비우기(초기화)
		// 세션 불러와서 담기
		HttpSession ss = request.getSession();
		
		// 방법1) 세션에 담겨있는 내용 초기화 하기
		ss.invalidate();
		
		// 방법2) 리스트 속성만 삭제
		//ss.removeAttribute("list");
		
		// 위에 내용을 실행 후 보여질 화면
		return "view/ex10_session_cart.jsp";
	}
}
