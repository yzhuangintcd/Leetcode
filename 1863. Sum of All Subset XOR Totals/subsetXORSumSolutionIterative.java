import java.util.List;
import java.util.ArrayList;

public class subsetXORSumSolutionIterative {

    public int subsetXORSum(int[] nums) {
        int xorSum = 0;
        List<List<Integer>> lists = subsets(nums, xorSum);
        // for (int i = 0; i < lists.size(); i++) {
        //     List<Integer> list = lists.get(i);
        //     int sum = 0;
        //     for (int j = 0; j < list.size(); j++) {
        //         sum ^= list.get(j);
        //     }
        //     xorSum += sum;
        // }
        return xorSum;
    }

    public List<List<Integer>> subsets(int[] nums, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        // Start with an empty subset
        result.add(new ArrayList<>());

        for (int num : nums) {
            // Create new subsets by adding the current number to each existing subset
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> newSubset = new ArrayList<>(result.get(i));
                
                newSubset.add(num);
                result.add(newSubset);
            }
        }

        return result;
    }
}
