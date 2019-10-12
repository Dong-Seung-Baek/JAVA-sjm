/**
 * CSE3040 HW1
 * Level010.java
 * Purpose:  multiplie two matrices
 * 
 * @version jre1.8.0_191
 * @author Dongseung Baek
 */

public class Level010 {

	public static void main(String[] args) {
		final int A[][] = { {1,2}, {3,4}, {5,6} }; 
		final int B[][] = { {1,2,3,4}, {5,6,7,8} };
		int i, j, k, aij;
		//get the number of rows and columns for each matrices
		int a_row=A.length, a_col=A[0].length, b_row=B.length, b_col=B[0].length;
		//print matrix A
		System.out.println("A");
		for(i=0;i<a_row;i++) {
			for(j=0;j<a_col;j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println("");
		}
		//print matrix B
		System.out.println("");
		for(i=0;i<b_row;i++) {
			for(j=0;j<b_col;j++) {
				System.out.print(B[i][j]+" ");
			}
			System.out.println("");
		}
		//print matrix AxB
		System.out.println("");
		System.out.println("AxB");
		for(i=0;i<a_row;i++) {
			for(j=0;j<b_col;j++) {
				//compute the element AxB[i][j]
				aij=0;
				for(k=0;k<a_col;k++) {
					aij+=A[i][k]*B[k][j];
				}
				System.out.print(aij+" ");
			}
			System.out.println("");
		}
	}
	
}
