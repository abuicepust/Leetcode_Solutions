public class AddTwoNumber {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(3);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(5);
        ListNode Sum = addTwoNumbers(l1, l2);
        while (Sum != null) {
            System.out.print(Sum.val + " ");
            Sum = Sum.next; 
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode p = l1, q = l2, curr = dummy;
        int carry = 0;
        while(p != null || q != null){

            int x = p != null? p.val : 0;
            int y = q != null? q.val : 0;

            int sum = x + y + carry;
            carry = sum/10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummy.next;
    }
}
