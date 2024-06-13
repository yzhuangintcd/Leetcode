import java.util.Arrays;

public class minMovesToSeatSolution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int minMoves = 0;
        // ArrayList<Integer> seatList = new ArrayList<>();
        // ArrayList<Integer> studentList = new ArrayList<>();
        // for (int i = 0; i < students.length; i++) {
        // seatList.add(seats[i]);
        // }
        // for (int i = 0; i < students.length; i++) {
        // studentList.add(students[i]);
        // }
        // Collections.sort(seatList);
        // Collections.sort(studentList);
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < students.length; i++) {
            minMoves += Math.abs(seats[i] - students[i]);
        }
        // int minI = -1;
        // int minJ = -1;
        // for (int i = 0; i < studentList.size();) {
        // int min = Integer.MAX_VALUE;
        // for (int j = 0; j < seatList.size(); j++) {
        // if (Math.abs(studentList.get(i) - seatList.get(j)) <= min) {
        // min = Math.abs(studentList.get(i) - seatList.get(j));
        // minI = i;
        // minJ = j;
        // }
        // }
        // minMoves += min;
        // studentList.remove(minI);
        // seatList.remove(minJ);
        // }
        return minMoves;
    }
}
