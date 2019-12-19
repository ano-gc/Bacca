package always.javabase.synchroniaed;

import always.datastructure.binary.BinaryTree;
import org.openjdk.jol.info.ClassLayout;

/**
 * @program: Ano
 * @description:
 * @author: Ano
 * @create: 2019-11-06 09:38
 **/
public class ObjectHeaderTest {
    static int a[]={1,2,3};
    static BinaryTree binaryTree=new BinaryTree(a);
    public static void main(String[] args) {
        System.out.println(ClassLayout.parseInstance(binaryTree).toPrintable());
    }
}
