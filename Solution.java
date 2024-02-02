import java.util.*;

class Solution {
    public int climbStairs(int n) {
        // We can find that if there is x stairs(x is a number), 
        // the number of ways to climb is the ways to climb x-1 plus the ways to climb x-2
        HashMap<Integer, Integer> map = new HashMap<>();

        if (n == 0 || n == 1) return 1;
        if (n == 2 || n == 3) return n;
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
        for (int i = 4; i <= n ; i++)
        {
            map.put(i, map.get(i-1)+map.get(i-2));
        }
        return map.get(n);
    }
    public int[] findErrorNums(int[] nums) {
        int[] answer = new int[2];
        int j = 1;
        for (int i = 0; i < nums.length; i++, j++){
            if (nums[i] != j){
                answer[0] = i;
                answer[1] = j;
                break;
            }
        }
        return answer;
    }
    
    public static void main(String [] args){
        Solution tester = new Solution();
        int [] arr = {1,2,2,4};
        for (int i= 0; i < tester.findErrorNums(arr).length; i++ ){
            System.out.print(tester.findErrorNums(arr)[i] + ", "); 
        }
        
    }
}