package arrays;

public class SecondHighest {
	public static void main(String[] args) {
		//given array
		int[] nums = {23,22,12,34,21};
		
		//declaring largest and second largest variables with minimum values
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		//iterating the array with for loop
		for(int no:nums) {
			//check for the current number is greater than largest 
			if(no>largest) {
				secondLargest = largest;
				largest = no;
			}
			//check for the current number lies between largest and second largest
			else if(no<largest && no>secondLargest) {
				secondLargest=no;
			}
		}
		
		//printing the second largest number
		System.out.println(secondLargest);
	}
}
