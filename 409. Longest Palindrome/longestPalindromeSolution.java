import java.util.HashMap;

public class longestPalindromeSolution {
    public int longestPalindrome(String s) {
        if (s.length() == 1) {
            return 1;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {

            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                int count = map.get(c);
                count++;
                map.replace(c, count);
            }
        }

        // initialise int answer
        // add at most 1 odd value
        // add all the even value

        int answer = 0;
        boolean hasOddCount = false;
        for (int count : map.values()) {
            if (count % 2 == 0) {
                answer += count;
            } else {
                answer += count - 1;
                hasOddCount = true;
            }
        }

        if (hasOddCount) {
            answer++;
        }

        return answer;
    }
}
