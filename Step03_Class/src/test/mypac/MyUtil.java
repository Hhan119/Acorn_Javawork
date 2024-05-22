package test.mypac;
/*
 * - Static 예약어를 붙여서 필드나 메소드를 정의하면, 클래스와 함께 statice 영역에 만들어진다.
 * - Static 필드난 메소드를 사용 할 때는 클래스명에 . 을 찍어서 사용하면된다.
 * MyUtil.sersion // static 필드 참조
 * 
 * MyUtil.send() // Static 메소드 호출
 */

public class MyUtil {
	//data type 앞에 static 예약어를 붙여서 static 필드를 만들 수 있음
	//필드는 선언시에 초기값을 넣을수도 있다.
	public static String version ="1.0";
		
	
	//method의 return type 앞에 static 예약어를 붙여서 static 메소드를 만들 수 있다.
	public static void send() {
		System.out.println("전송합니다.");
	}
}
