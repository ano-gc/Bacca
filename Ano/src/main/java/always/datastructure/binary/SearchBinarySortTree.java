package always.datastructure.binary;

/**
 * @program: springboot
 * @description: BSTree root,int key
 * @author: Ano
 * @create: 2019-10-15 11:22
 **/
public class SearchBinarySortTree {

    public static void main(String[] args) {
        int[] a={2,1,3,7,5};
        int key=7;
        BinaryTree binaryTree=new BinaryTree(a);
        SearchBinarySortTree.SearchBinarySortTreeKey(binaryTree,key);
        System.out.println(binaryTree.toString());
    }

    public static void SearchBinarySortTreeKey(BinaryTree binaryTree,int key){
        while(binaryTree.getRoot()!=null&&binaryTree.getRoot().getNode()!=key){
            if(binaryTree.getRoot().getNode()<key){
                binaryTree.setRoot(binaryTree.getRoot().getRight());
            }else{
                binaryTree.setRoot(binaryTree.getRoot().getLeft());
            }
        }
        if(binaryTree.getRoot()!=null){
            System.out.println(binaryTree.getRoot());
        }else{
            System.out.println("未找到需要的结果！");
        }
    }
    public static void InsertBinarySortTreeNode(TreeNode treeNode,BinaryTree binaryTree){
        while(true){
            if(binaryTree.getRoot().getNode()<treeNode.getNode()){
                binaryTree.getRoot().getRight();
            }
        }
    }
}
