package com.jsp.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex10_2_Model implements Command{  //장바구니 보기
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 세션에 담은 정보를 보여주기만 하면 된다.
		return "view/ex10_session_result.jsp";
	}
}
