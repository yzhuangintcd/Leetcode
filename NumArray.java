public class NumArray {

    int[] prefixSumArray;

    public NumArray(int[] nums) {

        this.prefixSumArray = new int[nums.length];
        prefixSumArray[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefixSumArray[i] = prefixSumArray[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return this.prefixSumArray[right];
        } else
            return this.prefixSumArray[right] - this.prefixSumArray[left - 1];
    }

    void main(String[] args) {
        int[] nums = { -2, 0, 3, -5, 2, -1 };
        NumArray obj = new NumArray(nums);
        System.out.println(obj.sumRange(0, 2));
        System.out.println(obj.sumRange(2, 5));
        System.out.println(obj.sumRange(0, 5));
    }
}
