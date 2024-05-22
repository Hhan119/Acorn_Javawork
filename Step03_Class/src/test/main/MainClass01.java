package test.main;

// 다른 패키지의 클래스를 사용하려면 import 해야한다.
import test.mypac.Car;

public class MainClass01 {
	public static void main(String[] args) {
		//test.mypac 패키지에 있는 Car 클래스로 객체를 생성하고 생성된 객체의 참조값을 car1이라는,
		//지역 변수에 담기
		Car car1 = new Car(); // car1 Class 객체 생성, new Car 부분은 car1 class 객체의 참조값으로 대체됨.
		                      // Car class로 생성한 객체의 type은 Car type이다. 
		//메소드(함수) 호출
		car1.drive();
		//필드에 저장된 값 참조(불러오기)
		String a = car1.name;
		//필드에 값 대입하기
		car1.name = "그랜저";
		//대입한 이후에 필드에 저장된 값 참조(불러오기)
		String b = car1.name;
		
		//메소드(함수) 호출
		car1.drive();
	}
}
