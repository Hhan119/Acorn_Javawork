package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass07 {
	public static void main(String[] args) {
		// 파일에 저장할 문자열이라고 가정
		String msg ="안녕하세요!";
		// memo.txt 파일을 생성하기 위한 File 객체 생성
		File f = new File("C:/Users/user/playground/myFolder/memo.txt");
		
		
		// memo.txt 파일이 존재하지 않으면 생성
		if(!f.exists()) {
			//파일 생성
			try {
				f.createNewFile();
				//파일에 문자열을 출력 할 객체 생성
				var fw = new FileWriter(f);
				fw.write(msg);
				//fw.close();
				fw.flush();
			
				System.out.println("memo.txt 파일에 문자열을 기록 했습니다. ");;
				
				for(int i=0; i<100; i++) {
					String hi = msg+ i+"번째 출력중..\n.";
					fw.write(hi);
					System.out.println(hi);
				}
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("파일 생성완료");
			
		}
	}
}
