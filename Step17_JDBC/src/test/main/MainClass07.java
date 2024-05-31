package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import test.dto.MemberDto;
import test.util.DBConnector;

public class MainClass07 {
	public static void main(String[] args) {
		// 추가 할 회원의 정보라고 가정, 번호는 시퀀스로 넣기(member_seq.NEXTVAL)
		String name = "맨유";
		String addr = "잉글랜드";
		
		// 추가 할 회원의 정보를 MemberDto 객체에 담는다.
		var dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		// insert() 메소드를 호출하면서 MemberDto 객체의 참조값을 전달한다.
		insert(dto);
		//MainClass07.insert(dto);  / MainClass07은 생략가능(동일한 클래스 내에 있으므로 생략)
	}
	
	// 회원정보를 DB에 저장해주는 static 메소드 
	public static void insert(MemberDto dto) {
		// dto에 추가 할 회원의 이름과 주소가 들어 있다는 가정하에서 메소드를 완성해보세요.
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
		pstmt.setString(1, dto.getName()); // 1번째 ?에 숫자 바인딩
		pstmt.setString(2, dto.getAddr()); // 2번째 ?에 숫자 바인딩
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
