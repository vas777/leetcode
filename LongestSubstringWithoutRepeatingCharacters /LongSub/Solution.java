package LongSub;
//Given a string, find the length of the longest substring without repeating characters.
//
//Examples:
//
//Given "abcabcbb", the answer is "abc", which the length is 3.
//
//Given "bbbbb", the answer is "b", with the length of 1.
//
//Given "pwwkew", the answer is "wke", with the length of 3. 
//Note that the answer must be a substring, "pwke" is a subsequence and not a substring.


public class Solution {
	
	public int lengthOfLongestSubstring(String s) {
		StringBuilder answer1 = new StringBuilder();
		int max = 0;
		
		if (s == null){
			return 0;
		}else if(s.length()==0) {
			return 0;
		}else if(s.length()==1) {
			return 1;
		}else if (s.length()>95) {
			return 95;
		}
		
		answer1.append(s.substring(0,1));
				
		for(int i = 1; i<s.length(); i++){
			
			boolean unique = answer1.indexOf(s.substring(i, i+1)) == -1;
			boolean neighborSame = s.charAt(i-1) == s.charAt(i);
			int length = 0;
			
			if(unique) {
				answer1.append(s.substring(i,i+1));
				length = answer1.length();									
			}else{
				
				if(neighborSame){
				
				length = answer1.length();
				answer1.delete(0, i);
				answer1.append(s.substring(i,i+1));
								
				}else {
				
					answer1.delete(0, i);	
					char find = s.charAt(i);

						while(true){
							i--;
						if(s.charAt(i)==find){
							break;
						}
						
					}
				
				}
			
			}		
					
			if(length>max){
				max = length;
			}
			
		}
				
		return max;
        
    }

}
