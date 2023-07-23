import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class DiagonalViewOfTree {

    public static void printDiagonalView(TreeNode root) {
        if (root == null) return;

        Map<Integer, List<Integer>> map = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> diagonalLevels = new LinkedList<>();

        queue.offer(root);
        diagonalLevels.offer(0);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            int level = diagonalLevels.poll();

            // Add the node value to the corresponding diagonal level
            map.putIfAbsent(level, new ArrayList<>());
            map.get(level).add(node.val);

            if (node.left != null) {
                queue.offer(node.left);
                diagonalLevels.offer(level + 1);
            }

            if (node.right != null) {
                queue.offer(node.right);
                diagonalLevels.offer(level);
            }
        }

        // Print the diagonal view
        for (List<Integer> values : map.values()) {
            for (int val : values) {
                System.out.print(val + " ");
            }
        }
    }

    // Helper function to construct the tree
    public static TreeNode createTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(7);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = createTree();
        System.out.println("Diagonal View: ");
        printDiagonalView(root);
    }
}
