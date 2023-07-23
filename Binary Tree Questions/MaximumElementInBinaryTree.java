class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class MaximumElementInBinaryTree {

    public static int findMaximum(TreeNode root) {
        if (root == null)
            return Integer.MIN_VALUE;

        int leftMax = findMaximum(root.left);
        int rightMax = findMaximum(root.right);

        return Math.max(root.val, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {
        // Constructing a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int maxElement = findMaximum(root);
        System.out.println("Maximum Element in Binary Tree: " + maxElement);
    }
}
