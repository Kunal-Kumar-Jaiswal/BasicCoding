/*	You have given a list of n integers in the range of 1 to n with no dublicates present.
	  One element is missing from the list. You have to find the missing number in an array.
*/

import java.util.Scanner;

class MissingNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of an array: ");
		int size = sc.nextInt();
		
		int[] arr =new int[size];
		int add = 0;
		
		System.out.print("Enter the elements of array: ");
		for(int i=1;i<=size-1;i++) {
			arr[i] = sc.nextInt();
			add += arr[i];
		}
		
		int sum = (size*(size+1))/2;
		
		System.out.println("Missing Number= "+(sum-add));
	}
}	
