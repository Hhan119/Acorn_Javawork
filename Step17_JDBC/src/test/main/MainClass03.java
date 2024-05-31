package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass03 {
	public static void main(String[] args) {
		// 수정할 회원의 정보
		int num=1; // primary key 
		String name="에이콘"; // varchar2에 값 확인 필요(한글자당 byte 3, 띄어쓰기 byte 1) 크면 오류 발생됨
		String addr="강남";
		
		// 위의 정보대로 1번 회원의 이름을 에이콘, 주소를 강남으로 수정
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
		
		// sql 문을 대신 실행 해줄 객체의 참조 값을 담을 지역변수 미리 생성
		PreparedStatement pstmt=null;
		try {
			// 실행 할 미완성의 sql 문
			String sql = "UPDATE member"
					+ " SET name=?, addr=?"
					+ " WHERE num=?";
			// 미완성의 sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
			pstmt=conn.prepareStatement(sql);
			// prepareStatement 객체의 메소드를 이용해서 미완성인 sql문을 완성시키기( ? 에 값 바인딩하기)
			pstmt.setString(1, name); // 1번째 ?에 숫자 바인딩
			pstmt.setString(2, addr); // 2번째 ?에 숫자 바인딩
			pstmt.setInt(3, num); // 3번째 ?에 숫자 바인딩
			// sql문 실행
			pstmt.executeUpdate();
			//ResultSet rs = pstmt.executeQuery();
			System.out.println("회원 정보를 수정했습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
