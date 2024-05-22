package test.main;

import test.mypac.Member;

public class MainClass02 {
	public static void main(String[] args) {
		Member m1=new Member(1, "첼시", "잉글랜드");
		// 아래와 같은 경우는 
		Member m2=new Member();
		m2.num=2;
		m2.name="레알마드리드";
		m2.addr="스페인";
		
		m1.printInfo();
		m2.printInfo();
		
	}
}

