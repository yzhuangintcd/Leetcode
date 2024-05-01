import java.util.*;

public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        // check if a leave is a left leave
        // if yes add to the sum
        int sum;
        if (root == null)
            return 0;
        sum = sumOfLeftLeaves(root, false);
        return sum;
    }

    private int sumOfLeftLeaves(TreeNode root, boolean isLeft) {

        if (root == null)
            return 0;
        if (root.left == null && isLeft && root.right == null) {
            return root.val;
        }
        int leftSum = sumOfLeftLeaves(root.left, true);
        int rightSum = sumOfLeftLeaves(root.right, false);

        return leftSum + rightSum;
    }

    public int sumNumbers(TreeNode root) {

        return 0;
    }
}
