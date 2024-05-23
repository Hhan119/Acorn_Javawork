package test.main;

import java.util.HashMap;
import java.util.Map;

import test.mypac.Car;

public class MainClass08 {
	public static void main(String[] args) {
		//HashMap 객체 생성해서 참조값을 Map인터페이스 type 지역변수에 담기
		Map<String, Object> Map = new HashMap<>();
		Map.put("num", 1);		//Integer type 담기
		Map.put("name", "첼시"); //String type 담기
		Map.put("isMan", true); //Boolean type 담기
		Map.put("Car", new Car("그랜저")); // Car type 담기
		
		/*
		 *  value의 Generic 클래스가 Object로 지정 되어 있기 때문에,
		 *  return 되는 Object type을 원래 type으로 casting 해야 한다.
		 */
		int num = (int)Map.get("num");
		String name = (String)Map.get("name");
		boolean isMan = (boolean)Map.get("isMan");
		Car car = (Car)Map.get("Car");
		
		// 동일한 Key 값으로 다시 담으면 수정 
		Map.put("name", "에이콘");
		// 특정 Key 값으로 담긴 내용 삭제, 성공하면 true, 실패하면 False Return
		Map.remove("isMan");
		Map.clear();
	}
}
