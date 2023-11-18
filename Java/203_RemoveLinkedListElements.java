// 203 - Remove Linked List Elements

public ListNode removeElements(ListNode head, int val) {
    if(head == null) return null;

    ListNode node = new ListNode(0);
    node.next = head;
    ListNode curr = node;

    while(curr.next != null) {
        if(curr.next.val == val) {
            curr.next = curr.next.next;
            continue;
        }
        curr = curr.next;
    }

    return node.next;
}