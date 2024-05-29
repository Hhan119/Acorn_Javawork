package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass13 {
	public static void main(String[] args) {
		// 필요한 객체를 담을 변수를 미리 만들어 놓고 
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
			
		try {
			// ㅏ객체 생성해서 참조값을 넣어준다. 
			fis =  new FileInputStream("C:/Users/user/playground/myFolder/5.jpg");
			fos = new FileOutputStream("C:/Users/user/playground/myFolder/dopied.jpg");
			
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
			
			} catch (Exception e) {
			e.printStackTrace();
		}finally { // 예외가 발생여부와 상관없이 보장되는 블럭
			System.out.println("파일을 copy 했습니다.");
			//마무리 작업
			try {
				if(fos!=null)fos.close();
				if(fis!=null)fis.close();
			} catch (IOException e) {
				e.printStackTrace();{}
			}
		
		}
	}
}

