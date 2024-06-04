package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnector;

/* 
 * 	 회원 정보를 insert, update, delete, select 할 수 있는 기능을 가진 객체를 생성할 클래스 설계하기
 */
public class MemberDao {
	
		
	// 매개 변수에 전달된 MemberDto 객체에 담긴 회원 한명의 정보를 DB에 저장하는 메소드
	public boolean insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		//변화된 row 갯수를 저장할 변수를 0 을 대입해서 미리 만들어 둔다.
		int rowCount = 0;
		try {
			conn = new DBConnector().getConn();
			//실행할 sql 문 
			String sql = "INSERT INTO member"
					+ " (num, name, addr)"
					+ " VALUES(member_seq.NEXTVAL, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			//sql 문이 미완성이라면 여기서 값 바인딩
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			//sql 문 실행하고 변화된 row 의 갯수를 변수에 담는다.  
			rowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		//변화된 rowCount 를 이용해서 작업의 성공 여부를 리턴해 준다.
		if (rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}		
		
	// 매개변수에 전달된 번호에 해당하는 회원 한명의 정보를 삭제하는 메소드 
	public boolean delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		//변화된 row 갯수를 저장할 변수를 0 을 대입해서 미리 만들어 둔다.
		int rowCount =0;
		try {
			conn = new DBConnector().getConn();
			//실행할 sql 문 
			String sql = "DELETE FROM member"
					+ " WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			//sql 문이 미완성이라면 여기서 값 바인딩
			pstmt.setInt(1, num);
			//sql 문 실행하고 변화된 row 의 갯수를 변수에 담는다.  
			rowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		//변화된 rowCount 를 이용해서 작업의 성공 여부를 리턴해 준다.
		if (rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}		
	
	// 매개 변수에 전달된 MemberDto 객체에 담긴 회원 한명의 정보를 수정하는 메소드
	public boolean update(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		//변화된 row 갯수를 저장할 변수를 0 을 대입해서 미리 만들어 둔다.
		int rowCount = 0;
		try {
			conn = new DBConnector().getConn();
			//실행할 sql 문 
			String sql = "Update member"
					+ " set name=?, addr=?"
					+ " where num=?";
			pstmt = conn.prepareStatement(sql);
			//sql 문이 미완성이라면 여기서 값 바인딩
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			//sql 문 실행하고 변화된 row 의 갯수를 변수에 담는다.  
			rowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		if (rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}		
		//변화된 rowCount 를 이용해서 작업의 성공 여부를 리턴해 준다.

		
	
	// 전체 회원 목록을 Return 하는 메소드 
	public List<MemberDto> getList(){
		// Return 해줄 List 객체 생성
		List<MemberDto> list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = new DBConnector().getConn();
			//실행할 select 문 구성하기 selection 인자가 있다면 미완성도 가능하다 
			String sql = "select num, name, addr"
					+ " from member"
					+ " order by num asc";
			pstmt = conn.prepareStatement(sql);
			//select 문이 미완성이라면 여기서 완성한다.

			//select 문 실행하고 결과를 ResultSet 객체로 받아온다.
			rs = pstmt.executeQuery();
			//select 된 row 가 여러개라면 반복문 돌면서 추출한다.
			while (rs.next()) {
				// MemberDto 객체를 생성해서
				MemberDto dto = new MemberDto();
				// ResultSet에 담긴 내용을 읽어와서 setter 메소드를 활용해서 dto에 넣어준다.
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				// 회원 한명의 정보가 담긴 MemberDto 객체의 참조값을 List에 누적 시킨다.
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return list;
	}
	// 매개 변수에 전달된 번호에 해당하는 회원 한명의 정보를 Return 하는 메소드
	public MemberDto getData(int num) {
		MemberDto dto =null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = new DBConnector().getConn();
			//실행할 select 문 구성하기 selection 인자가 있다면 미완성도 가능하다 
			String sql = "select num, name, addr"
					+ " from member"
					+ " where num=?";;
			pstmt = conn.prepareStatement(sql);
			//select 문이 미완성이라면 여기서 완성한다.
			pstmt.setInt(1, num);
			//select 문 실행하고 결과를 ResultSet 객체로 받아온다.
			rs = pstmt.executeQuery();
			//select 된 row 가 여러개라면 반복문 돌면서 추출한다.
			if (rs.next()) {
				// MemberDto 객체를 생성
				dto = new MemberDto();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return dto;
	}
	
	}

