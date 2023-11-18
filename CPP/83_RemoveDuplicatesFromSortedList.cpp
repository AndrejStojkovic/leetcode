// 83 - Remove Duplicates From Sorted List

ListNode* deleteDuplicates(ListNode* head) {
    ListNode* curr = head;
    ListNode* prev = nullptr;
    
    while(curr != nullptr) {
        if(prev != nullptr && prev->val == curr->val) {
            prev->next = curr->next;
            curr = curr->next;
            continue;
        }
        prev = curr;
        curr = curr->next;
    }

    return head;
}