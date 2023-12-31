package com.guestbook2.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guestbook2.db.DAO;
import com.guestbook2.db.VO;

public class OnelistCommand implements Command{
	@Override
		public String exec(HttpServletRequest request, HttpServletResponse response) {
			// 파라미터 idx
			String idx = request.getParameter("idx");
			VO vo = DAO.getOneList(idx);
			if(vo != null) {  //내용이 잘 담겼다면
				request.setAttribute("vo", vo);
				return "guestbook2/onelist.jsp";
			}else {
				return "guestbook2/error.jsp";
			}
		}	
}
