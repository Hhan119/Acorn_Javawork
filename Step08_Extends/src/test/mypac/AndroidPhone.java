package test.mypac;

public class AndroidPhone extends HandPhone{ // 현재 상속 순서 : AndroidPhone -> HandPhone -> Phone -> Object
	//생성자
	public AndroidPhone() {
		System.out.println("AndroidPhone 생성자 호출됨");
	}
	
	//메소드
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	// @Override는 해당 메소드가 재정의 되었다고 단순히 표시하는 용도이며, 특별한 기능은 없다. 
	@Override
	public void takePicture() {
		/*
		 *  자식에서 부모쪽을 가리키는 예약어가 super이다.
		 *  따라서, super.takePicture()는 부모 객체의 takePicture()를 호출하는 것이다. 
		 *  Override한 메소드에서 부모쪽의 원래 메소드를 호출할지 말지는 상황에 따라 다르다.
		 *  Override 했지만, 부모의 메소드도 호출을 해주어야 메소드가 정상 동작을 하는 경우도 있다. 
		 *  이 매체에서는 부모 객체의 메소드를 호출할 필요가 없음 
		 */
		// super.takePicture(); // 부모의 메소드 실행이 필요한 경우에는 super.으로 작성 필요, 그렇지 않으면 재정의 한 객체를 바라본다. 
		// 객체 안에서{This는 id를 바라본다.}
		System.out.println("1000만 화소의 사진을 찍어요!");
	}
}
