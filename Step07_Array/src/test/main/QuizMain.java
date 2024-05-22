package test.main;

import java.util.Random;

public class QuizMain {
	public static void main(String[] args) {
		// String type이 저장되어 있는 배열
		String[] data = {"cherry","apple","banana","melon", "7"};
		
		// 배열에 저장된 문자열 중에 1개가 랜덤하게 콘솔창에 출력
		Random ran = new Random();
		//int ranNum=ran.nextInt(5);
		//System.out.println(data[ranNum]);
		
		System.out.println(data[ran.nextInt(5)]);
		
		

	}
}


