class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class ConvertToSumTree {

    public static int convertToSumTree(TreeNode root) {
        if (root == null) return 0;

        int leftSum = convertToSumTree(root.left);
        int rightSum = convertToSumTree(root.right);

        int oldVal = root.val;
        root.val = leftSum + rightSum;
        return root.val + oldVal;
    }

    // Helper function to construct the tree
    public static TreeNode createTree() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(-2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(-4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(5);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = createTree();

        System.out.println("Original Tree:");
        printInOrder(root);

        convertToSumTree(root);

        System.out.println("\nSum Tree:");
        printInOrder(root);
    }

    public static void printInOrder(TreeNode root) {
        if (root == null) return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }
}
