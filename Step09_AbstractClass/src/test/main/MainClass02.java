package test.main;

import test.mypac.Depend;
import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass02 {
	// run 했을때 실행의 흐름이 시작되는 아주 특별한 static 메인 메소드 
	public static void main(String[] args) {
		// 동일한 클래스 안에 있는 static 메소드 호출
		MainClass02.test();
		test(); // 클래스명. 은 생략
		
		// useString() 메소드 호출
		useString("hi");
		
		// useWeapon() 메소드 호출
		useWeapon(new MyWeapon()); // static 메소드로써 객체를 생성하지 않고 직접 호출 할 수 있음(여기 값은 대입(MyWeapon useWeapon = new MyWeapon();)을 생각하여 작성하면 됨)
		
		// depender() 메소드 호출
		usedepend(new Depend());
	}
	
	public static void useWeapon(Weapon w) {
		w.attack();
		w.prepare();
	}
	
	public static void usedepend(Depend d) {
		d.depender();
	}
	
	public static void test() {
		System.out.println("statice test() 메소드가 호출됨!");
	}
	
	// 
	public static void useString(String msg) {
		System.out.println("전달 받은 문자열:"+msg);
	}
}
