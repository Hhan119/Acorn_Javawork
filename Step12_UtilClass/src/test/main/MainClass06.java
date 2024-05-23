package test.main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import test.mypac.Member;
import test.mypac.MemberDto;

public class MainClass06 {
	public static void main(String[] args) {
		//1. MemberDto 객체를 담을 수 있는 ArrayList 객체를 생성해서 참조값을 members라는 지역변수에 담아보세요
		List<MemberDto> members = new ArrayList<>();
		
		//2. 3명의 회원정보를 MemberDto 객체에 각각 담아 보세요.(MemberDto 객체가 3개 생성되어야 함)
		MemberDto dto1 = new MemberDto(1, "첼시", "잉글랜드");
		MemberDto dto2 = new MemberDto(2, "레알", "스페인");
		MemberDto dto3 = new MemberDto(3, "뮌헨", "독일");
		
		dto1.setNum(1);
		dto1.setName("첼시");
		dto1.setAddr("잉글랜드");
		
		//3. 위에서 생성된 MemberDto 객체의 참조값을 ArrayList 객체에 모두 담아보세요.
		members.add(dto1);
		members.add(dto2);
		members.add(dto3);
		
		
		for(int i=0; i<members.size(); i++) {
			MemberDto info= members.get(i);
			System.out.println("순위:"+info.getNum()+"팀이름:"+info.getName()+"주소:"+info.getAddr());
		}
		
		for(MemberDto tmp:members) {
			/*
			 *  String 클래스의 format()이라는 static 메소드를 이용하면, 원하는 문자열 형식을 좀 더 간편하게 얻어낼수 있다. 
			 *  %d => 숫자(정수)를 출력할 때
			 *  %s => 문자를 출력할 때 
			 *  %f => 실수
			 *  %b => boolean
			 *  %% => %자체를 출력할 때 
			 */
			String info2 = String.format("번호:%d	   이름:%s	주소:%s",
				tmp.getNum(), tmp.getName(), tmp.getAddr());
			System.out.println(info2);
		}
			
		//test();
		//test("hi");
		//test("hi", "hello");
		test("hi", "hello", "bye");
		}
	
		
		//테스트용 메소드
		public static void test(String... msg) {
			// msg는 String[] type이다.
			for(String tmp:msg) {
				System.out.println(tmp);
			}
	}
}
