package test.main;

import test.auto.Car;
import test.auto.Engine;
import test.auto.SportCar;

public class MainClass09 {
	public static void main(String[] args) {
		// SportCar 객체를 생성해서 참조값을 car1이라는 지역 변수에 담아보세요.
		SportCar car1 = new SportCar(new Engine());
		// 위에서 생성한 객체의 .drive() .openDrive() 메소드를 각각 호출
		car1.drive();
		car1.openDrive();
	}
}
