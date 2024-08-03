import java.util.HashMap;

public class canBeEqualSolution {

    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < target.length; i++) {
            int count = hm.getOrDefault(target[i], 0);
            count++;
            hm.put(target[i], count);
        }
        for (int i = 0; i < arr.length; i++) {
            if (hm.get(arr[i]) == null) {
                return false;
            }
            int count = hm.get(arr[i]);
            count--;
            if (count == 0) {
                hm.remove(arr[i]);
            } else {
                hm.put(arr[i], count);
            }
        }
        return true;
    }

    /* Alternate Solution:
     * public boolean canBeEqual(int[] target, int[] arr) {
     * int n=target.length;
     * Arrays.sort(target);
     * Arrays.sort(arr);
     * for(int i=0;i<n;i++){
     * if(target[i]!=arr[i]) return false;
     * }
     * return true;
     * }
     */
}
