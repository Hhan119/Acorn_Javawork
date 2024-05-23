package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass09 {
	public static void main(String[] args) {
		// 1. 3명의 회원정보(번호, 이름, 주소)를 HashMap 객체를 생성해서 담아보세요.
		// HashMap 객체 하나당 한명의 회원정보를 담으니깐 총 3개의 HashMap 객체 생성이 되어야 함
		Map<String, Object> map = new HashMap<>();
		Map<String, Object> map2 = new HashMap<>();
		Map<String, Object> map3 = new HashMap<>();
		
		map.put("num", 1);
		map.put("name", "첼시");
		map.put("addr", "잉글랜드");
		
		map2.put("num", 2);
		map2.put("name", "레알");
		map2.put("addr", "스페인");
		
		map3.put("num", 3);
		map3.put("name", "뮌헨");
		map3.put("addr", "독일");
		// 2. 위에서 생성한 HashMap 객체를 담을 ArrayList 객체를 생성해 보세요.
		List<Map<String, Object>> arr = new ArrayList<>();
		
		// 3. ArrayList 객체에 HashMap 객체 3개를 담아보세요.
		arr.add(map);
		arr.add(map2);
		arr.add(map3);
		
		// 4. 반복문 돌면서 ArrayList에 담긴 회원정보를 콘송창에 이쁠게 출력해보세요.
		for(int i=0; i<arr.size(); i++) {
			Map<String, Object> tmp = (Map<String, Object>)arr.get(i);
				String info=String.format("번호:%d 이름:%s 주소:%s",
					(int) tmp.get("num"), (String)tmp.get("name"), (String)tmp.get("addr"));
			System.out.println(info);
			}
		
		for(int i=0; i<arr.size(); i++) {
			Map<String, Object> tmp = (Map<String, Object>)arr.get(i);
				System.out.println(tmp);
		}

	}
}

