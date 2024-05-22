package test.mypac;

/*
 *  Class의 역할
 *  
 *  1. 객체의 설계도 역할
 *    - 객체는 heap 영역(사물함)에 들어있는 물건이라고 생각하면 된다.
 *    - class를 이용해서 객체를 원하는 시점에 원하는 갯수만큼 생성 할 수가 있다.
 *    - 만들어진 객체가 어떤 저장소와 어떤 기능을 가지게 할지 class로 설계 할 수 있다. 
 *    
 *    2. data type 역할
 *    
 *    3. static 필드와 메소드를 포함하는 역할
 */
public class Car {
	// 데이터의 저장소(field) 
	public String name; // 선언만 하고 값을 넣지 않으면, 객체 생성시 null로 초기화 된다.
	public int price;   // 선언만 하고 값을 넣지 않으면, 객체 생성시 0으로 초기환 된다. 
	
	// 기능(method) // 필요할 때 함수 호출 하기위해 만든다고 보면됨
	public void drive() {
		// this는 바로 이 객체의 참조값을 가리키는 예약어이다.
		System.out.println(this.name + " 이(가) 달려요!");
	}
}
