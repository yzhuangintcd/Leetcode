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

    // this is NOT a good solution
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new LinkedList<>();
        int arr[] = {12, 23, 34, 45, 56, 67, 78, 89,
            123, 234, 345, 456, 567, 678, 789,
            1234, 2345, 3456, 4567, 5678, 6789, 
            12345, 23456, 34567, 45678, 56789, 
            123456, 234567, 345678, 456789,
            1234567, 2345678, 3456789,
            12345678, 23456789,
            123456789};

        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= low && arr[i] <= high){
                list.add(arr[i]);
            }
            if (arr[i] > high){
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
        for (int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            count = 0;
            for (int j = 0; j < s.length();j++){
                char temp2 = s.charAt(j);
                if (temp == temp2){
                    count++;
                }
                if (count > 1){
                    break;
                }
            }
            if (count > 1){
                continue;
            }
            sb.append(temp);
        }

        if (sb.isEmpty()){
            return -1;
        }

        char ans = sb.charAt(0);
        answer = s.indexOf(ans);
        return answer;
    }
    
    public static void main(String [] args){
        Solution tester = new Solution();

        // int [] arr = {1,2,2,4};
        // for (int i= 0; i < tester.findErrorNums(arr).length; i++ ){
        //     System.out.print(tester.findErrorNums(arr)[i] + ", "); 
        // }
        // change
        System.out.println(tester.firstUniqChar("loveleetcode"));
    }
}