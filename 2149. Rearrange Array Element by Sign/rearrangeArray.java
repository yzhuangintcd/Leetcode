public class rearrangeArray {
    public int[] rearrangeArray(int[] nums) {

        // base case

        if (nums.length == 2) {
            if (nums[0] > 0) {
                return nums;
            } else {
                int temp = nums[0];
                nums[0] = nums[1];
                nums[1] = temp;
            }
        }

        int[] positiveArray = new int[nums.length / 2];
        int[] negativeArray = new int[nums.length / 2];
        int pIndex = 0;
        int nIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positiveArray[pIndex] = nums[i];
                pIndex++;
            } else {
                negativeArray[nIndex] = nums[i];
                nIndex++;
            }
        }

        // check the arrays
        // printArray(positiveArray);
        // printArray(negativeArray);

        pIndex = 0;
        nIndex = 0;

        int[] answer = new int[nums.length];
        for (int i = 0; i < answer.length; i++) {
            if (i % 2 == 0) {
                answer[i] = positiveArray[pIndex];
                pIndex++;
            } else {
                answer[i] = negativeArray[nIndex];
                nIndex++;
            }
        }

        return answer;
    }
}
