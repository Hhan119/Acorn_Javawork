package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.util.DBConnector;

public class MainClass06 {
	public static void main(String[] args) {
		// 추가 할 회원의 정보라고 가정, 번호는 시퀀스로 넣기(member_seq.NEXTVAL)
		String name = "아스톤빌라";
		String addr = "잉글랜드";
		
		// sql 문을 대신 실핼 해 줄 객체의 참조값을 담을 지역변수 미리 생성
		PreparedStatement pstmt=null;
		Connection conn = null;
		try {
			//미리 준비한 util 클래스를 이용해서 Connection 객체 얻어오기 
			conn = new DBConnector().getConn(); 
			// 실행 할 미완성의 sql 문
			String sql = "INSERT INTO member"
					+ " (num, name, addr)"
					+ " VALUES(member_seq.NEXTVAL, ?, ?)";
		pstmt=conn.prepareStatement(sql);
		// prepareStatement 객체의 메소드를 이용해서 미완성인 sql문을 완성시키기( ? 에 값 바인딩하기)
		pstmt.setString(1, name); // 1번째 ?에 숫자 바인딩
		pstmt.setString(2, addr); // 2번째 ?에 숫자 바인딩
		// sql문 실행
		pstmt.executeUpdate();
		//ResultSet rs = pstmt.executeQuery();
		System.out.println("회원 정보를 추가했습니다.");
	
		} catch (Exception e) {
			e.printStackTrace();
			} finally {
				try {
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
}
