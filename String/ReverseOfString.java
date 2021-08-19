//	WAP to print the reverse of given String

import java.util.Scanner;

class ReverseOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.next();
		char[] ch = str.toCharArray();
		int len = ch.length;
		for(int i=0; i<len/2 ;i++) {
			char c = ch[i];
			ch[i] = ch[len-i-1];
			ch[len-i-1] = c;
		}
		System.out.println("Reverse of "+str+" is "+String.valueOf(ch));
	}
}
