package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass02 {
	public static void main(String[] args) {

		System.out.println("Main 메소드가 실행 되었습니다.");
		// 1Byte 처리 스트림 
		InputStream kbd = System.in;
		// 2Byte 처리 스트림 (65536개를 표현 할 수 있음) 한글 처리 가능한 객체 
		var isr = new InputStreamReader(kbd);
		System.out.println("입력:");
		
		
		try {
			int code = isr.read();
			System.out.println("code:"+code);
			char ch  = (char)code;
			System.out.println("char:"+ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
