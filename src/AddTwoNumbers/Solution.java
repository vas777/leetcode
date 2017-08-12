package AddTwoNumbers;

public class Solution {
	
	int value1,value2,result;
	static int extraOne;
	ListNode answer,current,next;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	
    	answer  = new ListNode(0);
    	answer.next = null;
    	current = answer; 
          	      
    	while( ( l1 != null) || (l2!=null) || extraOne!=0){
    		
    		value1 = l1 != null ? l1.val  : 0;
    		l1     = l1 != null ? l1.next : null;
    		
    		value2 = l2 != null ? l2.val  : 0;
    		l2     = l2 != null ? l2.next : null;
    		 
    		result = value1 + value2 + current.val;
    		
    		if(  result >= 10){
    			
    			extraOne = 1;
    			current.val=current.val+result-10;
    			
    			next = new ListNode(extraOne);
    			next.next = null;
    			current.next= next;
    			current = next;
    			
        	}else if(result < 10){
        		
        		extraOne = 0;
        		current.val=current.val+result;
        		
        		if(l1 != null || l2!=null){
        			next = new ListNode(extraOne);
        			next.next = null;
        			current.next = next;
        			current = next;
        		
        		}else{
        			current.next = null;
        		}
    			
       		}
    	
      	}
    	return answer;
    }
}


//public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//	return jk(l1, l2, 0);
//}
//public static ListNode jk(ListNode l1, ListNode l2,int carry){
//	if(l1 == null && l2 == null && carry ==0)
//		return null;
//	int sum = 0;
//	sum = carry + (l1==null?0:l1.val) +(l2==null?0:l2.val);
//	if(sum>=10){
//		sum = sum - 10;
//		carry = 1;
//	}else{
//		carry = 0;
//	}
//	ListNode tmp = new ListNode(sum);
//	tmp.next = jk(l1==null?null:l1.next, l2==null?null:l2.next, carry);
//	return tmp;
//}

    