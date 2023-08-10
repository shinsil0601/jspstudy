package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.DAO;

public class Comment_Delete implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String c_idx = request.getParameter("c_idx");
		String b_idx = request.getParameter("b_idx");
		String cPage = request.getParameter("cPage");
		int result = DAO.getC_delete(c_idx);
		
		//return "MyController?cmd=onelist&b_idx="+b_idx;  MyController=> request, response 해주는 작업을 하지만 forward때문에 request가 살아있다.
		return "MyController?cmd=onelist&b_idx="+b_idx+"&cPage="+cPage;
	}
}
