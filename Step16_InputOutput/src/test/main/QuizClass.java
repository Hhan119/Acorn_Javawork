package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class QuizClass {
	public static void main(String[] args) {
		File f = new File("C:/Users/user/playground/myFolder/memo2.txt");
	
		try {
			
			boolean isExists = f.exists();
				if(!isExists) {
					f.createNewFile();
					System.out.println("파일 생성완료");
				}
			var fw = new FileWriter("C:/Users/user/playground/myFolder/memo2.txt");
			for(int i=0; i<11; i++) {
				String data=i+"번째 출력중..\n";
				fw.write(data);

			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
