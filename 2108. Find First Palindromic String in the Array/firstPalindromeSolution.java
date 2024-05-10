public class firstPalindromeSolution {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                return words[i];
            }
        }
        return "";
    }

    private boolean isPalindrome(String word) {
        if (word.length() == 1 || word.length() == 0)
            return true;
        for (int i = 0, j = word.length() - 1; i < word.length() / 2; i++, j--) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
