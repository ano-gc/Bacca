package always.datastructure.binary;

/**
 * @program: springboot
 * @description: PreOrder, Inorder, PostOrder
 * @author: Ano
 * @create: 2019-10-12 16:31
 **/
public class TraversingBinaryTree {
    public static void main(String[] args) {
        int[] a={2,3,1,7,5};
        BinaryTree binaryTree=new BinaryTree(a);
        TreeNode root=binaryTree.getRoot();
        System.out.println("先序");
        PreOrder(root);
        System.out.println("中序");
        InOrder(root);
        System.out.println("后序");
        PostOrder(root);
    }
    public static void PreOrder(TreeNode root){
        if(root!=null){
            System.out.println("node:"+root.getNode());
            PreOrder(root.getLeft());
            PreOrder(root.getRight());
        }
    }

    public static void InOrder(TreeNode root){
        if(root!=null){
            InOrder(root.getLeft());
            System.out.println("node:"+root.getNode());
            InOrder(root.getRight());
        }
    }

    public static void PostOrder(TreeNode root){
        if(root!=null){
            PostOrder(root.getLeft());
            PostOrder(root.getRight());
            System.out.println("node:"+root.getNode());
        }
    }
}
