import java.util.*;

public class Solution {
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
}
