public class RemoveLinkedListElement {
    public static void main(String[] args) {
        //Using before created LinkedList
        LinkedListReady obj = new LinkedListReady();
        ListNode newList = removeElements(obj.LinkedList(), 2);

        while (newList != null) {
            System.out.println(newList.val);
            newList = newList.next;
        }
    }
    public static ListNode removeElements(ListNode head, int val) {
       ListNode sentinel = new ListNode(0);
       sentinel.next = head;

       ListNode prev = sentinel, current =  head;
       while (current != null) {
            if (current.val == val) {
                prev.next = current.next;
            }else{
                prev = current;
            }
            current = current.next;
       }
        
        return sentinel.next;
    }
}
