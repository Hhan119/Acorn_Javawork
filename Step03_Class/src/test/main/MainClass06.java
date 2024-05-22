package test.main;

import test.mypac.Member;

public class MainClass06 {
	public static void main(String[] args) {
		Member mem1 = new Member(); // new 클래스명 입력시 import 되어야 함
		Member mem2 = new Member();
		Member mem3 = new Member();
		Member mem4 = new Member();

		mem1.num=1;
		mem1.name="첼시";
		mem1.addr="잉글랜드";
		
		mem2.num=2;
		mem2.name="레알마드리드";
		mem2.addr="스페인";
		
		mem3.num=3;
		mem3.name="뮌헨";
		mem3.addr="독일";
		
		System.out.println(mem1.num);
		System.out.println(mem1.name);
		System.out.println(mem1.addr);
		
		mem1.showInfo();
		mem2.showInfo();
		mem3.showInfo();
		mem4.showInfo();
		
	}
}
