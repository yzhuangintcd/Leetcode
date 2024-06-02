
public class reverseStringSolution {
    public void reverseString(char[] s) {
        if (s.length == 1)
            return;
        for (int i = 0, j = s.length - 1; i < s.length / 2 && j >= s.length / 2; i++, j--) {
            // if same don't swap
            // else swap
            if (s[i] == s[j]) {
                continue;
            } else {
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
            }
        }
    }
}
