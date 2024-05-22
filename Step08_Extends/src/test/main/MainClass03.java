package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass03 {
	public static void main(String[] args) {
		HandPhone p1 = new HandPhone();
		
		//HandPhone type안에 있는 값을 Phone type(부모 type) 변수에 대입이 가능하다. 
		Phone p2 = p1;
		
		//HandPhone type안에 있는 값을 Phone type(부모 type) 변수에 대입이 가능하다. 
		Object p3 = p1;
		
		// 자식 객체의 참조값은 부모 type 변수나 필드에 자연스럽게 담긴다.
	}
}
