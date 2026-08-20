package strings;

public class RetainSpacesInReverse {
	
	public static void main(String[] args) {
		
		//given string
		String str = "java for automation testing";
		
		String rev = "";
		
		//declaring empty char array with string length
		char[] c = new char[str.length()];
		
		//retaining spaces into a char array
		for(int i=0;i<c.length;i++) {
			if(str.charAt(i)==' ')
				c[i]=' ';
			else
				c[i]='*';
		}
		
		//reversing the given string without any spaces in between
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)==' ')
				continue;
			else
				rev+=str.charAt(i);
		}
		
		//storing the string chars in reverse with spaces preserved
		for(int i=0,j=0;i<=c.length-1;i++) {
			if(c[i]==' ')
				continue;
			else
				c[i]=rev.charAt(j++);
		}
		
		//reverse string with preserved spaces
		System.out.println(c);
	}
}
