package test.mypac;

public class Student {
	// public 클래스명(){} 이런 모양의 생성자가 생략되어 있고, 없어도 있다고 간주된다.
	// 객체가 생성(type xx=new type) 되는 시점에 필요한 사항을 준비하는 곳이라고 보면 됨.
	public Student() { 
		System.out.println("Student 객체를 초기화합니다.");
	}
		
	public void study() {
		System.out.println("공부해요!");
	}
}
