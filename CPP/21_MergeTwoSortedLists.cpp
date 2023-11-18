// 21 - Merge Two Sorted Lists

ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
    if(list1 == NULL) {
        return list2;
    }

    if(list2 == NULL) {
        return list1;
    }

    ListNode* head = new ListNode(0);
    ListNode* ptr = head;

    while(list1 != nullptr || list2 != nullptr) {
        int n = 0;

        if(list1 != nullptr && list2 != nullptr) {
            if(list1->val <= list2->val) {
                n = list1->val;
                list1 = list1->next;
            } else {
                n = list2->val;
                list2 = list2->next;
            }
        } else if(list1 != nullptr) {
            n = list1->val;
            list1 = list1->next;
        } else if(list2 != nullptr) {
            n = list2->val;
            list2 = list2->next;
        }

        ptr->next = new ListNode(n);
        ptr = ptr->next;
    }

    return head->next;
}