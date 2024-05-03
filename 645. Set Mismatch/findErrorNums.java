import java.util.*;

public class findErrorNums {

    // 41 / 49
    // public int[] findErrorNums(int[] nums) {
        
    //     int[] answer = new int[2];
    //     Hashtable<Integer, Integer> table = new Hashtable<>();
    //     // iterate through the array
    //     // place each "new" instance into the hash table
    //     // a num has already been stored in the hashtable then we have found the
    //     // repeating num

    //     // then the missing num should only be in the range of
    //     // repeated num - 1 > repeated num > repeated num + 1
    //     // we iterate through the array again and match the indices

    //     for (int i = 0; i < nums.length; i++) {
    //         if (!table.contains(nums[i])) {
    //             table.put(i + 1, nums[i]);
    //         } else {
    //             answer[0] = nums[i];
    //         }
    //     }

    //     for (int i = 1; i <= nums.length; i++) {
    //         if (!table.contains(i)) {
    //             answer[1] = i;
    //         }
    //     }

    //     return answer;
    // }

    // changing the hashtable to int, boolean pair, so less number is been 
    // processed, => reducing number of accesses of the array
    public int[] findErrorNums(int[] nums) {
        int[] answer = new int[2];

        Hashtable<Integer, Boolean> table = new Hashtable<>();
        int n = nums.length;
        int expectedSum = (n * (n + 1) / 2);
        int sum = 0;
        // iterate through the array
        // place each "new" instance into the hash table
        // a num has already been stored in the hashtable then we have found the
        // repeating num

        // then the missing num should only be in the range of
        // repeated num - 1 > repeated num > repeated num + 1
        // we iterate through the array again and match the indices

        for (int num : nums) {
            if (!table.containsKey(num)){
                table.put(num, true);
            }
            else {
                answer[0] = num;
            }
            sum += num;
        }

        answer[1] = expectedSum - sum + answer[0];

        return answer;
    }
}
