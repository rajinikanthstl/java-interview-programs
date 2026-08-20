package strings;

public class ReversingEachWord {
	
	public static void main(String[] args) {
		//given string
		String str = "playwright for automation testing";
		String rev = "";
		
		//converting string into array of strings using split()
		for(String s:str.split(" ")) {
			//reversing the word of string
			for(int i=s.length()-1;i>=0;i--) {
				rev+=s.charAt(i);
			}
			//adding space after each word
			rev+=" ";
		}
		
		//printing the string with reversed words
		System.out.println(rev.trim());
	}
}
