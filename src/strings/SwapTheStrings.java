package strings;

public class SwapTheStrings {
	
	public static void main(String[] args) {
		
		//given strings
		String s1 = "selenium";
		String s2 = "playwright";
		
		s2 = s1+s2;  //s2 = seleniumpython
		
		//swapping using substring function
		s1 = s2.substring(s1.length()); //s1 = python
		s2 = s2.substring(0,s2.length()-s1.length()); //s2 = selenium
		
		//strings after swapping
		System.out.println(s1);
		System.out.println(s2);
	}

}
