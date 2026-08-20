package strings;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		//given strings
		String s1 = "silent";
		String s2 = "listen";
		
		//checking for equal length of strings
		if(s1.length()==s2.length()) {
			//converting strings to char array
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			
			//sorting the char arrays
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			//checking for char arrays to be equal
			if(Arrays.equals(c1, c2)) {
				System.out.println("Given Strings are Anagrams");
			}else {
				System.out.println("Given strings are not anagrams");
			}
		}else {
			System.out.println("Given strings are not anagrams");
		}
	}
}
