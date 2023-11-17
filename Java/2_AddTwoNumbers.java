// 2 - Add Two Numbers

public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode node = new ListNode(0);
    ListNode curr = node;
    int carry = 0;

    while(l1 != null || l2 != null || carry > 0) {
        int sum = 0;

        if(l1 != null) {
            sum += l1.val;
            l1 = l1.next;
        }

        if(l2 != null) {
            sum += l2.val;
            l2 = l2.next;
        }

        sum += carry;
        carry = sum / 10;
        curr.next = new ListNode(sum % 10);
        curr = curr.next;
    }

    return node.next;
}