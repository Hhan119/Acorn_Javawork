package test.mypac;

public class Member {
	//필드
	public int num;
	public String name;
	public String addr;
	
	//메소드
	public void showInfo() {
		//this는 바로 이 객체의 참조값을 가리킨다. (각 필드안에 내용을 가리킨다.)
		String info="번호는" +this.num+ "이고 이름은" +this.name+ "이고 주소는" +this.addr+ "입니다.";
		System.out.println(info);
	}
	
}
