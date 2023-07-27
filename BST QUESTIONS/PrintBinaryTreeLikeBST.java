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

public class PrintBinaryTreeLikeBST {

    // Function to print the binary tree like a BST
    public static void printBST(TreeNode root) {
        if (root == null) {
            return;
        }
        printBST(root.left);
        System.out.print(root.val + " ");
        printBST(root.right);
    }

    public static void main(String[] args) {
        // Create a binary tree for testing
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        // Print the binary tree like a BST
        System.out.println("Binary tree printed like a BST:");
        printBST(root);
    }
}
