#include <iostream>
#include <math.h>
#include <limits.h>
#include <string.h>
using namespace std;
struct ListNode {
     int val;
     ListNode *next;
     ListNode(int x) : val(x), next(NULL) {}
 };
class Solution {
public:
    public:
    ListNode* reverseList(ListNode* head) {
        if (head == NULL)
            return head;
        ListNode* t1 = head;
        ListNode* t2 = t1->next;
        ListNode* t3;
        while (t2 != NULL)
        {
            t3 = t2->next;
            t2->next = t1;
            if (t1 == head)
                t1->next = NULL;
            t1 = t2;
            t2 = t3;
        }
        return t1;
        
    }
    void display(ListNode* head)
    {
        while (head != NULL)
        {
            cout << head->val << "  ";
            head = head->next;
        }
        
    }
};
int main()
{
    Solution s;
    ListNode l1(1),l2(2),l3(3), l4(4), l5(5), l6(6);
    l1.next = &l2;
    l2.next = &l3;
    l3.next = &l4;
    l4.next = &l5;
    l5.next = NULL;
    // s.display(&l1);
    ListNode *head = s.reverseList(&l1);
    s.display(head);
    system("pause");
    return 0;
}