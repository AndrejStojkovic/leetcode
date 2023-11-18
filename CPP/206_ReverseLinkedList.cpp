// 206 - Reverse Linked List

ListNode* reverseList(ListNode* head) {
    if(head == nullptr) return head;

    ListNode* next = nullptr;
    ListNode* node = nullptr;
    while(head != nullptr) {
        next = head->next;
        head->next = node;
        node = head;
        head = next;
    }

    return node;
}