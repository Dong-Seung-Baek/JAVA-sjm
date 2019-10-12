/**
 * CSE3040 HW1
 * Level006.java
 * Purpose: count the number of matchs between random-generated 6 numbers and user-input numbers 
 * 
 * @version jre1.8.0_191
 * @author Dongseung Baek
 */

import java.util.Scanner;

public class Level006 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rand[]=new int[6], i, j, input, count=0, dup_flag;
		
		//generate random 6 numbers
		for(i=0;i<6;i++) {
			while(true) {
				rand[i]=(int)(45*Math.random())+1;
				dup_flag=0;
				//if the number generated is already in the array, generate again
				for(j=0;j<i;j++) {
					if(rand[i]==rand[j]) dup_flag=1;
				}
				if(dup_flag==0) break;
			}	
		}
		//scan 6 inputs
		for(i=0;i<6;i++) {
			System.out.print("[Lotto] Enter number #"+(i+1)+" (1~45): ");
			input=sc.nextInt();
			//for each input, check if in random generated array is same number
			//if there is, increase the counter
			for(j=0;j<6;j++) {
				if(input==rand[j]) count++;
			}
		}
		//print the random generated numbers and how many numbers the user hit
		System.out.print("This week's lotto numbers:");
		for(int r :rand) System.out.print(" "+r);
		System.out.println("\r\nYou matched "+count+" numbers.");
	}
	
	
}
