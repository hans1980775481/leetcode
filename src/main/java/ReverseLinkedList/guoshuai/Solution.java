package ReverseLinkedList206;
/*
 * 非递归（迭代）：
 *  执行用时 :1 ms, 在所有 Java 提交中击败了77.20%的用户
	内存消耗 :35.9 MB, 在所有 Java 提交中击败了56.21%的用户
	
	
	递归：
	执行用时 :2 ms, 在所有 Java 提交中击败了8.27%的用户
	内存消耗 :36.3 MB, 在所有 Java 提交中击败了55.78%的用户
 */

/*
 * 非递归（迭代）：存在四个变量，分别为前一个（prev），当前的（head），后一个（head.next）和存放下一个值的临时变量（temp）,
 * 				    挨个向后存入值
 */
		   
/*public class Solution {
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		while (head != null) {
			ListNode temp = head.next;   
			head.next = prev;
			prev = head;
			head = temp;
		}
		return prev;
	}
	
}*/

/*
 *  递归(我用我自己)：首先确定返回值，其次确定跳出递归的条件（常见的递归出口是，比如对于list(列表为空，只含有一个元素),
		   对于二叉树(结点为空，结点是叶子结点)，对于链表(头指针为空，只含有一个元素)等等）
		   碰到最后一个节点，返回最后节点 
		   递归过程：下一个节点指向当前节点，当前节点指向空，因为递归栈保存了当前节点，
		   所以不用担心当前节点丢失
 */
public class Solution {
	public ListNode reverseList(ListNode head) {
		if(head==null||head.next==null) {
			return head;
		}
		ListNode res=reverseList(head.next);
		head.next.next=head;
		head.next=null;
		return res;
	}
	
}