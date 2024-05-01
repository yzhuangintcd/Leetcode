import java.util.*;

class Solution {

    // This does not work :(
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

    // public void rotate(int[] nums, int k) {
    // if (nums.length == 1 || nums.length % k == 0)
    // return;
    // LinkedList<Integer> list = new LinkedList<>();
    // for (int i = 0; i < nums.length; i++) {

    // }

    // }

    public boolean isPowerOfTwo(int n) {
        // the iterative solution:

        int temp = n; // set temp = n, don't want to change n itself

        // edge case
        if (n == 0) {
            return false;
        }
        // while (temp != 1){

        // if (temp % 2 != 0){
        // return false;
        // }

        // temp = temp / 2;
        // }
        // return true;

        // the non iterative solution: does not work yet

        double checker = log2(temp);
        int x = (int) checker;
        double y = checker - x;

        if (y == 0) {
            return true;
        }

        return false;

    }

    private static double log2(int N) {
        return Math.log(N) / Math.log(2);
    }

    public int missingNumber(int[] nums) {
        int numberOfElement = nums.length;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i])
                return i;
        }

        return numberOfElement;
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null)
            return true;
        if (p == null && q != null)
            return false;
        if (p != null && q == null)
            return false;

        StringBuilder p1 = new StringBuilder();
        StringBuilder q1 = new StringBuilder();

        treeToString(p, p1);
        treeToString(q, q1);

        System.out.println(p1);
        System.out.println(q1);

        if (p1.compareTo(q1) == 0) {
            return true;
        }
        return false;
    }

    // this function appends the p in inorder traversal ontpo s
    private void treeToString(TreeNode p, StringBuilder s) {
        if (p == null) {
            s.append("null");

        } else {
            s.append(p.val);
        }

        if (p.left != null) {
            treeToString(p.left, s);
        } else {
            s.append("null");

        }

        if (p.right != null) {
            treeToString(p.right, s);
        } else {
            s.append("null");
        }
    }

    public int sumOfLeftLeaves(TreeNode root) {
        // check if a leave is a left leave
        // if yes add to the sum
        int sum;
        if (root == null)
            return 0;
        sum = sumOfLeftLeaves(root, false);
        return sum;
    }

    private int sumOfLeftLeaves(TreeNode root, boolean isLeft) {

        if (root == null)
            return 0;
        if (root.left == null && isLeft && root.right == null) {
            return root.val;
        }
        int leftSum = sumOfLeftLeaves(root.left, true);
        int rightSum = sumOfLeftLeaves(root.right, false);

        return leftSum + rightSum;
    }

    public int sumNumbers(TreeNode root){

        return 0;
    }

    public String maximumOddBinaryNumber(String s) {
        // rearrange the bits
        // move the first "1" to the start
        // then move the rest of the onees to the front
        // because if LSB = 1, = odd number
        // move other "1"s to the start to make it maximum
        if (s.length() == 1) {
            if (s.charAt(0) == '1')
                return "1";
        }

        StringBuilder sb = new StringBuilder();

        // int takenOne = -1;
        // //iterate through the string
        // // find the first "1"
        // for(int i = 0; i < s.length(); i++){
        // if (s.charAt(i) == '1'){
        // sb.append(s.charAt(i));
        // takenOne = i;
        // break;
        // }
        // }

        // for (int i = 0; i < s.length(); i++){

        // if (i == takenOne ){
        // continue;
        // }
        // if (s.charAt(i) == '1'){
        // sb.insert(0, s.charAt(i));
        // }

        // }
        int count1s = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count1s++;
            }
        }

        int count0s = s.length() - count1s;

        if (count1s == 1) {
            while (count0s != 0) {
                sb.append('0');
                count0s--;
            }
            sb.append('1');
            return sb.toString();
        }

        for (int i = 0; i < s.length(); i++) {
            if (count1s == 1)
                break;
            while (count1s != 1) {
                sb.append('1');
                count1s--;
            }
        }

        while (count0s != 0) {
            sb.append('0');
            count0s--;
        }

        sb.append('1');

        return sb.toString();

        // try something different
        // - count the amount of 1's

    }

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

    public int getCommon(int[] nums1, int[] nums2) {

        for (int i = 0; i < nums1.length; i++) {
            if (Arrays.binarySearch(nums2, nums1[i]) >= 0) {
                return nums1[i];
            }
        }

        return -1;
    }

    public boolean isIsomorphic(String s, String t) {
        // assign the letter of each string a value -> Hashmap
        // iterate through the 2 string at the same index
        // each character's value (for the 2 letter) must be the same
        // we can use 2 separate loops to do this, count the iteration
        // of the letter
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (mapS.containsKey(charS)) {
                if (mapS.get(charS) != charT) {
                    return false;
                }
            } else {
                mapS.put(charS, charT);
            }

            if (mapT.containsKey(charT)) {
                if (mapT.get(charT) != charS) {
                    return false;
                }
            } else {
                mapT.put(charT, charS);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution tester = new Solution();

        int[] arr = { 1, 2, 2, 3, 1, 4 };
        int[] num1 = { 1, 2, 3, 6 };
        int[] num2 = { 2, 3, 4, 5 };

        TreeNode temp = new TreeNode(3, new TreeNode(9), new TreeNode(20));
        temp.right.left = new TreeNode(15);
        temp.right.right = new TreeNode(7);

        System.out.println(tester.sumOfLeftLeaves(temp));
        // String [] s = {"abc","car","ada","racecar","cool"};

        // System.out.println(tester.isPowerOfTwo(536870912)); // true
        // System.out.println(tester.isPowerOfTwo(3)); // false

        // System.out.println(tester.missingNumber(arr));

        // System.out.println(tester.isIsomorphic("bbbaaaba", "aaabbbba"));
    }
}
