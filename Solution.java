import java.util.*;

public class Solution {

    private boolean charExists(StringBuilder word, char letter) {
        boolean found = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                word.deleteCharAt(i);
                return true;
            }

        }
        return found;
    }

    public List<String> commonChars(String[] words) {

        List<String> list = new ArrayList<>();
        // iterate each words for each letter, look for that letter in the words after
        // if the letter exists in the the words, then add the letter into the list

        // edge case words.length == 1
        if (words.length == 1) {
            return list;
        }

        for (int i = 0; i < words[0].length(); i++) {
            char temp = words[0].charAt(i);
            for (int j = 1; j < words.length; j++) {
                StringBuilder curr = new StringBuilder(words[j]);
                if (!charExists(curr, temp)) {
                    break;
                } else {
                    words[j] = curr.toString();
                    if (j == words.length - 1) {
                        if (!list.contains("" + temp)) {
                            System.out.println("Hello");
                        }
                        list.add("" + temp);
                    }
                }
            }
        }
        return list;
    }

    // Helper Function to print out array of int
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Helper Function to print out 2d array of int
    public void printGrid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String[] words = { "bella","label","roller" };
        Solution tester = new Solution();
        System.out.println(tester.commonChars(words));

    }
}
