// 876 - Middle of Linked List

ListNode* middleNode(ListNode* head) {
    ListNode* a = head;
    ListNode* b = head;
    while(b != nullptr && b->next != nullptr) {
        a = a->next;
        b = b->next->next;
    }
    return a;
}