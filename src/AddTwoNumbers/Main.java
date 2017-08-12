package AddTwoNumbers;

public class Main {
	public static void main(String args[]) {
		
		
ListNode l1 = new ListNode(0,new ListNode(0,new ListNode(0,
		      new ListNode(0,new ListNode(0,new ListNode(0,
		      new ListNode(0, new ListNode(0,new ListNode(0,new ListNode(9,null))))))))));
		
ListNode l2 = new ListNode(0,new ListNode(9,new ListNode(9,
		      new ListNode(9,new ListNode(9,new ListNode(9,
		      new ListNode(9,new ListNode(9,new ListNode(9,null)))))))));

	//	ListNode l1 = new ListNode(9,new ListNode(9,new ListNode(9,null )));
	//	ListNode l1 = new ListNode(9,null);
	//	ListNode l2 = new ListNode(1,null);
		
		Solution  solution = new Solution();
		
		ListNode res = solution.addTwoNumbers(l1, l2);
		
		ListNode cursor = res;
		
		while(cursor!=null){
			
			System.out.println(cursor.val);
			cursor = res.next;
			res = cursor;
			
		}
		
		
	}
}
