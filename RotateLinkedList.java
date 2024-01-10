public class RotateLinkedList {
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
        length++;
        tail.next = head;
        int RotatePoint = length - k % length;

        tail = head;
        while (RotatePoint-- > 1) {
            tail = tail.next;
        }
        head = tail.next;
        tail.next = null;

        return head;
    }
}
