package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		// 지역 변수를 선언만 하면? 생성 되지 않는다.
		
		int num;
		String name1;
		
		// 아직 생성되지 않았기 때문에 num은 참조 불가
		// int result =10+num;
		
		// 아직 생성되지 않았기 때문에 name1은 참조 불가
		//System.out.println(name1);
		
		
		System.out.println("main 메소드가 종료되었습니다. ");
		
	}

}
