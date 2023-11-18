// 876 - Middle of Linked List

public ListNode middleNode(ListNode head) {
    ListNode a = head, b = head;
    while(b != null && b.next != null) {
        a = a.next;
        b = b.next.next;
    }
    return a;
}