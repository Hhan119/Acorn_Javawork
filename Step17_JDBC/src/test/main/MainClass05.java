package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass05 {
	public static void main(String[] args) {
		// 추가 할 회원의 정보라고 가정, 번호는 시퀀스로 넣기(member_seq.NEXTVAL)
		String name = "맨시티";
		String addr = "잉글랜드";
		
		// DB 연결 객체를 담을 지역변수 생성
		Connection conn = null;
		try {
			// 오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 접속할 DB의 정보 @아이피주소:port번호:db이름
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// 계정/비밀번호를 이용해서 Connection 객체의 참조 값 얻어오기
			conn = DriverManager.getConnection(url, "scott", "tiger");
			// 예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공
			System.out.println("Oracle DB 접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
			}
		
		// sql 문을 대신 실핼 해 줄 객체의 참조값을 담을 지역변수 미리 생성
		PreparedStatement pstmt=null;
		try {
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
			}
		}
}
