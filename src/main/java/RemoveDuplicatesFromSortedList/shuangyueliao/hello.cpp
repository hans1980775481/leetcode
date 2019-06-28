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
    ListNode* deleteDuplicates(ListNode* head) {
        if (head == NULL)
            return NULL;
        ListNode *cur = head;
        ListNode *t = head->next;
        while (t != NULL)
        {
            while (cur->val == t->val)
            {
                t = t->next;
            }
            cur->next = t;
            cur = cur->next;
            if (t == NULL)
                break;
            t = t->next;
        }
        return head;
        
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
    ListNode l1(1),l2(2),l3(2), l4(4), l5(4), l6(6);
    l1.next = &l2;
    l2.next = &l3;
    l3.next = &l4;
    l4.next = &l5;
    l5.next = NULL;
    // s.display(&l1);
    ListNode *head = s.deleteDuplicates(&l1);
    s.display(head);
    system("pause");
    return 0;
}