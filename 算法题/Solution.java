public class Solution {

    private class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode prev = head;
        ListNode next = head;
        while (prev.next != null && next.next != null && next.next.next != null) {
            prev = prev.next;
            next = next.next.next;
            if (prev == next) {
                return true;
            }
        }
        return false;
    }

}
