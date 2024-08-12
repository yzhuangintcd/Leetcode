import java.util.PriorityQueue;

public class KthLargestSolution {
    class KthLargest {

        private PriorityQueue<Integer> minHeap;
        private int size;

        public KthLargest(int k, int[] nums) {

            // smart way to do this is to:
            // initialise a minHeap of size k
            this.size = k;
            this.minHeap = new PriorityQueue<>(k);

            for (int i = 0; i < nums.length; i++) {
                add(nums[i]);
            }
        }

        public int add(int val) {
            if (minHeap.size() < size) {
                minHeap.offer(val);
            } else if (val > minHeap.peek()) {
                minHeap.poll(); // delete the smallest element in the heap
                minHeap.offer(val); // add the new element so we don't change the size of the heap
            }
            // and by the end of the process the smallest element in the heap will be the
            // kth "largest"
            return minHeap.peek();
        }
    }
}
