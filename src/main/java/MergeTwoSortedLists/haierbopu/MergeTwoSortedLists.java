class Solution {
  public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }

        ListNode ans = new ListNode(0);
        ans.next = l1;
        ListNode curr = ans;
        ListNode n = null;
        ListNode temp = null;

        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                l1 = l1.next;
            }
            else{
                n = curr.next;
                curr.next = l2;
                temp = l2.next;
                l2.next = n;
                l2 = temp;
            }
            curr = curr.next;
        }

        if (l1 == null){
            curr.next = l2;
        }
        else{
            curr.next = l1;
        }

        return ans.next;
    }
    public static void main(String []args) {
        System.out.println("MergeTwoSortedLists");
    }
}
