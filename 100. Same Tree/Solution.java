import java.util.*;;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null)
            return true;
        if (p == null && q != null)
            return false;
        if (p != null && q == null)
            return false;

        StringBuilder p1 = new StringBuilder();
        StringBuilder q1 = new StringBuilder();

        treeToString(p, p1);
        treeToString(q, q1);

        System.out.println(p1);
        System.out.println(q1);

        if (p1.compareTo(q1) == 0) {
            return true;
        }
        return false;
    }

    // this function appends the p in inorder traversal ontpo s
    private void treeToString(TreeNode p, StringBuilder s) {
        if (p == null) {
            s.append("null");

        } else {
            s.append(p.val);
        }

        if (p.left != null) {
            treeToString(p.left, s);
        } else {
            s.append("null");

        }

        if (p.right != null) {
            treeToString(p.right, s);
        } else {
            s.append("null");
        }
    }
}
