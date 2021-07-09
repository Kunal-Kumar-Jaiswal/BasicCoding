// Maximum number in an array

import java.util.Scanner;

class MaxInArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int a=sc.nextInt();
		int arr[] = new int[a];
		int max=0;
		System.out.print("Enter the elements of the array: ");
		for(int i=0;i<a;i++) {
			arr[i] = sc.nextInt();
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("Maximum number is: " +max);
	}
}
