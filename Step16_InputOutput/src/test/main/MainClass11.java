package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass11 {
	public static void main(String[] args) {
		try {
			// File로 부터 byte 알갱이를 읽어 들일 수 있는 객체 생성
			var fis = new FileInputStream("C:/Users/user/playground/myFolder/5.jpg");
			// byte 알갱이를 FIle에 출력 할 객체 생성
			var fos = new FileOutputStream("C:/Users/user/playground/myFolder/dopied.jpg");
			while(true){
				// 1 Byte 읽어 들여서
				int readedByte = fis.read();
				System.out.println(readedByte);
				// 만약에 더이상 읽을 byte가 업다면 반복문 탈출
				if(readedByte == -1 )break;
				// 읽어 들인 1 Byte 출력
				fos.write(readedByte);
				fos.flush();
			}
			System.out.println("파일을 copy 했습니다.");
			//마무리 작업
			fos.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}

