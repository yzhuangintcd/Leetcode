
public class bstToGstSolution {
    private int sumHolder;

    public TreeNode bstToGst(TreeNode root) {
        sumHolder = 0;
        bstToGstHelper(root);
        return root;
    }

    // reverse inorder travseral
    private void bstToGstHelper(TreeNode root) {
        if (root == null) {
            return;
        }
        bstToGstHelper(root.right);
        System.out.println("root val: " + root.val + " sum: " + sumHolder);
        sumHolder += root.val;
        root.val = sumHolder;
        bstToGstHelper(root.left);
    }
}
