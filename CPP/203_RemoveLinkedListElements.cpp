// 230 - Remove Linked List Elements

ListNode* removeElements(ListNode* head, int val) {
    if(head == nullptr) return nullptr;

    ListNode* node = new ListNode(0);
    node->next = head;
    ListNode* curr = node;
    
    while(curr->next != nullptr) {
        if(curr->next->val == val) {
            curr->next = curr->next->next;
            continue;
        }
        curr = curr->next;
    }

    return node->next;
}