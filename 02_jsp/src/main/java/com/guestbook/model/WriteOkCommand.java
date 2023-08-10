package com.guestbook.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guestbook.db.DAO;
import com.guestbook.db.VO;

public class WriteOkCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 입력받은 값을 DB에 저장하기위해 VO생성
		VO vo = new VO();
		// 파라미터 vo에 넣기
		vo.setName(request.getParameter("name"));
		vo.setSubject(request.getParameter("subject"));
		vo.setEmail(request.getParameter("email"));
		vo.setPwd(request.getParameter("pwd"));
		vo.setContent(request.getParameter("content"));
		
		// DB에 저장
		int result = DAO.getInsert(vo);
		
		// 결과를 가지고 list로 감
		return "GuestController?cmd=list";
	}
}
