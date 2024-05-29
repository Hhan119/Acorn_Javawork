package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
 *   C:\Users\\user\playground\myFolder\memo.txt 파일에 저장 된 문자열을 읽어와서 콘솔창에 출력하는 예제
 */
public class MainClass10 {
	public static void main(String[] args) {
		// 문자열을 누적시킨 다음 한번에 문자열을 얻어낼 수 있는 객체 생성
		var sb = new StringBuilder() ; 
		
		// memo.txt 파일을 access 할 수 있는 File 객체 생성
		File f = new File("C:/Users/user/playground/myFolder/memo2.txt");
		// 파일로부터 문자열을 읽어 들일 수 있는 객체 생성
		try {
			var fr = new FileReader(f);
			var br = new BufferedReader(fr);
			br.read();
			br.readLine();
			
			// 무한루프 싱핼하면서 
			while(true) {
				// 한줄씩 읽어낸다.
				String line=br.readLine();
				// 더 이상 읽어 올 문자열이 없으면 null 값을 return 해서 반복문 탈출
				if(line == null)break ;
				// 읽어낸 문자열을 StringBuilder 객체에 누적 시키기
				sb.append(line);
				sb.append("\n"); // 개행 기호도 같이 누적
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		String result=sb.toString();
		System.out.println(result);
	}
}
