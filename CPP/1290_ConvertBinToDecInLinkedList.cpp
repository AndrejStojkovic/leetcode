// 1290 - Convent Binary Number in a Linked List to Integer

int getDecimalValue(ListNode* head) {
    if(head == nullptr) return 0;
    if(head->next == nullptr) return head->val;

    ListNode* curr = head;
    int idx = 1;
    while(curr->next != nullptr) {
        idx = idx << 1;
        curr = curr->next;
    }

    int num = 0;
    curr = head;
    while(curr != nullptr) {
        num += curr->val * idx;
        idx = idx >> 1;
        curr = curr->next;
    }

    return num;
}