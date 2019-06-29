package ReverseLinkedList.kunlingou;
/**
 * 
 * @author kunlingou
 */
class Solution {
	public class ListNode {
			int val;
			ListNode next;
			ListNode(int x) { val = x; }
	}
    public ListNode reverseList(ListNode head) {
    	if(head == null || head.next == null) return head;
        ListNode h = head,temp;
        while((temp = head.next) != null){
            head.next = temp.next;
            temp.next = h;
            h = temp;
        }
        return h;
    }
    public static void main(String []args) {
        System.out.println("ReverseLinkedList");
    }
}
