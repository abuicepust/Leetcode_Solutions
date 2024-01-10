public class ReverseLinkedList {
    public static void main(String[] args) {
        
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;

        int length = 0;
        ListNode tail = head;

        while (tail.next != null) {
            length++;
            tail = tail.next;
        }
    }
}
