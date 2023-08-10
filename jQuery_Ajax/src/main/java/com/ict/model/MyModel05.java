package com.ict.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.DAO;
import com.ict.db.VO;

public class MyModel05 implements Command {
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 일처리(실제 db다녀옴)
		List<VO> list = DAO.getList();

		// 받은 정보로 xml를 만들자
		StringBuffer sb = new StringBuffer();
		for (VO k : list) {
			sb.append(k.getIdx()+",");
			sb.append(k.getM_id()+",");
			sb.append(k.getM_pw()+",");
			sb.append(k.getM_addr2()+",");
			if (k.getM_reg() != null) {
				sb.append(k.getM_reg().substring(0,10)+"/");
			} else {
				sb.append("-/");
			}
		}
		sb.deleteCharAt(sb.length() - 1);  //마지막 줄에 콤마를 지워준다.

		// MVC에서는 View 경로를 작성하지만 ajax는 만들어진 정보를 전달한다.
		return sb.toString();
	}
}
