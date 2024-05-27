package test.main;

import test.mypac.WowException;

public class QuizMain {
	public static void main(String[] args) {
		int m=0;
		int s=0;
		int h=0;
		while(true) {
			try {
				Thread.sleep(5);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
			s++;
			if(s==60) {		
				s=0;
				m++;
			}	
			if(m==60) {
				m=0;
				h++;
			}
			System.out.println(h+"시"+m+"분"+s+"초");		
		}
	}
}


			
