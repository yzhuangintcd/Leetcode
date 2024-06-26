import java.util.Arrays;
import java.util.ArrayList;

public class balanceBSTSolution {
    public TreeNode balanceBST(TreeNode root) {
        int[] arr = convertToArray(root); // hint 1 using in order traversal to generate a sorted arr
        Arrays.sort(arr); // hint 2 using the array to build a tree
        return constructBST(arr, 0, arr.length - 1);

    }

    public int[] convertToArray(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);
        return list.stream().mapToInt(i -> i).toArray();
    }

    // https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/#inorder-traversal
    private void inorderTraversal(TreeNode root, ArrayList<Integer> list) {
        if (root == null)
            return;
        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }

    // https://www.geeksforgeeks.org/sorted-array-to-balanced-bst/
    private TreeNode constructBST(int[] arr, int start, int end) {
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = constructBST(arr, start, mid - 1);
        root.right = constructBST(arr, mid + 1, end);
        return root;
    }
}
