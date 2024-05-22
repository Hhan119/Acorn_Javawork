package test.auto2;

import test.auto.Car;
import test.auto.Engine;

public class Mycar extends Car{

	public Mycar(Engine engine) {
		super(engine);
	}
	public void myDrive() {
		if(this.engine==null){
			System.out.println("");
			return;
		}
		System.out.println("나만의 방식으로 달려요!");
		// extends 상속시 protected 접근 지정자가 없으면, Car에 메소드만 호출이 가능하고, 필드에는 접근이 불가(동일 패키지에서만 사용이 가능)
		// protected 접근 지정자는 다른 패키지에 있는 메소드, 필드 접근 가능함, 대신 필드 접근시 super(필드 이름)을 써줘야 상속이 가능함 
	}
}
