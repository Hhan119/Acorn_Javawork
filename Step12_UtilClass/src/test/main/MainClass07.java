package test.main;

import java.util.HashMap;

public class MainClass07 {

	public static void main(String[] args) {
		/*
		 * 	HashMap<Key type, value type)
		 * 
		 * 	Key type은 일반적으로 String type을 가장 많이 사용한다.
		 *  value type은 담고 싶은 데이터의 type을 고려해서 지정 하면된다.
		 *  value type을 Object로 지정하면 어떤 data type 이드니 다 담을 수가 있다. 
		 *  순서가 없는 데이터를 다룰 때 사용된다.
		 *  dto 클래스 대신에 사용하기도 한다. 
		 */
		
		// String은 Key 값으로 사용될 data type
		// Object는 저장할 value의 type
		HashMap<String, Object> map = new HashMap<>();
		map.put("num", 1);
		map.put("name", "첼시");
		map.put("isMan", true);
		
		// value의 generic 클래스가 Object이기 때문에 Object type이 return된다.
		int num = (int)map.get("num"); // 원래 type으로 casting이 필요!
		String name = (String)map.get("name");
		boolean isMan = (boolean)map.get("isMan");
		System.out.println(map);
		
		/*
		 * 위의 7줄의 코드를 javascript로 표현한다면 아래와 같다.
		 * let map ={};
		 * map.num=1;
		 * map.name="첼시"
		 * map.isMan="true"
		 * 
		 * let num=map.num;
		 * let name=map.name;
		 * let isMan=map.isMan;
		 * 
		 * 아래 코드도 가능하다.
		 * let map(){};
		 * map["num"] = 1;
		 * map["name"] = "첼시";
		 * map["isMan"] = true;
		 * 
		 * let num=map["num"];
		 * let name=map["name"];
		 * let isMan=map["isMans"];
		 * 
		 */
	}

}
