public class InverseLinkedList {
    public static void main(String[] args) {

        ListNode  head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = null;

        ListNode reversedListNode = reverseList(head);
        printLinkedList(reversedListNode);
    }
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode NewHead = reverseList(head.next);
        head.next.next= head;
        head.next = null;

        return NewHead;        
    }
    public static void printLinkedList(ListNode head){
        while (head != null) {
            System.out.print(head.val +" ");
            head = head.next;
        }
    }
}
