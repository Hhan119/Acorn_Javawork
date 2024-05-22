package main;

import java.util.Scanner;

public class Array_step01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("여기에 입력:");
		
		int N = scan.nextInt();
		int X = scan.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = scan.nextInt();
			if(X > arr[i]) {
				System.out.println(arr[i]+ " ");
			}
			
		}
		
		
		
	}
}
