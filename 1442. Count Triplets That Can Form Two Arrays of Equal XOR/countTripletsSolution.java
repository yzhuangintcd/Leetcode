
public class countTripletsSolution {
    public int countTriplets(int[] arr) {
        // xor rules:
        // a ^ a = 0
        // a ^ 0 = a

        // if a = b: the xor from i to j - 1 is equal to the xor for j to k
        // arr[i] ^ arr[i+1] ^ ... ^ arr[k] = 0 because a ^ a = 0

        // use a sumXorArray where sumXorArray[i] represents the xor of all the elements
        // from the start up to i

        // for each possible starting index i, calulate the sum of the xor up to i
        // then for each ending index k, the sum from i to k is 0, all positions j
        // between i
        // and k are valid middle points

        // then just iterate through all possible values of i and k
        // and use the sumXorArray to check for a == b
        int answer = 0;
        int[] sumXorArray = new int[arr.length + 1];
        sumXorArray[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            sumXorArray[i + 1] = sumXorArray[i] ^ arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                if (sumXorArray[i] == sumXorArray[k + 1]) {
                    answer += (k - i);
                }
            }
        }
        return answer;
    }
}
