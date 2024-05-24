package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class QuizMain2 {
	public static void main(String[] args) {
		// 1. 로또 번호를 담을 HashSet 객체를 생성해서 set 이라는 지역변수에 담기 
		Set<Integer> set = new HashSet<>();
		
		// 2. while 문을 이용해서 랜덤한 로또 번호를 set1에 반복적으로 담아보세요.
		//    while문 탈출 조건은 set1.size()가 6이 되면 탈출되도록 해보세요.
		Random ran = new Random();
		while(set.size() < 6) {
			int ranNum =ran.nextInt(45)+1;
			set.add(ranNum);
		}
			
		// 3. set1에 담긴 번호를 오름차순 정렬해서 콘솔창에 모두 출력해보세요.
		List<Integer> result = new ArrayList<>(set);
		Collections.sort(result);
		
		for(int tmp : result) {
		System.out.println(tmp+" ");
		}
	}
}
