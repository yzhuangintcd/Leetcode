import java.util.List;
import java.util.ArrayList;

public class subsetXORSumSolutionRecursive {

    public int subsetXORSum(int[] nums) {

        int xorSum = 0;
        List<List<Integer>> lists = subsets(nums);
        for (int i = 0; i < lists.size(); i++) {
            List<Integer> list = lists.get(i);
            int sum = 0;
            for (int j = 0; j < list.size(); j++) {
                sum ^= list.get(j);
            }
            xorSum += sum;
        }
        return xorSum;
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            generateSubsets(i + 1, nums, current, result);
            current.remove(current.size() - 1);
        }
    }
}
