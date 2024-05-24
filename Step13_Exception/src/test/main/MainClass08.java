package test.main;

import java.util.Random;

import test.mypac.WowException;

public class MainClass08 {
	public static void main(String[] args) {
		int ranNUm=0;
		try {
			Random ran = new Random();
			// 0~9 사이의 숫자를 랜덤으로 얻어낸다.
			int ranNum = ran.nextInt(10);
			if(ranNum == 7) {
			//아래에서 발생하는 Exception은 Java Virtual Machine에서 처리 하였고, 직접 처리가 필요한 경우에는 try-catch를 작성하면 된다.
			throw new WowException("우와 행운의 7번이다.");
		}
	}catch(WowException we) {
			we.printStackTrace();
		}
				
		System.out.println(ranNUm+ "숫자가 나왔습니다.");
			
	}
}
