// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class StructuralIdenticalBST {

    // Function to check if two binary trees are structurally identical
    public static boolean areStructurallyIdentical(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return areStructurallyIdentical(root1.left, root2.left) &&
               areStructurallyIdentical(root1.right, root2.right);
    }

    public static void main(String[] args) {
        // Create two binary trees for testing
        // Tree 1
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);

        // Tree 2
        TreeNode root2 = new TreeNode(6);
        root2.left = new TreeNode(7);
        root2.right = new TreeNode(8);
        root2.left.left = new TreeNode(9);
        root2.left.right = new TreeNode(10);

        // Check if the trees are structurally identical
        boolean result = areStructurallyIdentical(root1, root2);
        System.out.println("Are the binary trees structurally identical? " + result);
    }
}
