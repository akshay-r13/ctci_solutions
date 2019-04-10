/*
		Question: Implement an Algorithm to determine if a string has all unique characters

	Doubt 1: What is the character set used?
		There are several character sets that can be used to represent the characters, each of them tell us how many different characters we can expect
			1. ASCII - Most commonly used set. Char stored in 7 bits. Total possible characters = 2^7-1 = 127
			2. Extended ASCII - Same as ASCII but uses 8 bits. Total possible characters = 2^8-1 = 255
			3. Unicode - Used to represent characters outside english, emojis etc. can use 8, 16 or 32 bits.

	Doubt 2: Is external data structure such as an array allowed to be used?

	Doubt 3: Is it allowed to modify the input string? (sorting)

	Approach 1: Brute force Technique
		This is the most naive of all approaches where we use 2 nested loops and compare each character with every other character and return false when
		we encounter a duplicate.
		Time complexity O(n^2)
		No extra space used

	Approach 2: Using sorting
		The given string is sorted based on it's unicode or ASCII value and linearly searched for duplicates
		Time complexity O(n) for search, total runtime depends on sorting method used.
		Space complexity depends on sorting method used

	Approach 3: Using boolean array
		A boolean array in which every element is declared false is initialized. Every position in the array denotes whether the character with the same
		ASCII code as the index has been encountered before or not. (ie) If A (65) is encountered before, bool_array[65] is set True. When a duplicate is
		encountered the function returns False.
		Time complexity O(n)
		Space complexity O(1) Depends on character set and is fixed

	Approach 4: Using bit vector
		Assuming the characters used is from a-z, only lower case alphabets. A bit vector (32 bit integer) can be used to track the occurence of every
		character.

	FOR THE PURPOSE OF THIS PROBLEM, IT IS SAFE TO ASSUME THAT EXTENDED ASCII IS USED. SO WE TAKE 256 POSSIBLE CHARACTERS IN MOST APPROACHES.

*/

import java.util.*;

public class IsUnique {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int ch;
		long startTime = 0, endTime = 0;
		char[] str;
		boolean isUnique = false;
		System.out.print("Enter string to be checked for uniqueness : ");
		String s = in.nextLine();
		str = s.toCharArray();
		System.out.println("Enter the approach to be used");
		System.out.println("1) Brute Force");
		System.out.println("2) Sorting");
		System.out.println("3) Boolean Array");
		System.out.println("4) Bit vector");
		ch = in.nextInt();
		switch(ch){
			case 1:
				startTime = System.currentTimeMillis();
				isUnique = isUniqueBruteForce(str);
				endTime = System.currentTimeMillis();
				break;
			case 2:
				startTime = System.currentTimeMillis();
				isUnique = isUniqueSorting(str);
				endTime = System.currentTimeMillis();
				break;
			case 3:
				startTime = System.currentTimeMillis();
				isUnique = isUniqueBooleanArray(str);
				endTime = System.currentTimeMillis();
				break;
			case 4:
				startTime = System.currentTimeMillis();
				isUnique = isUniqueBitVector(str);
				endTime = System.currentTimeMillis();
				break;
			default:
				System.out.println("Invalid choice !");
		}
		System.out.println("Execution time : " + (endTime - startTime) + "ms");
		if(isUnique)
			System.out.println("Unique");
		else
			System.out.println("Not unique");
	}

	public static boolean isUniqueBruteForce(char[] str){
		
		return true;
	}

	public static boolean isUniqueSorting(char[] str){
		return true;
	}

	public static boolean isUniqueBooleanArray(char[] str){
		return true;
	}

	public static boolean isUniqueBitVector(char[] str){
		return true;
	}
}
