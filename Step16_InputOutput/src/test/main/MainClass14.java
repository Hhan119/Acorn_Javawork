package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import test.dto.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		/*
		 *  MemberDto 객체를 파일에 저장 할 수도 있을까?
		 *  파일에 저장했다면 저장된 MemberDto 객체를 다시 불러올 수도 있을까?
		 */
		
		MemberDto dto = new MemberDto(1, "첼시", "잉글랜드");
		
		// 필요한 객체의 참조값을 담을 지역 변수 미리 만들기
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
			fos = new FileOutputStream("C:/Users/user/playground/myFolder/member.dat");
			// FileOutputStream 객체를 생성자의 매개변수로 전달하면서 ObjectoutputStream 객체를 생성
			oos = new ObjectOutputStream(fos);
			// 객체를 저장하는 메소드를 호출하면서 MemberDto 객체 전달하기 
			oos.writeObject(dto);
			System.out.println("파일에 객체가 저장되었습니다. ");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
				try {
					if(fos!=null)fos.close();
					if(oos!=null)oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}
}
