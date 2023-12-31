package com.guestbook2.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guestbook2.db.DAO;
import com.guestbook2.db.VO;

public class DeleteCommand implements  Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 삭제하기위해 idx로 가져온 리스트에 확인필요한 비밀번호를 받아서 간다.
		String idx = request.getParameter("idx");
		VO vo = DAO.getOneList(idx);
		
		if(vo != null) {
			request.setAttribute("vo", vo);
			return "guestbook2/delete.jsp";
		}else {
			return "guestbook2/error.jsp";
		}
	}
}