package test.main;

import test.mypac.WowException;

public class QuizMain {
	public static void main(String[] args) {
		int m=0;
		int s=0;
			try {
				Thread.sleep(1000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
			s++;
			System.out.println(m+"분"+s+"초");
			if(s==60)
				m++;
		
		while(s<60) {
			s++;
			System.out.println(m+"분"+s+"초");
			
		}	
			//System.out.println(m+"분"+s+"초");
			}
	}

			
