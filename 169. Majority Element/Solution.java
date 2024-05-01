import java.util.*;

public class Solution {
    public int majorityElement(int[] nums) {
        Integer answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int k = map.get(nums[i]);
                k++;
                map.replace(nums[i], k);
            }
        }

        System.out.println(map);
        answer = (Collections.max(map.values()));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (answer.equals(entry.getValue())) {
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }
}
