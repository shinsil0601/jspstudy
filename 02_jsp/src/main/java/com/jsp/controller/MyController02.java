package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.model.Command;
import com.jsp.model.Ex10_1_Model;

@WebServlet("/MyController02")
public class MyController02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// 장바구니 담기
		Command comm = new Ex10_1_Model();  //1번 모델로 이동 후 내용을 담자
		String path = comm.exec(request, response);
		
		request.getRequestDispatcher(path).forward(request, response);
	}
}
