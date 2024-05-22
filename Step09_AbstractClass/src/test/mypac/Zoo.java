package test.mypac;

public class Zoo {
	// 필드, 메소드, 생성자, 이너클래스
	
	// 클래스 안에 클래스 정의하기(내부 클래스)
	public class Monkey{
		public void say() {
			System.out.println("안녕! 나는 원숭이야");
		}
	}
	
	//내부 클래스(inner class)
	public class Tiger{
		public void say() {
			System.out.println("어흥! 나는 호랑이야");
		}
	}
	
	// zoo 클래스의 멤버 메소드 
	public Monkey getMonkey() {
		// 내부클래스로 객체를 생성해서 return 해줄수도 있다. 
		return new Monkey();
	}
	public Tiger getTiger() {
		return new Tiger();
	}
}
