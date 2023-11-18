// 160 - Intersection of Two Linked Lists

ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
    unordered_map<ListNode*, int> hash;
    ListNode* curr = headA;

    while(curr != nullptr) {
        hash[curr] = curr->val;
        curr = curr->next;
    }

    curr = headB;

    while(curr != nullptr) {
        if(hash.find(curr) != hash.end()) {
            return curr;
        }
        curr = curr->next;
    }

    return nullptr;
}