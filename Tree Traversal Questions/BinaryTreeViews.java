import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeViews {

    public static void printTopView(TreeNode root) {
        if (root == null) return;

        Map<Integer, Integer> map = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> horizontalDistances = new LinkedList<>();

        queue.offer(root);
        horizontalDistances.offer(0);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            int hd = horizontalDistances.poll();

            if (!map.containsKey(hd)) {
                map.put(hd, node.val);
            }

            if (node.left != null) {
                queue.offer(node.left);
                horizontalDistances.offer(hd - 1);
            }

            if (node.right != null) {
                queue.offer(node.right);
                horizontalDistances.offer(hd + 1);
            }
        }

        for (int val : map.values()) {
            System.out.print(val + " ");
        }
    }

    public static void printBottomView(TreeNode root) {
        if (root == null) return;

        Map<Integer, Integer> map = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> horizontalDistances = new LinkedList<>();

        queue.offer(root);
        horizontalDistances.offer(0);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            int hd = horizontalDistances.poll();

            map.put(hd, node.val);

            if (node.left != null) {
                queue.offer(node.left);
                horizontalDistances.offer(hd - 1);
            }

            if (node.right != null) {
                queue.offer(node.right);
                horizontalDistances.offer(hd + 1);
            }
        }

        for (int val : map.values()) {
            System.out.print(val + " ");
        }
    }

    // Helper function to construct the tree
    public static TreeNode createTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.right = new TreeNode(5);
        root.left.right.right.right = new TreeNode(6);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = createTree();

        System.out.println("Top View: ");
        printTopView(root);

        System.out.println("\nBottom View: ");
        printBottomView(root);
    }
}
