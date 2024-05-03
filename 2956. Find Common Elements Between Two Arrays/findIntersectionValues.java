public class findIntersectionValues {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] answer = new int[2]; // Return an integer array answer of size 2 containing the two values...
        int index = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums1.length; i++) {
            int temp = nums1[i];
            for (int j = 0; j < nums2.length; j++) {
                if (temp == nums2[j]) {
                    count1++;
                    break;
                }
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            int temp = nums2[i];
            for (int j = 0; j < nums1.length; j++) {
                if (temp == nums1[j]) {
                    count2++;
                    break;
                }
            }
        }
        answer[0] = count1;
        answer[1] = count2;
        return answer;
    }
}
