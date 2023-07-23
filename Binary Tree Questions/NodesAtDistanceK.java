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

public class NodesAtDistanceK {

    public static void printNodesAtDistanceK(TreeNode root, int k) {
        if (root == null || k < 0)
            return;

        if (k == 0) {
            System.out.print(root.val + " ");
            return;
        }

        printNodesAtDistanceK(root.left, k - 1);
        printNodesAtDistanceK(root.right, k - 1);
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

        int k = 2;
        System.out.println("Nodes at Distance " + k + " from the Root:");
        printNodesAtDistanceK(root, k);
    }
}
