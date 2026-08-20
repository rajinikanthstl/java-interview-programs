package strings;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChars {
	
	public static void main(String[] args) {
		//given string
		String str = "automation";
		
		//declaring a hashmap for storing frequency
		Map<Character,Integer> map = new HashMap<>();
		
		//converting the string to a char array for iterating
		for(char c:str.toCharArray()) {
			//adding chars and number of occurrence as key, values into map
			if(map.containsKey(c))
				map.put(c,map.get(c)+1);
			else
				map.put(c,1);
		}
		
		//printing the map with frequency of each char in string
		System.out.println(map.entrySet());
	}

}
