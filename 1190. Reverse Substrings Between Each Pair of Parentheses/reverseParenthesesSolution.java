import java.util.Stack;

public class reverseParenthesesSolution {
    public String reverseParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        String temp = s;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                int startIndex = stack.pop();
                int endIndex = i;
                temp = reverseSubstring(temp, startIndex, endIndex);
            }
        }

        StringBuilder sb = new StringBuilder(temp);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            char currentChar = sb.charAt(i);
            if (currentChar != '(' && currentChar != ')') {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    private String reverseSubstring(String s, int startIndex, int endIndex) {
        StringBuilder sb = new StringBuilder(s);
        // Extract the substring to be reversed
        String temp = sb.substring(startIndex, endIndex + 1);
        // Reverse the extracted substring
        String reversed = new StringBuilder(temp).reverse().toString();
        // Replace the original substring with the reversed substring
        sb.replace(startIndex, endIndex + 1, reversed);
        // Return the modified string
        return sb.toString();
    }
}
