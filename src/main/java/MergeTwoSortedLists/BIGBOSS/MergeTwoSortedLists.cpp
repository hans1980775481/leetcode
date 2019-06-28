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

    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2)
    {
        if (!l1 && l2) return l2;
        if (l1 && !l2) return l1;
        if (!l1 && !l2) return nullptr;

        ListNode* result = l1->val < l2->val ? l1 : l2;
        ListNode* cur = result;

        if (l1 == cur)
            l1 = l1->next;
        else
            l2 = l2->next;

        while (l1 && l2)
        {
            if (l1->val < l2->val)
            {
                cur->next = l1;
                l1 = l1->next;
            }
            else
            {
                cur->next = l2;
                l2 = l2->next;
            }

            cur = cur->next;
        }

        if (l1)
            cur->next = l1;

        if (l2)
            cur->next = l2;

        return result;
    }
};