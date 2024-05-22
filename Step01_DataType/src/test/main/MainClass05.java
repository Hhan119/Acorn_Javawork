package test.main;

/*
 * [Java 참조 데이터 type]
 * 
 * String Type
 * 
 * - 문자열을 다룰 때 사용하는 데이터 type이다. 
 */
public class MainClass05 {
	public static void main(String[] args) {
		// "첼시"라는  String type 객체를 heap 영역에 만들고 그 참조 값을 변수에 담는다.
		String name = "첼시";
		// name 안에 있는 참조값을 tmp 변수에 복사
		String tmp =name;
		// "레알마드리드"라는 String type 객체를 heap 영역에 만들고 그 참조값을 name 변수에 덮어쓰기
		name = "레알마드리드";
		// "name 변수를 비우기 (null은 참조 데이터 type이 담길수 있는 빈 공간을 의미한다.)
		name = null;
		System.out.println(name);
		
		int num=10;
		//num=null; // 기본 데이터 type 변수에는 null을 대입할 수 없다.
		
		
	}

}
