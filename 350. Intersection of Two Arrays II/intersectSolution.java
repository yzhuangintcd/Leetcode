import java.util.*;

public class intersectSolution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // check length of each array
        HashMap<Integer, Integer> ht = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        if (nums1.length >= nums2.length) {
            for (int i = 0; i < nums2.length; i++) {
                ht.put(nums2[i], ht.getOrDefault(nums2[i], 0) + 1);
            }
            for (int i = 0; i < nums1.length; i++) {
                int count = ht.getOrDefault(nums1[i], 0);
                if (count > 0) {
                    al.add(nums1[i]);
                    ht.put(nums1[i], count - 1);
                }
            }
        } else {
            for (int i = 0; i < nums1.length; i++) {
                ht.put(nums1[i], ht.getOrDefault(nums1[i], 0) + 1);
            }
            for (int i = 0; i < nums2.length; i++) {
                int count = ht.getOrDefault(nums2[i], 0);
                if (count > 0) {
                    al.add(nums2[i]);
                    ht.put(nums2[i], count - 1);
                }
            }
        }

        System.out.println(al);
        return convertToArray(al);
    }

    public static int[] convertToArray(ArrayList<Integer> arrayList) {
        int[] intArray = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            intArray[i] = arrayList.get(i);
        }
        return intArray;
    }
}
