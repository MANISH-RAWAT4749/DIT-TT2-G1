import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirrorTree(root.left);
        mirrorTree(root.right);

        return root;
    }

    public void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }
}

public class MirrorImage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.print("Enter the number of nodes in the binary tree: ");
        int n = scanner.nextInt();
        TreeNode root = null;
        TreeNode[] nodes = new TreeNode[n + 1];

        System.out.println("Enter the values of the nodes:");
        for (int i = 1; i <= n; i++) {
            int val = scanner.nextInt();
            nodes[i] = new TreeNode(val);
        }

        System.out.println("Enter the connections between nodes (parent-child):");
        for (int i = 1; i <= n; i++) {
            int parent = scanner.nextInt();
            String direction = scanner.next();

            if (direction.equals("L")) {
                nodes[parent].left = nodes[i];
            } else {
                nodes[parent].right = nodes[i];
            }
        }

        TreeNode mirroredTree = solution.mirrorTree(nodes[1]);
        System.out.println("Inorder traversal of the mirror tree:");
        solution.inorderTraversal(mirroredTree);
    }
}
