package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 번호를 입력 
		int num = sc.nextInt();
		// 번호는 해당하는 회원 한명의 정보를 MemberDao 객체를 이용해서 얻어온 다음 
		MemberDao dao = new MemberDao();
		MemberDto dto = dao.getData(num);
		
		// 회원정보를 출력한다. ( 존재하지 않는 번호이며 정보가 없다고 출력)
			if(dto != null) {
			String info=String.format("번호:%d, 이름:%s, 주소:%s,",
					dto.getNum(), dto.getName(), dto.getAddr());
			System.out.println(info);
			} else {
				System.out.println(num +"번 회원의 정보가 없습니다.");
			}
	}
}
