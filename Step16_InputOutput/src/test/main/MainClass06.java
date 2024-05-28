package test.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {

		System.out.println("Main 메소드가 실행 되었습니다.");
		// 콘솔창에 출력 할 수 있는 객체의 참조값 얻어내기
		PrintStream ps = System.out;
		// printStream 객체의 참조값을 부모 type 변수에 담기
		// OutputStream 객체도 1Byte 처리 스트림이다.(한글 처리 불가)
		OutputStream os = ps;
		
		var osw=new OutputStreamWriter(os);
		// OutputStreamWriter를 BufferedWriter의 생성자에 전달해서 객체 생성
		var bw = new BufferedWriter(osw);
		/*
		 *  Windows의 개행 기호 : \r\n
		 *  Linux, Mac os 개행 기호 : \n
		 */
		try {
			bw.write("하나");
			bw.newLine(); // 운영체제에 맞는 개행기호를 자동으로 출력해주는 메소드
			bw.write("두울");
			bw.newLine();
			bw.write("세엣");
			bw.flush();
			osw.flush(); // 방출
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
