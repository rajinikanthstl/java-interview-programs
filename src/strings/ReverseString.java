package strings;

public class ReverseString {
	
	public static void main(String[] args) {
		//converting given string into char array
		char[] str = "selenium for automation testing".toCharArray();
		
		//referencing starting and ending index
		int start = 0;
		int end = str.length-1;
		
		//logic for reversing string
		while(start<end) {
			char temp = str[end];
			str[end] = str[start];
			str[start] = temp;
			start++;
			end--;			
		}
		
		//reversed string
		System.out.println(str);
		
		//another method of reversing string
		char[] c = "selenium for automation testing".toCharArray();;
		
		//reverse logic using for loop
		int j=c.length-1;
		for(int i=0;i<(c.length-1)/2;i++) {
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			j--;
		}
		
		//reversed string
		System.out.println(c);
	}
}
