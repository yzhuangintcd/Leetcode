
public class sortColorsSolution {
    public void sortColors(int[] nums) {
        int count0s = 0;
        int count1s = 0;
        int count2s = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count0s++;
            } else if (nums[i] == 1) {
                count1s++;
            } else {
                count2s++;
            }
        }

        int index = 0;
        while (count0s != 0) {
            nums[index] = 0;
            index++;
            count0s--;
        }
        while (count1s != 0) {
            nums[index] = 1;
            index++;
            count1s--;
        }
        while (count2s != 0) {
            nums[index] = 2;
            index++;
            count2s--;
        }
    }
}
