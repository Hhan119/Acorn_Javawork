package test.main;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MainClass03 {
	public static void main(String[] args) {
		// 인사말을 담을 ArrayList 객체를 생성해서 참조값을 List 인터페이스 type 지역변수에 대입하기
		ArrayList<String> greets = new ArrayList<>();
		
		// greets에 들어있는 참조값을 이용해서 인사말 3개를 임의로 담아보세요
		greets.add("안녕하세요");
		greets.add("환영합니다");
		greets.add("좋은하루입니다");
		
		Consumer<String> con = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		greets.forEach(con);
		
		System.out.println("-----------");
		
		Consumer<String> con2 = (t)->{
			System.out.println(t);
		};
		greets.forEach(con2);
		
		System.out.println("-----------");
		
		greets.forEach((t)->{
			System.out.println(t);
		});
	}
}
