import java.util.HashMap;
import java.util.Map;

//
//public class TwoSum {
//   
//    public int[] twoSum(int[] nums, int target) {
//      for(int i = 0; i<nums.length;i++){
//        	
//            for(int k = 1; k<nums.length;k++){
//            
//               if((i!=k)&&((nums[i]+nums[k])==target)){
//            	  
//            	  return new int[] {i,k};
//               } 
//            }
//        }
//         return null;
//    }
//  }
public class TwoSum {

public int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < numbers.length; i++) {
        if (map.containsKey(target - numbers[i])) {
            result[1] = i + 1;
            result[0] = map.get(target - numbers[i]);
            return result;
        }
        map.put(numbers[i], i + 1);
    }
    return result;
}}