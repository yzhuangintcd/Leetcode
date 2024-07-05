import java.util.ArrayList;

// Not really the most efficient solution
public class nodesBetweenCriticalPointsSolution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] answer = new int[2];
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if (length < 3) {
            answer[0] = -1;
            answer[1] = -1;
            return answer;
        }
        temp = head;

        ArrayList<Integer> critialPoints = new ArrayList<>();
        int index = 2;
        while (temp.next.next != null) {

            int firstVal = temp.val;
            int secondVal = temp.next.val;
            int thirdVal = temp.next.next.val;

            if (secondVal > firstVal && secondVal > thirdVal) {
                // secondVal is the local maxima
                critialPoints.add(index);
            }
            if (secondVal < firstVal && secondVal < thirdVal) {
                // secondVal is the local minima
                critialPoints.add(index);
            }
            temp = temp.next;
            index++;
        }
        System.out.println(critialPoints);
        if (critialPoints.size() < 2) {
            answer[0] = -1;
            answer[1] = -1;
            return answer;
        }
        int minimum = 100000;
        for (int i = 0; i < critialPoints.size() - 1; i++) {
            if (critialPoints.get(i + 1) - critialPoints.get(i) < minimum) {
                minimum = critialPoints.get(i + 1) - critialPoints.get(i);
            }
        }
        answer[0] = minimum;
        answer[1] = critialPoints.get(critialPoints.size() - 1) - critialPoints.get(0);

        return answer;
    }
}
