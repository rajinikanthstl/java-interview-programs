package arrays;

public class MaxOrMin {
	
	public static void main(String[] args) {
		//given array
		int[] nums = {10,5,12,31,2,14};
		
		int min = nums[0]; //initializing min and max variables
		int max = nums[0];
		//iterating through the array
		for(int i=0;i<nums.length-1;i++) {
			if(min>nums[i])					//checking for minimum value
				min=nums[i];
			if(max<nums[i])					//checking for maximum value
				max=nums[i];
		}
		//printing minimum and maximum value
		System.out.println("Minimum value:"+min);
		System.out.println("Maximum value:"+max);
	}
}
