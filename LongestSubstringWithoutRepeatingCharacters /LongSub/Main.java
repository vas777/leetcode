package LongSub;

public class Main {
	public static void main(String []args) {
		
		Solution solution = new Solution();
		//String str = "aabck";//4
	    //String str = "anviaj";//5
	  // String str = "aabbccc";//2
		//String str = "aaaaa";//1
		 
		
		//String str = "vbxpvwkkteaiob";//7
		
		//String str = "abcabcbb";//3
		
		//String str = "dvdf";//3

		String  str = ""
				+ "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ "
				+ "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ ";
			
			
			
		System.out.println(solution.lengthOfLongestSubstring(str));
	}

}
