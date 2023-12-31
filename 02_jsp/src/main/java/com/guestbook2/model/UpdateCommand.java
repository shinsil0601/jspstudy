package com.guestbook2.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guestbook2.db.DAO;
import com.guestbook2.db.VO;

public class UpdateCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 받아온 idx로 1개의 정보 바꾸기
		String idx = request.getParameter("idx");
		VO vo = DAO.getOneList(idx);
		if(vo != null) {
			request.setAttribute("vo", vo);
			
			return "guestbook2/update.jsp";
		}else {
			return "guestbook2/error.jsp";
		}
	}
}
