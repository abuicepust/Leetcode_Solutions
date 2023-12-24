import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        LinkedListReady obj = new LinkedListReady();
        System.out.println(isPalindrome(obj.LinkedList()));
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            if (list.get(start) != list.get(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

class LinkedListReady {
    public ListNode LinkedList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        //head.next.next.next.next = new ListNode(5);
        //head.next.next.next.next.next = null;

        return head;
    }
}
