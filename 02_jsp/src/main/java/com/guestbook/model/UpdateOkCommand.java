package com.guestbook.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guestbook.db.DAO;
import com.guestbook.db.VO;

public class UpdateOkCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String idx = request.getParameter("idx");
		VO vo2 = new VO();
		vo2.setIdx(idx);
		vo2.setName(request.getParameter("name"));
		vo2.setSubject(request.getParameter("subject"));
		vo2.setContent(request.getParameter("content"));
		vo2.setEmail(request.getParameter("email"));  // 비밀번호는 db일치하는용으로 업데이트 하지 않는다.
		
		// 업데이트
		int result = DAO.getUpdate(vo2);
		
		// 업데이트 성공 후 다시 onelist.jsp로 가기 때문에 idx로 정보를 다시 가져와야 한다.
		VO vo = DAO.getOneList(idx);
		request.setAttribute("vo", vo);
				
		
		return "guestbook/onelist.jsp";
	}
}
