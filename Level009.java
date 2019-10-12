/**
 * CSE3040 HW1
 * Level009.java
 * Purpose: find three students with the best exam scores
 * 
 * @version jre1.8.0_191
 * @author Dongseung Baek
 */

import java.util.*;  


public class Level009 {
	public static void main(String[] args) {
		TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
		Scanner sc = new Scanner(System.in);
		int key;
		//get students' scores using treemap(score for the key, and student index for the value)
		System.out.println("Please enter exam scores of each student.");
		for(int i=1;i<6;i++) {
			System.out.print("Score of student "+i+": ");
			map.put(sc.nextInt(), i);
		}
		//print the first place students by getting highest key
		key=map.lastKey();
		System.out.println("The 1st place is student "+map.get(key)+" with "+key+" points.");
		//print the 2nd, 3rd by getting highest value under the 1st, 2nd
		key=map.floorKey(key-1);
		System.out.println("The 2nd place is student "+map.get(key)+" with "+key+" points.");
		key=map.floorKey(key-1);
		System.out.println("The 3rd place is student "+map.get(key)+" with "+key+" points.");		
	}
}
