import java.util.HashMap;

public class maxFrequencyElementsSolution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // key, value
        // nums[i], occurences

        // O(N^2)
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int j = i + 1;
            int occurences = 1;
            while (j < nums.length) {
                if (temp == nums[j]) {
                    occurences++;
                }
                j++;
            }
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], occurences);
            }
        }

        int max = 0;
        int freq = 0;

        // this for loops gets me the max value
        for (int value : map.values()) {
            if (value >= max) {
                max = value;
            }
        }

        for (int value : map.values()) {
            if (value == max) {
                freq += value;
            }
        }

        return freq;
    }
}
