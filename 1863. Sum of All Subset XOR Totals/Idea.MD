# Thought Process

1. Recursively (using backtrack):

- start from the first index and add current element into the current subset
- after recursion, we backtrack by removing the last added element and continue with the next element
- then after we generate the possible subsets, we can iterate through them using a nested for loop and find the xor Sum
- this method is very slow though

2. Iteratively:

- start with an empty subset
- for each element in the array, add all existing subsets to create new subsets
- add these new subsets to the list of all subsets
- and then after we generate the possible subsets, we can iterate through them using a nested for loop and find the xor Sum (same as recursive)
- this method is very slow though (maybe throught the process of creating the subsets I will add on the XOR SUM)

3. Faster / Better Solution (not mine):
   `   
public int subsetXORSum(int[] nums) {
    int n = nums.length;
    int sum = 0;
    for(int i = 0; i < (1 << n); i++) {
        int xr = 0;
        for(int j = 0; j < n; j++) {
            int bm = 1 << j;
            if((i & bm) != 0) {
                xr ^= nums[j];
            }
        }
        sum += xr;
    }
    return sum;
}`

- `n` = array's length
- `sum` is the sum that we return
- `i` is the possible subsets
- `j` is used to check the bit position of `i` to determine the elements of the subset
- `bm` is the bit mask to check if a particular element should be included in the current subset

- the outer loop:
  `for(int i = 0; i < (1 << n); i++)`
- - uses the fact that the possible subsets from a set with size n, has a size of 2 to the power of n (i.e. 1 << n = 2^n)

- the inner loop:
  `  
  int xr =0;
  for(int j=0;j<n;j++){
      int bm = 1<<j;
      if((i&bm) !=0) {
          xr = xr^nums[j];
      }
  }`
- - xr holds the XOR result of the current subset
- - j iterates over each element of the array nums.
- - bm = 1 << j creates a bitmask with a 1 at the j-th position.
- - (i & bm) != 0 checks if the j-th bit in i is set (i.e., if the j-th element of nums should be included in the current subset).
- - If the bit is set, xr is updated using the XOR operation with nums[j].
