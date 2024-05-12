
public class hasCycleSolution {
    public boolean hasCycle(ListNode head) {

        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return false;
        }
        ListNode pointer1 = head;
        ListNode pointer2 = head.next;

        while (pointer1 != pointer2) {
            if (pointer2 == null || pointer2.next == null) {
                return false;
            }
            pointer1 = pointer1.next;
            pointer2 = pointer2.next.next;
        }

        return true;
    }
}
