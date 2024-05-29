package test.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 *   C:\Users\\user\playground\myFolder\memo.txt 파일에 저장 된 문자열을 읽어와서 콘솔창에 출력하는 예제
 */
public class MainClass08 {
	public static void main(String[] args) {
		// memo.txt 파일을 access 할 수 있는 File 객체 생성
		File f = new File("C:/Users/user/playground/myFolder/memo2.txt");
		// 파일로부터 문자열을 읽어 들일 수 있는 객체 생성
		try {
			var fr = new FileReader(f);
			// 무한루프 싱핼하면서 
			while(true) {
				// 문자의 코드 값을 읽어들인다.
				int code = fr.read(); 
				// 더 이상 받아 올 정수가 없을 경우 -1을 return 해서 반복문 탈출.  
				if(code == -1) { 
					break;
				}
				// 코드를 char type으로 변환
				char ch = (char)code;
				System.out.println(ch);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
