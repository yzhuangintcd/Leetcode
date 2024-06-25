import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class maxProfitAssignmentSolution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxProfit = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < difficulty.length; i++) {
            if (hm.get(difficulty[i]) == null) {
                hm.put(difficulty[i], profit[i]);
            } else {
                int tempProfit = hm.get(difficulty[i]);
                if (profit[i] > tempProfit) {
                    hm.put(difficulty[i], profit[i]);
                }
            }
        }
        List<Map.Entry<Integer, Integer>> jobList = new ArrayList<>(hm.entrySet());
        Collections.sort(jobList, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                return a.getKey() - b.getKey();
            }
        });
        Arrays.sort(worker);
        int i = 0;
        int bestProfit = 0;
        for (int ability : worker) {

            while (i < jobList.size() && jobList.get(i).getKey() <= ability) {
                bestProfit = Math.max(bestProfit, jobList.get(i).getValue());
                i++;
            }
            maxProfit += bestProfit;
        }
        return maxProfit;
    }
}
