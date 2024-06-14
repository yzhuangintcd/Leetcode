import java.util.Arrays;

public class minIncrementForUniqueSolution {
        public int minIncrementForUnique(int[] nums) {
        int increments = 0;
        Arrays.sort(nums);
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= prev) {
                increments += prev + 1 - nums[i];
                nums[i] = prev + 1;
            }
            prev = nums[i];
        }
        return increments;
    }
}
