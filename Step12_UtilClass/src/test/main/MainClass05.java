package test.main;

import java.nio.channels.MembershipKey;
import java.util.ArrayList;
import java.util.function.Consumer;

import test.mypac.Member;

public class MainClass05 {
	public static void main(String[] args) {
		//1. Member 객체를 담을 수 있는 ArrayList 객체를 생성해서 참조값을 members라는 지역변수에 담아보세요.
		ArrayList<Member> members = new ArrayList<>();
		
		//2. 3명의 회원정보를 Member 객체에 각각 담아보세요.(Member 객체가 3개 생성되어야함)
		Member info = new Member(1, "첼시", "잉글랜드");
		Member info2 = new Member(2, "레알", "스페인");
		Member info3 = new Member(3, "뮌헨", "독일");
		
		
		//3. 위에서 생성된 Member 객체의 참조값을 ArrayList 객체에 모두 담아보세요.
		members.add(info);
		members.add(info2);
		members.add(info3);
		/*
		 *  4. members List 객체에 담긴 내용을 이용해서 회원 목록을 아래와 같은 형식으로 반복문 돌면서 출력해보세요
		 *  번호: 1, 이름: 첼시, 주소: 잉글랜드
		 *  번호: 2, 이름: 레알, 주소: 스페인
		 *  
		 */
		for(int i=0; i<members.size(); i++) {
			Member tmp=members.get(i);
			System.out.println("번호: " + tmp.num +" 이름: "+tmp.name + " 주소: "+tmp.addr);

			};
	}
}
