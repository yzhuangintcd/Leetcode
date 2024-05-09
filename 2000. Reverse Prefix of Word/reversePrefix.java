
public class reversePrefix {
    public String reversePrefix(String word, char ch) {
        // first find ch in word
        // if char not in word
        // return word

        int index = 0;
        boolean noChar = true;
        for (char letter : word.toCharArray()) {
            if (letter == ch) {
                noChar = false;
                break;
            }
            index++;
        }

        if (noChar) {
            return word;
        }

        // if the program gets here that means we just have to reverse the
        // string at the calculated index

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int i = 0;

        while (i <= index) {
            sb1.append(word.charAt(i));
            i++;
        }
        while (i < word.length()) {
            sb2.append(word.charAt(i));
            i++;
        }

        sb1.reverse();

        StringBuilder ans = sb1.append(sb2);
        String answer = ans.toString();
        return answer;
    }
}
