class Solution {
  public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode prev = head;
        ListNode curr = head.next;
        while (curr != null){
            if (curr.val == prev.val){
                prev.next = curr.next;
            }
            else{
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
    public static void main(String []args) {
        System.out.println("RemoveDuplicatesfromSortedList");
    }
}
