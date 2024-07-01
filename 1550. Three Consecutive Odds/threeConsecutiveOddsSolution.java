
public class threeConsecutiveOddsSolution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length <= 2) {
            return false;
        }
        for (int i = 0; i <= arr.length - 3; i++) {
            if (arr[i] % 2 == 1) {
                if (arr[i + 1] % 2 == 1) {
                    if (arr[i + 2] % 2 == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
