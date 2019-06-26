 public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode temp = null;
        while (curr != null) {
            ListNode n = curr.next;
            curr.next = temp;
            temp = curr;
            curr = n;
        }
        return temp;        
    }
    public static void main(String []args) {
        System.out.println("GenerateParentheses");
    }

}