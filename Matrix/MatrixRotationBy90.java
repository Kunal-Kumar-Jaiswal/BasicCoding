/* Rotation of the matrix by 90 degree clockwise 

	Concept of making:
	1.) Take input of a Square matrix 
	2.) Find the tranpose of that matrix
	3.) Reverse each row of the matrix
	4.) Print the output
	
*/

import java.util.Scanner;

class MatrixRotationBy90 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the row of matrix: ");
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		
		//Input the matrix 
		System.out.println("Enter the matrix element: ");
		for(int i=0; i<n ; i++) 
			for(int j=0; j<n ; j++) 
				matrix[i][j] = sc.nextInt();
			
		// Tranpose the matrix 
		for(int i=0;i<n-1;i++) {
			for(int j=1;j<n;j++) {
				if(i<j) {
					int temp = matrix[i][j];
					matrix[i][j] = matrix[j][i];
					matrix[j][i] = temp;
				}
			}
		}
		
		//Reverse of each row of the matrix
		for(int i=0; i<n; i++) {
			for(int j=0; j<n/2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][n-1-j];
				matrix[i][n-1-j] = temp;
			}
		}
		
		//Printing the matrix with 90 degree clockwise
		System.out.println("Matrix after 90 degree clockwise rotation: ");
		for(int i=0; i<n ; i++) {
			for(int j=0; j<n ; j++) { 
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}	
	}
}
