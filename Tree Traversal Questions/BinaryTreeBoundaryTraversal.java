import java.util.*;

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

public class BinaryTreeBoundaryTraversal {

    // Helper function to print the left boundary of the binary tree
    private static void printLeftBoundary(TreeNode root, List<Integer> result) {
        if (root == null)
            return;

        if (root.left != null) {
            result.add(root.val);
            printLeftBoundary(root.left, result);
        } else if (root.right != null) {
            result.add(root.val);
            printLeftBoundary(root.right, result);
        }
        // If both left and right children are null, it's a leaf node, so don't add it to the result.
    }

    // Helper function to print the right boundary of the binary tree
    private static void printRightBoundary(TreeNode root, List<Integer> result) {
        if (root == null)
            return;

        if (root.right != null) {
            printRightBoundary(root.right, result);
            result.add(root.val);
        } else if (root.left != null) {
            printRightBoundary(root.left, result);
            result.add(root.val);
        }
        // If both left and right children are null, it's a leaf node, so don't add it to the result.
    }

    // Helper function to print the leaf nodes of the binary tree
    private static void printLeaves(TreeNode root, List<Integer> result) {
        if (root == null)
            return;

        if (root.left == null && root.right == null) {
            result.add(root.val);
            return;
        }

        printLeaves(root.left, result);
        printLeaves(root.right, result);
    }

    // Function to perform the boundary traversal of the binary tree
    public static List<Integer> boundaryTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        result.add(root.val);

        // Traverse the left boundary (excluding the root node)
        printLeftBoundary(root.left, result);

        // Traverse and add the leaf nodes
        printLeaves(root, result);

        // Traverse the right boundary (excluding the root node)
        printRightBoundary(root.right, result);

        return result;
    }

    public static void main(String[] args) {
        // Constructing a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(8);
        root.right.left = new TreeNode(5);
        root.right.left.left = new TreeNode(9);
        root.right.left.right = new TreeNode(10);
        root.right.right = new TreeNode(6);

        List<Integer> boundary = boundaryTraversal(root);
        System.out.println("Boundary Traversal of Binary Tree:");
        System.out.println(boundary);
    }
}
