import java.util.ArrayList;
import java.util.List;

public class countConsistentStringsSolution {
    List<Character> list;

    public int countConsistentStrings(String allowed, String[] words) {
        list = new ArrayList<>();
        for (int i = 0; i < allowed.length(); i++) {
            char temp = allowed.charAt(i);
            if (!list.contains(temp)) {
                list.add(temp);
            }
        }
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (isConsistent(words[i]))
                count++;
        }
        return count;
    }

    private boolean isConsistent(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!list.contains(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
