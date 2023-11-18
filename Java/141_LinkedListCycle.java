// 141 - Linked List Cycle

public boolean hasCycle(ListNode head) {
    if(head == null || head.next == null) return false;

    ListNode a = head, b = head;
    while(a != null && a.next != null) {
        a = a.next.next;
        b = b.next;
        if(a == b) return true;
    }

    return false;
}