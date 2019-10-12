/**
 * CSE3040 HW1
 * Level007.java
 * Purpose: count the number of the user-input letter in the user-input text
 * 
 * @version jre1.8.0_191
 * @author Dongseung Baek
 */

import java.io.InputStream;

public class Level004 {

	public static void main(String[] args) throws Exception {
		InputStream in=System.in;
		int input;
		
		//scan a input letter in form of byte
		System.out.print("ASCII code teller. Enter a letter: ");
		input = in.read();
		
		//print the input in form of integer
		System.out.println("The ASCII code of "+(char)input+" is "+input);
	}
	
}
//브랜치에서는 이렇게 수정이 가능하다구!
