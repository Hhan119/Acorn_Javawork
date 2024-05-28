package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass04 {
	public static void main(String[] args) {

		System.out.println("Main 메소드가 실행 되었습니다.");
		// 콘솔창에 출력 할 수 있는 객체의 참조값 얻어내기
		PrintStream ps = System.out;
		// printStream 객체의 참조값을 부모 type 변수에 담기
		// OutputStream 객체도 1Byte 처리 스트림이다.(한글 처리 불가)
		OutputStream os = ps;
		
		try {
			os.write(97);
			os.write(98);
			os.write(99);
			//os.write(44032); // 한글 처리 불가
			os.flush(); // 방출		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
