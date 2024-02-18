import java.util.*;

class Solution {
    public int climbStairs(int n) {
        // We can find that if there is x stairs(x is a number),
        // the number of ways to climb is the ways to climb x-1 plus the ways to climb
        // x-2
        HashMap<Integer, Integer> map = new HashMap<>();

        if (n == 0 || n == 1)
            return 1;
        if (n == 2 || n == 3)
            return n;
        map.put(0, 1);
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        // else return climbStairs(n-1) + climbStairs(n-2);
        // 0 -> 1
        // 1 -> 1
        // 2 -> 2
        // 3 -> 3
        // 4 -> 5
        // 5 -> 8
        // ...
        for (int i = 4; i <= n; i++) {
            map.put(i, map.get(i - 1) + map.get(i - 2));
        }
        return map.get(n);
    }

    public int[] findErrorNums(int[] nums) {
        int[] answer = new int[2];
        int j = 1;
        for (int i = 0; i < nums.length; i++, j++) {
            if (nums[i] != j) {
                answer[0] = i;
                answer[1] = j;
                break;
            }
        }
        return answer;
    }

    // this is NOT a good solution
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new LinkedList<>();
        int arr[] = { 12, 23, 34, 45, 56, 67, 78, 89,
                123, 234, 345, 456, 567, 678, 789,
                1234, 2345, 3456, 4567, 5678, 6789,
                12345, 23456, 34567, 45678, 56789,
                123456, 234567, 345678, 456789,
                1234567, 2345678, 3456789,
                12345678, 23456789,
                123456789 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= low && arr[i] <= high) {
                list.add(arr[i]);
            }
            if (arr[i] > high) {
                break;
            }
        }
        return list;
    }

    public int firstUniqChar(String s) {
        // use a stack - not a good idea
        int answer = -1;

        // make a stringbuilder and use sub arrays?
        // how about we add the unique letter into the stringbuilder
        // like we can:
        // - put the first char into a variable,
        // - iterate through the string for search for the char
        // - if doesn't find it
        // -- add it to the sb
        // - if it finds it
        // -- skip to the next letter

        // if the sb is empty at the end, it means there is no unique char
        // - return -1
        // if the sb is non-empty then we can take the first letter of sb
        // return the index of that letter on the inputted string

        // the logic above works but exceeded the time limit
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            count = 0;
            for (int j = 0; j < s.length(); j++) {
                char temp2 = s.charAt(j);
                if (temp == temp2) {
                    count++;
                }
                if (count > 1) {
                    break;
                }
            }
            if (count > 1) {
                continue;
            }
            sb.append(temp);
        }

        if (sb.isEmpty()) {
            return -1;
        }

        char ans = sb.charAt(0);
        answer = s.indexOf(ans);
        return answer;
    }

    // not finished yet
    public int numSquares(int n) {
        int answer = 1;
        int temp = 0;

        while (temp <= n) {

        }

        return answer;
    }

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

    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                return words[i];
            }
        }
        return "";
    }

    private boolean isPalindrome(String word) {
        if (word.length() == 1 || word.length() == 0)
            return true;
        for (int i = 0, j = word.length() - 1; i < word.length() / 2; i++, j--) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public int[] rearrangeArray(int[] nums) {

        // base case

        if (nums.length == 2) {
            if (nums[0] > 0) {
                return nums;
            } else {
                int temp = nums[0];
                nums[0] = nums[1];
                nums[1] = temp;
            }
        }

        int[] positiveArray = new int[nums.length / 2];
        int[] negativeArray = new int[nums.length / 2];
        int pIndex = 0;
        int nIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positiveArray[pIndex] = nums[i];
                pIndex++;
            } else {
                negativeArray[nIndex] = nums[i];
                nIndex++;
            }
        }

        // check the arrays
        // printArray(positiveArray);
        // printArray(negativeArray);

        pIndex = 0;
        nIndex = 0;

        int[] answer = new int[nums.length];
        for (int i = 0; i < answer.length; i++) {
            if (i % 2 == 0) {
                answer[i] = positiveArray[pIndex];
                pIndex++;
            } else {
                answer[i] = negativeArray[nIndex];
                nIndex++;
            }
        }

        return answer;
    }

    public void rotate(int[] nums, int k) {
        if (nums.length == 1 || nums.length % k == 0)
            return;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            
        }

    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution tester = new Solution();

        int[] arr = {10, 56, 4, 78, 7, 98, 4, 98};
        // String [] s = {"abc","car","ada","racecar","cool"};
        // tester.printArray(tester.rearrangeArray(arr));

        
    }
}

