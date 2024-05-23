package test.main;

import java.util.HashSet;
import java.util.Set;

/*
 * 	HashSet은 Set 인터페이스를 구현한 클래스이다.
 * 
 *  - 순서가 없다.
 *  - Key 값도 없다.
 *  - 중복을 허용하지 않는다.
 *  - 어떤 data를 묶음(집합)으로 관리하고자 할 때 사용한다.
 */
public class MainClass10 {
	public static void main(String[] args) {
		// 정수를 저장 할 수 있는 HashSet 객체를 생성해서 참조값을 Set 인터페이스 type 지역변수에 담기
		Set<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(20);
		set1.add(30);
		set1.add(30);
		System.out.println(set1);

		System.out.println("----------");
		
		// 문자열을 저장 할 수 있는 HashSet 객체
		Set<String> set2 = new HashSet<String>();
		set2.add("Hong");
		set2.add("Lee");
		set2.add("Han");
		set2.add("Lee");
		set2.add("Hong");
		System.out.println(set2);

		//Set 객체에 저장된 모드 아이템을 순서를 보장할 수는 없지만 모두참조해서 사용해보기
			set1.forEach((item)->{
				System.out.println(item);	
		});
			System.out.println("----------");
			set2.forEach((item)->{
				System.out.println(item);
		});
			
		// 특정 item(데이터, 참조값) 존재 여부 확인하기
		boolean isContain=set2.contains("Hong");
		// 저장된 item의 갯수
		int size=set2.size();
		// 특정 item 삭제
		set2.remove("Lee");
		// 모든 item 삭제
		set2.clear();
	}
}
