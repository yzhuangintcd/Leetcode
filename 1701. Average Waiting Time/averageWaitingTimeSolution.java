
public class averageWaitingTimeSolution {
    public double averageWaitingTime(int[][] customers) {

        double waitingTime = 0;
        double readyTime = 0;
        for (int i = 0; i < customers.length; i++) {
            int arriveTime = customers[i][0];
            int timeToPrepare = customers[i][1];
            readyTime = Math.max(readyTime, arriveTime) + timeToPrepare;
            waitingTime += readyTime - arriveTime;
        }
        return (double) waitingTime / customers.length;
    }
}
