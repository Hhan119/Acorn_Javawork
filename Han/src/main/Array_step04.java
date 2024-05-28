package main;

import java.util.Scanner;

public class Array_step04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] arr = new int[N];
		int M = scan.nextInt();
		
		
		for(int i=0; i<M; i++) {
			int I = scan.nextInt();
			int J = scan.nextInt();
			int k = scan.nextInt();

			for(int j=I-1; j<J; j++) {
				arr[j] = k;
			}
			
		}
		for(int k=0; k<arr.length; k++) {
			System.out.println(arr[k] + " ");
		}
		
	
	}
}
