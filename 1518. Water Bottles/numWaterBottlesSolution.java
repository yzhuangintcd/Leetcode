
public class numWaterBottlesSolution {
    public int numWaterBottles(int numBottles, int numExchange) {
        /*
         * Lemma: Given N initial bottles, and for
         * each a empty ones one can exchange for b full ones,
         * where b<a; we can show that maximum bottles one can get is
         * N+b⌊(N−b)/(a−b)⌋
         * 
         * Proof
         * The exchange is possible if for some k number of exchanges we have
         * N−(k+1)⋅a+b⋅k≥0 (i.e after exchanging we get a valid > 0 net), this equals
         * N−k⋅a+b⋅k≥a.
         * Let m be the lowest number of exchanges that cannot be done, that is
         * N−m⋅(a−b)<a but m∈int and m>(N−a)/(a−b). Hence,
         * m≥⌊(N−a)(a−b)⌋+1=(N−b)/(a−b)⌋
         * Therefore, maximum number of bottles one can get is
         * N+b⌊(N−b)/(a−b)⌋ (QED)
         */

        int N = numBottles;
        int a = numExchange;
        int b = 1;
        int answer = N + b * ((N - b) / (a - b));

        return answer;
    }
}
