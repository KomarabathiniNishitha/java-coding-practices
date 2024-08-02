package practice;


	public class ReverseString {
	    public static String reverse(String input) {
	        char[] chars = input.toCharArray();
	        int left = 0, right = input.length() - 1;
	        
	        while (left < right) {
	            char temp = chars[left];
	            chars[left] = chars[right];
	            chars[right] = temp;
	            left++;
	            right--;
	        }
	        
	        return new String(chars);
	    }

	    public static void main(String[] args) {
	        String str = "Nishitha";
	        System.out.println("Reversed string: " + reverse(str));
	    }
	}