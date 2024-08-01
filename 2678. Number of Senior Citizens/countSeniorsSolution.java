
public class countSeniorsSolution {
    public int countSeniors(String[] details) {
        int numberOfSeniors = 0;
        for (int i = 0; i < details.length; i++) {
            int age = Character.getNumericValue(details[i].charAt(11)) * 10
                    + Character.getNumericValue(details[i].charAt(12));

            /*
             * Could have done it like:
             * int ageTens = passengerInfo.charAt(11) - '0';
             * int ageOnes = passengerInfo.charAt(12) - '0';
             * 
             */

            if (age > 60) {
                numberOfSeniors++;
            }
        }
        return numberOfSeniors;
    }
}
