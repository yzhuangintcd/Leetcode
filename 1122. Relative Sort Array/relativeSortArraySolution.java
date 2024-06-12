import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class relativeSortArraySolution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            hm.put(arr2[i], i);
        }

        for (int i = 0; i < arr2.length; i++) {
            int index = hm.get(arr2[i]);
            for (int j = 0; j < arr1.length; j++) {
                if (hm.get(arr1[j]) == null) {
                    // hm.put(arr1[j], j);
                    continue;
                }
                if (hm.get(arr1[j]) == index) {
                    answer.add(arr1[j]);
                }
            }
        }

        List<Integer> sublist = new ArrayList<>();
        for (int j = 0; j < arr1.length; j++) {
            if (hm.get(arr1[j]) == null) {
                sublist.add(arr1[j]);
            }
        }

        Collections.sort(sublist);
        answer.addAll(sublist);
        return listToArray(answer);
    }

    private int[] listToArray(ArrayList<Integer> list) {
        int[] arr = new int[list.size()];
        // ArrayList to Array Conversion
        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);
        return arr;
    }
}
