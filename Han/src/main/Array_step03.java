package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array_step03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		int min = 100;
		int max = -100;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			if(min>arr[i]) min = arr[i];
			if(max<arr[i]) max = arr[i];
		}

		System.out.println(max);
		System.out.println(min);
	
		
	}
}
