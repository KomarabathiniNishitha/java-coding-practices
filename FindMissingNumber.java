package practice;


	import java.util.Arrays;

	public class FindMissingNumber {
	    public static int findMissingNumber(int[] nums) {
	        int n = nums.length + 1;
	        int sumOfNNumbers = n * (n + 1) / 2;
	        int sumOfArray = Arrays.stream(nums).sum();
	        return sumOfNNumbers - sumOfArray;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 4, 5, 6}; // Example array
	        System.out.println("The missing number is: " + findMissingNumber(nums));
	    }
	}
