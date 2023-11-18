// 160 - Intersection of Two Linked Lists

public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    Map<ListNode, Integer> hash = new HashMap<>();
    ListNode curr = headA;

    while(curr != null) {
        hash.put(curr, curr.val);
        curr = curr.next;
    }

    curr = headB;

    while(curr != null) {
        if(hash.containsKey(curr)) {
            return curr;
        }
        curr = curr.next;
    }

    return null;
}