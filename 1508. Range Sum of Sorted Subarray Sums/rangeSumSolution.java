import java.util.Arrays;

public class rangeSumSolution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] temp = new int[(n * (n + 1) / 2)];
        int tempIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            temp[tempIndex] = nums[i];
            tempIndex++;
            int sum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                temp[tempIndex] = sum;
                tempIndex++;
            }
        }
        Arrays.sort(temp);
        int sum = 0;
        int mod = (int) (1e9) + 7;
        for (int i = left - 1; i < right; i++) {
            sum += temp[i] % mod;
        }
        return sum;
    }
}
