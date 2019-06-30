//
// Created by BIGBOSS on 2019-06-27.
//

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution
{
    public:

    ListNode* reverseList(ListNode* head)
    {
        ListNode* last = nullptr;

        while (head)
        {
            ListNode* tmp = head;
            head = head->next;
            tmp->next = last;
            last = tmp;
        }

        return last;
    }
};