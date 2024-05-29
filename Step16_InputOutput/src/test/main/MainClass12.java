package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass12 {
	public static void main(String[] args) {
		try {
			// File로 부터 byte 알갱이를 읽어 들일 수 있는 객체 생성
			var fis = new FileInputStream("C:/Users/user/playground/myFolder/5.jpg");
			// byte 알갱이를 FIle에 출력 할 객체 생성
			var fos = new FileOutputStream("C:/Users/user/playground/myFolder/dopied.jpg");
			
			//byte 알갱이를 읽어 낼 배열을 미리 준비하기
			byte[] buffer =new byte[1024];
			
			while(true){
				// byte[] 배열을 전달해서 byte 알갱이를 한번에 1024개씩 읽어들인다. 
				
				// 읽어들인 갯수가 리턴한다.
				int readedCount = fis.read(buffer); 
				System.out.println(readedCount+"byte를 읽었습니다.");
				// 더 이상 읽을 데이터가 없다면 반복문 탈출
				if(readedCount == -1) break ; 
				// byte[] 배열에 저장 된 byte 알갱이를 0번 인덱스부터 읽은 갯수만큼 출력하기 
				fos.write(buffer, 0, readedCount);
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

