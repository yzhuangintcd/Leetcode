import java.util.*;

public class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        // check length of each array
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        ArrayList<Integer> al = new ArrayList<>();
        if (nums1.length >= nums2.length) {
            for (int i = 0; i < nums2.length; i++) {
                ht.put(nums2[i], ht.getOrDefault(nums2[i], 0) + 1);
            }
            for (int i = 0; i < nums1.length; i++) {
                int count = ht.getOrDefault(nums1[i], 0);
                if (count > 0) {
                    al.add(nums1[i]);
                    ht.put(nums1[i], count - 1);
                }
            }
        } else {
            for (int i = 0; i < nums1.length; i++) {
                ht.put(nums1[i], ht.getOrDefault(nums1[i], 0) + 1);
            }
            for (int i = 0; i < nums2.length; i++) {
                int count = ht.getOrDefault(nums2[i], 0);
                if (count > 0) {
                    al.add(nums2[i]);
                    ht.put(nums2[i], count - 1);
                }
            }
        }

        System.out.println(al);
        return convertToArray(al);
    }

    public static int[] convertToArray(ArrayList<Integer> arrayList) {
        int[] intArray = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            intArray[i] = arrayList.get(i);
        }
        return intArray;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // edge case
        if (l1.val == 0 && l2.val == 0)
            return new ListNode(0);

        long tmp1 = 0;
        long tmp2 = 0;
        long tmpAnswer = 0;
        long multiplier = 1;

        // add the two numbers up to get an int

        while (l1 != null) {
            tmp1 += (l1.val * multiplier);
            l1 = l1.next;
            multiplier *= 10;
        }

        multiplier = 1;

        while (l2 != null) {
            tmp2 += (l2.val * multiplier);
            l2 = l2.next;
            multiplier *= 10;
        }

        tmpAnswer = tmp1 + tmp2;

        ListNode lead = new ListNode(0);
        ListNode answer = lead;
        // testing // return new ListNode (tmp2);
        while (tmpAnswer > 0) {
            ListNode temp = new ListNode((int) tmpAnswer % 10);
            tmpAnswer /= 10;
            answer.next = temp;
            answer = answer.next;

            // ListNode extraNode = new ListNode(tmpAnswer%10);
            // //answer.val = tmpAnswer % 10;
            // tmpAnswer = tmpAnswer / 10;
            // answer.next = extraNode;
            // answer = answer.next;
        }
        return lead.next;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        int answer = 0;
        // prefix sum method
        // int[] prefixArray = new int[nums.length];
        // prefixArray[0] = nums[0];
        // for (int i = 1; i < nums.length; i++) {
        // prefixArray[i] = prefixArray[i - 1] + nums[i];
        // }
        // if (goal < prefixArray[nums.length]){
        // return 0;
        // }
        // else {
        // }
        // sliding window method

        // find the minimum length of the goal, since the array is in binary, the amount
        // of ones / length
        // is determined by the goal
        int length = goal == 0 ? 1 : goal;
        // so we will check all the sub array with length 'length'
        // then increase the length until it is equal to nums.length
        while (length < nums.length) {
            int windowSum = 0;
            for (int i = 0; i < length; i++) {
                windowSum += nums[i];
            }
            if (windowSum == goal)
                answer++;
            for (int i = length; i < nums.length; i++) {
                windowSum += nums[i] - nums[i - length];
                if (windowSum == goal)
                    answer++;
            }
            length++;
        }
        return answer;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        int answer = 0;

        return answer;
    }

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int maxCapital = 0;
        int currCapital = w;
        PriorityQueue<Integer> profitPq = new PriorityQueue<>();
        for (int i = 0; i < profits.length; i++) {
            profitPq.offer(profits[i]);
        }
        return maxCapital;
    }

    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int answer = 0;
        int minimumAnswer = 0;
        int greatestSumSubArray = 0;
        for (int i = 0; i < customers.length; i++) {
            int sumOfSubArray = 0;
            for (int j = 0; j < minutes; j++) {
                sumOfSubArray += customers[j];
            }
            if (sumOfSubArray > greatestSumSubArray) {
                greatestSumSubArray = sumOfSubArray;
            }
        }
        for (int i = 0; i < grumpy.length; i++) {
            if (grumpy[i] == 0) {
                minimumAnswer += customers[i];
            }
        }
        return answer;
    }

    // Helper Function to print out array of int
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Helper Function to print out 2d array of int
    public void printGrid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] profits = { 1, 2, 2 }; // profit of each projects
        int[] capital = { 0, 1, 1 }; // capital of each projects
        int k = 2; // number of projects
        int w = 0; // initial capital

        int[] customers = { 1, 0, 1, 2, 1, 1, 7, 5 };
        int[] grumpy = { 0, 1, 0, 1, 0, 1, 0, 1 };
        int minutes = 3;

        // System.out.println(s.maxSatisfied(customers, grumpy, minutes));

        // int[] nums = { 0, 1, 0, 1, 0, 1, 0, 1, 0 };
        // int goal = 4;
        // System.out.println(s.numSubarraysWithSum(nums, goal));
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };

        s.printArray(s.intersect(nums1, nums2));
    }

}
