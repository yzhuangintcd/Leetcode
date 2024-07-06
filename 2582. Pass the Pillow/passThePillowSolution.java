
public class passThePillowSolution {
    public int passThePillow(int n, int time) {
        if (n > time) {
            return time + 1;
        } else {

            int numberOfPasses = n - 1;
            int level = time / numberOfPasses;

            if (level % 2 == 0) {
                return (time % numberOfPasses) + 1;
            } else
                return n - (time % numberOfPasses);
        }
    }

    /*  Very Clever Answer:
     * 
     *  public int passThePillow(int n, int time) {
        // represents the number of complete rounds of pillow passing
        int fullRounds = time / (n - 1);

        // represents the remaining time after the complete rounds
        int extraTime = time % (n - 1);

        // If the number of complete rounds is even, the pillow is moving
        // forward. So, the person holding the pillow is at position
        // 'extraTime + 1' since we start from 1.
        // If the number of complete rounds is odd, the pillow is moving
        // backward. So, the person holding the pillow is at position
        // 'n - extraTime'
        return fullRounds % 2 == 0 ? extraTime + 1 : n - extraTime;
    }
     */
}
