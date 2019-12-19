package always.datastructure.binary;

import lombok.Data;

/**
 * @program: springboot
 * @description: This is a implementation for Binary Tree
 * @author: Ano
 * @create: 2019-10-12 15:19
 **/
@Data
public class TreeNode {
    private String data;
    private int node;
    private TreeNode left;
    private TreeNode right;
    private TreeNode firstchild;
    private TreeNode nextbrother;
    public TreeNode(int node){
        this.node=node;
    }
}
