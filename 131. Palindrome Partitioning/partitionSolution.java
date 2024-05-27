import java.util.List;
import java.util.ArrayList;

public class partitionSolution {
    public List<List<String>> partition(String s) {
        List<List<String>> lists = new ArrayList<>();
        partitionHelper(s, 0, new ArrayList<>(), lists);
        return lists;
    }

    private void partitionHelper(String s, int start, List<String> currentList, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(currentList));
            return;
        }
        for (int end = start; end < s.length(); end++) {
            String subString = s.substring(start, end + 1);
            if (isPalindrome(subString)) {
                currentList.add(s.substring(start, end + 1));
                partitionHelper(s, end + 1, currentList, result);
                currentList.remove(currentList.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String x) {
        String reverseStr = new StringBuilder(x).reverse().toString();
        return x.equals(reverseStr);
    }
}
