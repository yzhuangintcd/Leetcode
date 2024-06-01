
public class scoreOfStringSolution {
    public int scoreOfString(String s) {
        int score = 0;
        int acsiiA = (int) s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            int acsiiB = (int) s.charAt(i);
            int absDiff = Math.abs(acsiiB - acsiiA);
            acsiiA = acsiiB;
            score += absDiff;
        }
        return score;
    }
}
