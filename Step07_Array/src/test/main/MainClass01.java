package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		// Array 배열에서는 대괄호가 타입이 된다.
		
		// int type 5개를 저장하고 있는 배열 객체 생성해서 참조값을 nums라는 지역변수에 담기
		int[] nums = {10, 20, 30, 40, 50};
		
		// double type 5개를 저장하고 있는 배열 객체 생성해서 참조값을 nums2라는 지역변수에 담기
		double[] nums2 = {10.1, 20.2, 30.3, 40.4 ,50.5};
		
		// boolean 5개를 저장하고 있는 배열 객체 
		boolean[] boo = {true, false, true, false, true};
		
		// String type(참조데이터 type) 5개를 저장하고 있는 배열
		String[] names = {"첼시", "레알", "맨시티", "아스날", "뮌헨"};
		
		// 배열 객체의 복제본 얻기 
		int[] result = nums.clone();
		int[] resutl2=nums; // 참조값 복사
		
		// 배열의 크기 얻기
		int size = nums.length;
		
		// 배열은 순서가 있는 데이터이다. 특정 index의 item을 참조하는 방법
		int first=nums[0];
		int second=nums[1];
		int third=nums[2];
		
	}
}

