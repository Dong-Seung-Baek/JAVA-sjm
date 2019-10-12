/**
 * CSE3040 HW1
 * Level008.java
 * Purpose: count the number of the user-input string in the user-input text
 * 
 * @version jre1.8.0_191
 * @author Dongseung Baek
 */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Level008 {
	public static void main(String[] args) throws Exception{
		int count=0;
		InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        //scan a text by a line
        System.out.print("Enter a text: ");
        String text = br.readLine();
        String str;
        //scan a string
        System.out.print("Enter a string: ");
		str = br.readLine();
		//count how many strings does the text contains
		while(true) {
			if(text.contains(str)) {
				//check if the text contains the string
				count++;
				//if it does, get the first index of the string
				//get the substring starts from just next index
				//keep checking until the substring dosn't contain the string
				text=text.substring(text.indexOf(str)+1);
			}
			else {
				break;
			}
		}
		System.out.println("I have found "+count+" instances of \""+str+"\".");
	}
	
}
