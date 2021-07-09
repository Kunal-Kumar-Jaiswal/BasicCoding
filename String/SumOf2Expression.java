/*  
	Input: Two arrays of mathematical expression in the form of Ax^a+Bx^b+....
	Demo: array(1) = x^2 + 6x^3 and array(2) = x^4 + 3x^2
	Output: 4x^2 + 6x^3 + x^4  
*/

import java.util.Scanner;
import java.io.*;

class SumOf2Expression {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		//Taking input as a string
		System.out.println("Enter the 2 expressions:");
		String exp1 = sc.nextLine();
		String exp2 = sc.nextLine();
		
		//Spliting the string by "+"
		String[] split1 = exp1.split("[+]");
		String[] split2 = exp2.split("[+]");
		
		int a = split1.length;
		int b = split2.length;
        int c = a + b;
        String[] merge = new String[c];
		String r = "";
  
        // using the pre-defined function arraycopy
        System.arraycopy(split1, 0, merge, 0, a);
        System.arraycopy(split2, 0, merge, a, b);
		
		for(int i=0;i<c;i++) {
			boolean flag = false;
			if(merge[i]!="0") {
				for(int j=i+1; j<c; j++) {
					if(merge[i].charAt(merge[i].length()-1) == merge[j].charAt(merge[j].length()-1)) {
						flag = true;
						int n = 0;
						if(merge[i].charAt(0) != 'x' && merge[j].charAt(0) != 'x') {
							n = Character.getNumericValue(merge[i].charAt(0)) + Character.getNumericValue(merge[j].charAt(0)); 
							r += Integer.toString(n) + merge[i].substring(1,merge[i].length()) + "+";
						}
						else if (merge[i].charAt(0) == 'x' && merge[j].charAt(0) != 'x'){
							n = 1 + Character.getNumericValue(merge[j].charAt(0)); 
							r += Integer.toString(n) + merge[i].substring(0,merge[i].length()) + "+";
						}
						else if (merge[i].charAt(0) != 'x' && merge[j].charAt(0) == 'x'){
							n = Character.getNumericValue(merge[i].charAt(0)) + 1; 
							r += Integer.toString(n) + merge[i].substring(1,merge[i].length()) + "+";
						}
						else if (merge[i].charAt(0) == 'x' && merge[j].charAt(0) == 'x'){
							n = 2;
							r += Integer.toString(n) + merge[i].substring(0,merge[i].length()) + "+";
						}
					merge[j] = "0";
					}
				}
				if(flag == false) {
						r += merge[i].substring(0,merge[i].length()) + "+";
				}
			}
		}
		System.out.println("Expression after adding these 2 expressions:");
		System.out.println(r.substring(0,r.length()-1));
	}
}
