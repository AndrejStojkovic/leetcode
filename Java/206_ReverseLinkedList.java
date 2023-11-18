// 206 - Reverse Linked List

public ListNode reverseList(ListNode head) {
    if(head == null) return null;

    ListNode next = null, node = null;
    while(head != null) {
        next = head.next;
        head.next = node;
        node = head;
        head = next;
    }

    return node;
}