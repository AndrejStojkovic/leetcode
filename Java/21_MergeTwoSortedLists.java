// 21 - Merge Two Sorted Lists

public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if(list1 == null) {
        return list2;
    }

    if(list2 == null) {
        return list1;
    }

    ListNode head = new ListNode(0);
    ListNode ptr = head;

    while(list1 != null || list2 != null) {
        int n = 0;

        if(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                n = list1.val;
                list1 = list1.next;
            } else {
                n = list2.val;
                list2 = list2.next;
            }
        } else if(list1 != null) {
            n = list1.val;
            list1 = list1.next;
        } else if(list2 != null) {
            n = list2.val;
            list2 = list2.next;
        }

        ptr.next = new ListNode(n);
        ptr = ptr.next;
    }

    return head.next;
}