package InvertBinaryTree.Jiucheng;

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode a=head;
        while(a!=null&&a.next!=null){
            if(a.val==a.next.val){
                a.next=a.next.next;
            }else{
                a=a.next;
            }
        }
        return head;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
