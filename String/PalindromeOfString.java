//	WAP to check whether a given string is palindrome or not.

import java.util.Scanner;

class PalindromeOfString {
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
		if(str.equals(String.valueOf(ch)))
			System.out.print("String is panlindrome");
		else 
			System.out.print("String is not panlindrome");
	}
}
