//WAP to check whether number is Armstrong(number that is equal to the sum of cubes of its digits) or not

import java.util.Scanner;
class Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		int b=a;
		int n=0;
		while(b>0) {
			int m=b%10;
			b=b/10;
			n=n+(m*m*m);
		}
		if(n==a)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Number is not Armstrong");
	}
}
