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

    ListNode* deleteDuplicates(ListNode* head)
    {
        if (!head)
            return nullptr;

        ListNode* result = head;
        ListNode* cur = head;

        head = head->next;

        while (head)
        {
            if (head->val != cur->val)
            {
                cur->next = head;
                cur = head;
            }

            head = head->next;
        }

        cur->next = nullptr;

        return result;
    }
};