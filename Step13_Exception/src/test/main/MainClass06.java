package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass06 {
	public static void main(String[] args) {
		
		// 문자열 안에서 \ 특별한 기호이며, 따옴표를 인식 시키고 싶으면 \붙이면 된다.
		System.out.println("main 메소드가 \"시작\" 되었습니다.");
		
		//C:\Users\\user\playground\myFolder\memo.txt 파일에 관련된 작업을 할 수 있는 File 객체 생성 
		// File 객체의 메소드르 활용해서 실제 memo.txt 파일이 존재하지 않으면 파일을 만들고
		// 존재하면 memo.txt 파일을 삭제하도록 프로그래밍 해보세요.
		
		// 파일 구분자를 \\, /로 두개 중 아무거나 작성을 해도 File 객체 내부에서 알아서 인식한다.
		File f=new File("C:/Users/user/playground/myFolder/memo.txt");
		try {
			boolean isExists = f.exists();
				if(!isExists) {
					f.createNewFile();
					System.out.println("파일 생성완료");
				}else {
						f.delete();
						System.out.println("파일 삭제완료");
					}				
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		// 문자열 안에서 \를 인식 시키고 싶으면 \\ 붙이면 된다. 
		System.out.println("main 메소드가 \\종료\\ 되었습니다.");
		
	}
}
