/**
 * CSE3040 HW1
 * Level007.java
 * Purpose: count the number of the user-input letter in the user-input text
 * 
 * @version jre1.8.0_191
 * @author Dongseung Baek
 */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Level007 {
	
	public static void main(String[] args) throws Exception{
		int count=0;
		InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        //scan a text by a line
        System.out.print("Enter a text: ");
        String text = br.readLine();
        String letter;
        //scan a letter
        while(true) {
        System.out.print("Enter a letter: ");
		letter = br.readLine();
		if(letter.length()==1) {
			break;
		}
		System.out.println("Your input must be a letter!");
        }
        //count how many letters does the text contains
		while(true) {
			if(text.contains(letter)) {
				//check if the text contains the letter
				count++;
				//if it does, get the first index of the letter
				//get the substring starts from just next index
				//keep checking until the substring dosn't contain the letter
				text=text.substring(text.indexOf(letter)+1);
			}
			else {
				break;
			}
		}
		System.out.println("There are "+count+" "+letter+"'s in the text.");
	}
	

	
}
