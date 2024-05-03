import java.util.HashMap;

public class isIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        // assign the letter of each string a value -> Hashmap
        // iterate through the 2 string at the same index
        // each character's value (for the 2 letter) must be the same
        // we can use 2 separate loops to do this, count the iteration
        // of the letter
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (mapS.containsKey(charS)) {
                if (mapS.get(charS) != charT) {
                    return false;
                }
            } else {
                mapS.put(charS, charT);
            }

            if (mapT.containsKey(charT)) {
                if (mapT.get(charT) != charS) {
                    return false;
                }
            } else {
                mapT.put(charT, charS);
            }
        }

        return true;
    }
}
