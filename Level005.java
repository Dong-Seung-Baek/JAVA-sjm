/**
 * CSE3040 HW1
 * Level005.java
 * Purpose: keep asking for a number until the user hits the target number generated randomly
 * 
 * @version jre1.8.0_191
 * @author Dongseung Baek
 */

import java.util.Scanner;

public class Level005 {
	public static void main (String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int input=0, i=1, from=1, to=100;
		
		//generate ramdom number form 1 to 100
		int rand = (int)(100*Math.random()) + 1;
		while(true){
			System.out.print("["+(i++)+"] Guess a number ("+from+"-"+to+"): ");
			input=sc.nextInt();
			//if the input is bigger, change last index into the input
			if(input>rand) {
				System.out.println("Too large!");
				to=input;
			}
			//if the input is smaller, change first index into the input
			else if(rand>input) {
				System.out.println("Too small!");
				from=input;
			}
			//if the input is exactly the number generated, break the loop
			else {
				System.out.println("Correct!");
				break;
			}
		}
	}	

}
