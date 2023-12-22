public class LinkedListCycle {
    public static void main(String[] args) {
        
    }
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        // while (slow != null && fast != null && fast.next != null) {
        //     slow = head.next;
        //     fast = head.next.next;
        //     if (slow == fast) {
        //         return true;
        //     }
        // }

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
