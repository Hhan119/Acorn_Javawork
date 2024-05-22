package test.main;

public class MainClass04 {
	// static 메소드 안에서 사용하려면, static 예약어가 필요!
	   //mainclass04
		//Chelsea - static 예약어를 빼면 main 메소드에서 사용불가 
		// main 
	public static class Chelsea{
		public void soccer() {
			System.out.println("2024시즌 첼시는 6위를 하였습니다.");
		}
	}
	public static void main(String[] args) {
		Chelsea h = new Chelsea();
		h.soccer();
		
		// 메소드 안에도 클래스를 정의할 수 있다.
		// 여기 정의한 클래스는 안쪽 영역에서만 사용할 수 있다.
		// 메소드 안에 정의한 클래스는 Local Inner Class라고 한다. 
		class Asnal {
			public void soccer() {
				System.out.println("2024시즌 아스날은 2위를 하였습니다. ");
			}
		}
		//Local Inner Class를 이용해서 객채 생성하고 사용해보기
			Asnal a=new Asnal();
			a.soccer();
				
		// 클래스 안에 클래스를 정의할 수 있다. 
		// 메소드 안에도 클래스를 정의할 수 있다.
		// static 메소드 안에서는 static 필드 static 메소드 static 클래스 멤버만 사용할 수 있다. 
	}
}


