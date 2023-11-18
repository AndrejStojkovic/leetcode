// 1290 - Convent Binary Number in a Linked List to Integer

public int getDecimalValue(ListNode head) {
    if(head == null) return 0;
    if(head.next == null) return head.val;

    ListNode curr = head;
    int idx = 1;
    while(curr.next != null) {
        idx = idx << 1;
        curr = curr.next;
    }

    curr = head;
    int num = 0;
    while(curr != null) {
        num += curr.val * idx;
        idx = idx >> 1;
        curr = curr.next;
    }

    return num;
}