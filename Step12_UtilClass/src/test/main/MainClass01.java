package test.main;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		//java에서 배열은 용도가 한정 되어있다. item을 담을 수 있는 공간을 늘이거나 줄일수 없다.
		
		//문자열(String) type을 담을 수 있는 방 5개 짜리 배열 객체 생성
		String[] names = new String[5];
		names[0]="첼시";
		names[1]="레알";
		names[2]="맨시티";
		
		
		//String type을 순서대로 저장할 수 있는 ArrayList 객체 생성하고 참조값을 friends에 담기
		ArrayList<String> friends = new ArrayList<>();
		friends.add("첼시");
		friends.add("레알");
		friends.add("맨시티");
		
	
		//0번방에 아이템을 불러와서 item이라는 변수에 담아보세요.
		String item = friends.get(0);

		//1번방에 아이템을 삭제하려면?
		friends.remove(1);
		
		//0번방에 "에이콘"을 넣고(끼워넣기) 싶으면?
		friends.add(0,"에이콘");
		
		//저장된 아이템의 갯수(size)를 size라는 지역 변수에 담아보세요.
		int size = friends.size();
		
		//저장된 모든 아이템 전체 삭제
		friends.removeAll(friends);
		friends.clear();
	
	}
}
