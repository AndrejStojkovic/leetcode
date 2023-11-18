// 141 - Linked List Cycle

bool hasCycle(ListNode *head) {
    if(head == nullptr || head->next == nullptr) return false;

    ListNode* a = head, b = head;
    while(a != nullptr && a->next != nullptr) {
        a = a->next->next;
        b = b->next;
        if(a == b) return true;
    }

    return false;
}