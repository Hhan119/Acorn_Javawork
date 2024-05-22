package test.main;

import java.io.PrintStream;

public class MainClass05 {
	public static void main(String[] args) {
		// System 클래스에는 out이라는 static 필드가 존재하고,
		// 거기에는 콘솔창과 연결된(콘솔창에 출력 할 수있는) printStream type 객체의 참조값이 들어 있다.
		System.out.println("안녕!");  // system도 클래스임 
		
		PrintStream chelsea = System.out;
		chelsea.println("안녕3");
	
		// system 클래스의 static 메소드 호출
		long time = System.currentTimeMillis();
		chelsea.println(time);
	}
}
