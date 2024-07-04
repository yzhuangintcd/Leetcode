
public class mergeNodesSolution {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head;
        int zeros = 0;
        // count 0s
        while (temp != null) {
            if (temp.val == 0) {
                zeros++;
            }
            temp = temp.next;
        }

        zeros--;

        ListNode dummy = new ListNode(0); // Dummy node to simplify list creation
        ListNode current = dummy;

        while (zeros != 1) {
            current.next = new ListNode(0);
            current = current.next;
            zeros--;
        }

        int sum = 0;

        temp = head;
        current = dummy;
        while (temp != null) {

            sum += temp.val;

            if (temp.val == 0 && sum != 0) {
                current.val = sum;
                sum = 0;
                current = current.next;
            }

            temp = temp.next;
        }

        return dummy;
    }
}
