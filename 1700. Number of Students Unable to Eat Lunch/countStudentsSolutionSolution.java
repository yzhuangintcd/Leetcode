import java.util.LinkedList;
import java.util.Queue;

public class countStudentsSolutionSolution {
    public static Queue<Integer> arrayToQueue(int[] array) {
        Queue<Integer> queue = new LinkedList<>();
        for (int num : array) {
            queue.offer(num);
        }
        return queue;
    }

    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> studentQueue = arrayToQueue(students);
        Queue<Integer> sandwichQueue = arrayToQueue(sandwiches);

        // if the studentQueue peek == sandwichQueue peek
        // remove both head of the queue
        int rep = 0;
        int count = 0;
        while (!studentQueue.isEmpty()) {

            if (studentQueue.peek() == sandwichQueue.peek()) {
                studentQueue.remove(studentQueue.peek());
                sandwichQueue.remove(sandwichQueue.peek());
                count = 0;
                rep++;
            } else {
                studentQueue.offer(studentQueue.peek());
                studentQueue.remove(studentQueue.peek());
                count++;
            }

            if (count > students.length) {
                return students.length - rep;
            }
        }
        return 0;
    }
}
