package com.guestbook.db;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

// DB 처리하는 메서드들을 가지고 있는 클래스
public class DAO {
	private static SqlSession ss;
	
	// 싱글턴패턴(동기화처리): 프로그램이 종료될 때까지 한번 만들어진 객체를 재사용한다.
	private static SqlSession getSession() {
		if(ss == null) {
			ss = DBService.getFactory().openSession();
		}
		return ss;
	}
	
	// DB 처리하는 메서드들
	// 전체 리스트
	public static List<VO> getList(){
		List<VO> list = getSession().selectList("guestbook.list");   //selectList("mapper의 namespace.id")
		return list;
	}
	// 정보 DB에 저장 (insert, update, delete는 결과가 int)
	public static int getInsert(VO vo) {
		int result = getSession().insert("guestbook.inserts", vo);
		// insert, update, delete는 commit를 해야된다.
		ss.commit(); 
		return result;
	}
	// primary key를 이용해서 하나의 상세 정보 가져오기
	public static VO getOneList(String idx) {
		VO vo = getSession().selectOne("guestbook.onelist", idx);
		return vo;
	}
	
	// 업데이트 (insert, update, delete는 결과가 int)
	public static int getUpdate(VO vo) {
		int result = getSession().update("guestbook.onelist", vo);
		// insert, update, delete는 반드시 commit
		ss.commit();
		return result;
	}
	
	// 삭제 (insert, update, delete는 결과가 int)
	public static int getDelete(String idx) {
		int result = getSession().delete("guestbook.delete", idx);
		// insert, update, delete는 반드시 commit
		ss.commit();
		return result;
	}
}
