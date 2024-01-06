public class RemoveNode {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = null;

        ListNode Removed = removeNthFromEnd(head, 3);
        PrintLinkedList(Removed);

            
    }
    public static void PrintLinkedList(ListNode head){
        while(head != null){
            System.out.println(head.val + " ");
            head = head.next;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy, nth = dummy;
        for(int i=1;i<=n+1;i++){
            current = current.next;
        }
        while (current != null) {
            current = current.next;
            nth = nth.next;
        }
        nth.next = nth.next.next;

        return dummy.next;
    }
}
