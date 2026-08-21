package strings;

public class FrequencyOfChars2 {

	public static void main(String[] args) {
		
		 //given string 
        String str = "automation";
        
        //converting the given string to char array
        char[] c = str.toCharArray();
        
        //declaring and int array to store frequency
        int[] freq = new int[c.length];
        
        //iterating the char array with nested for loop
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c.length;j++){
                //storing the frequency into freq array
                if(c[i]==c[j])
                 freq[i]++;
            }
        }
        
        //printing the elements of char array with frequency
        for(int i=0;i<c.length;i++)
             System.out.println(c[i]+"->"+freq[i]);
	}
}
