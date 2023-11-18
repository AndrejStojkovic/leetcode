// 83 - Remove Duplicates From Sorted List

public ListNode deleteDuplicates(ListNode head) {
    ListNode curr = head;
    ListNode prev = null;
    
    while(curr != null) {
        if(prev != null && prev.val == curr.val) {
            prev.next = curr.next;
            curr = curr.next;
            continue;
        }
        prev = curr;
        curr = curr.next;
    }

    return head;
}