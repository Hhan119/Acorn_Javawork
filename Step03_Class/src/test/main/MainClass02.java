package test.main;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		// car 클래스로 객체를 생성해서 참조값을 car1이라는 car type 지역변수에 담기
		Car car1 = new Car();
		
		// car 클래스로 객체를 생성해서 참조값을 car2이라는 car type 지역변수에 담기
		Car car2 = new Car();
		
		//필드에 String type의 참조값 대입
		car1.name="그랜저";
		car2.name="싼타페";
		
		//메소드 호출
		car1.drive();
		car2.drive();
		
		boolean result = car1 == car2;
		// car2의 값을 car3이라는 지역변수에 담기 
		Car car3=car2;
		System.out.println(result);
		car3.drive();
		boolean result2 = car2 == car3;
	}
}
