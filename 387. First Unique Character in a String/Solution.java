import java.util.*;

public class Solution {
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
}
