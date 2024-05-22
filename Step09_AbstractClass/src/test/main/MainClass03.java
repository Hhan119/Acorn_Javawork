package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Monkey;
import test.mypac.Zoo.Tiger;

public class MainClass03 {
	public static void main(String[] args) {
		Zoo z1 = new Zoo();
		Monkey m1 = z1.getMonkey();
		m1.say();
		
		// zoo 객체를 생성해서 참조값을 z2이라는 변수에 담아 보세요.
		Zoo z2 = new Zoo();
		
		// z2 안에 들어잇는 참조값을 이용해서 getTiger() 메소드를 호출 후 return되는 값을 t1 이라는 변수에 담아 보세요.
		Tiger t1=z2.getTiger();
		
		// return 된 tiger 객체의 say() 메소드를 호출해보세요.
		t1.say();
	}
}
