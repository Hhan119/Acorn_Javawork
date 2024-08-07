package test.auto;

/*
 * - 접근 지정자 접근범위
 * 
 *   public : 어디에서나 접근 가능
 *   protected : 동일한 Package 혹은 상속 관계에서 자식에서 접근 가능
 *   default(작성 X) : 동일한 Package 안에서만 접근 가능
 *   private : 동일한 클래스 혹은 동일한 객체 내에서만 접근 가능
 *   
 * - 접근 지정자를 붙이는 위치 
 *   
 *   1. 클래스를 선언 할 때 (import 가능 여부를 결정함)
 *   2. 생성자 (객체 생성 가능여부를 결정함)
 *   3. 필드 (필드 참조 가능여부를 결정함)
 *   4. 메소드 (메소드 호출 가능여부를 결정함)
 *   
 *   클래스는 default와 public 두가지의 접근 지정자만 지정 가능하다.
 *   접근 지정자를 생략한것이 defalut 접근 지정자다 .
 * 
 */
public class Car {
	//필드(protected는 패키지가 달라도 상속 관계 자식이면 참조가 가능하다.)
	protected Engine engine;
	//Engine 객체를 생성자의 인자로 전달받는 생성자(이 생성자를 저의하면 default 생성자는 사라진다.)
	public Car(Engine engine) {
		this.engine=engine;
	}
	
	//메소드 
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine이 없어서 달릴 수가 없어요!");
			return; // 메소드를 여기서 리턴시키기(종료 시키기)
		}
		System.out.println("달려요!");
	}
}
