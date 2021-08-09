//	Find the minimum distance between 2 numbers in the unsorted array.

import java.util.Scanner;
import java.lang.Math;

class MinimumDistance {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of an array: ");
		int size = sc.nextInt();
		
		int[] arr =new int[size];
		
		System.out.print("Enter the elements of array: ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the 2 elements in between you want to find the distance: ");
		int first = sc.nextInt();
		int second = sc.nextInt();
		int indfirst = -1;
		int indsecond = -1;
		int min = size;
		
		for(int i=0;i<size;i++) {
			if(arr[i] == first)
				indfirst = i;
			else if(arr[i] == second) 
				indsecond = i;
			
			if(indfirst != -1 && indsecond != -1) {
				int diff = Math.abs(indfirst-indsecond);
				if(min>diff) 
					min = diff;
			}
		}
		System.out.print("Minimum distance: "+min);
	}
}
