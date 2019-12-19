package always.datastructure.binary;

/**
 * @program: springboot
 * @description: Create a new Binary Sort Tree
 * @author: Ano
 * @create: 2019-10-12 15:43
 **/
public class BinaryTree {
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public BinaryTree(int[] a) {
        TreeNode root = new TreeNode(a[0]);
        for (int i = 1; i < a.length; i++) {
            BinaryTree.createBinaryTree(root,a[i]);
        }
        this.root=root;
    }

    public static TreeNode createBinaryTree(TreeNode root, int i) {
        if (root == null) {
            root = new TreeNode(i);
            return root;
        } else {
            if (i <= root.getNode()) {
                root.setLeft(createBinaryTree(root.getLeft(), i));
            } else {
                root.setRight(createBinaryTree(root.getRight(),i));
            }
            return root;
        }
    }
}
