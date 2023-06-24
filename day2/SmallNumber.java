package week1.day2;

public class SmallNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		int temp;
		int nums[]= {7,9,21,22,23};
	    for (int i = 0; i < nums.length; i++) {
		for (int j = i+1; j < nums.length; j++) {
		if (nums[i]>nums[j]) {
		temp=nums[i];
		nums[i]=nums[j];
	    nums[j]=temp;
		}
		}	
		}
	System.out.println("second smallest number is " +nums[1]);

	}

}
