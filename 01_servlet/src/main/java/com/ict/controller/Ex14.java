package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.model.Command;
import com.ict.model.GetCalcCommand;
import com.ict.model.GetLuckyCommand;
import com.ict.model.GetTodayCommand;

@WebServlet("/Ex14")
public class Ex14 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//일처리를 구별하기 위해서 cmd 파라미터를 먼저 받자
		String cmd = request.getParameter("cmd");
		/*
		switch (cmd) {
			case "1":
				GetTodayCommand comm01 = new GetTodayCommand();
				String path = comm01.exec(request, response);  //보여줄 주소값을 가지고있음
				// 페이지 이동 (포워딩)
				request.getRequestDispatcher(path).forward(request, response);
			break;
			case "2": 
				GetLuckyCommand comm02 = new GetLuckyCommand();
				String path2 = comm02.exec(request, response);
				// 페이지 이동 (포워딩)
				request.getRequestDispatcher(path2).forward(request, response);
			break;
			case "3": 
				GetCalcCommand comm03 = new GetCalcCommand();
				String path3 = comm03.exec(request, response);
				// 페이지 이동 (포워딩)
				request.getRequestDispatcher(path3).forward(request, response);
			break;
		}*/
		// 축약
		Command comm = null;
		switch (cmd) {
		case "1": comm = new GetTodayCommand();	break;
		case "2": comm = new GetLuckyCommand();	break;
		case "3": comm = new GetCalcCommand(); break;
	}
		// 결과를 보여줄 페이지를 받다.
		String path = comm.exec(request, response);
		// 페이지 이동 (포워딩)
		request.getRequestDispatcher(path).forward(request, response);
		
	}
}
