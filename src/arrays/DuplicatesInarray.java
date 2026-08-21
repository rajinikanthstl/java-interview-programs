package arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInarray {
	
	public static void main(String[] args) {
		//given array of integers
		int[] nums = {22,45,12,55,22,16,12,22};
		
		//declaring an empty set to store integers
		Set<Integer> s = new HashSet<>();
		
		//declaring an empty set to store repeated unique values
		Set<Integer> repeated = new HashSet<>();
		
		//iterating through the array and adding repeated values to set
		for(int i=0;i<nums.length;i++) {
			if(!s.add(nums[i]))
				repeated.add(nums[i]);
		}
		
		//printing unique repeated values
		System.out.println(repeated);
	}

}
