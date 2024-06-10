import java.util.HashMap;

public class subarraysDivByKSolution {
    public int subarraysDivByK(int[] nums, int k) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = sum % k;
            if (remainder < 0)
                remainder += k;
            if (map.containsKey(remainder))
                answer += map.get(remainder);
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        return answer;
    }
}
