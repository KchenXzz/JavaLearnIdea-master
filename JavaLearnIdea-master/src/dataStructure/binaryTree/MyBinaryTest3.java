package dataStructure.binaryTree;

import dataStructure.binaryTree.myBinaryTree.MyBinaryTree;

/**
 * @projectName: JavaLearnIdea
 * @package: dataStructure.binaryTree
 * @className: MyBinaryTest3
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-2-8 上午 11:00
 * @version: 1.0
 */
public class MyBinaryTest3 {
    public static void main(String[] args) {

        MyBinaryTree tree = new MyBinaryTree();

        tree.creatFindTree(new int[]{6,5,4,3,2,1,0});

        System.out.println("先序遍历");
        tree.visit(1);
        System.out.println("中序遍历");
        tree.visit(2);
        System.out.println("后序遍历");
        tree.visit(3);
        System.out.println("节点个数："+tree.getNodeCount());












        //again(tree);


    }

    private static void again(MyBinaryTree tree) {
        tree.creatFindTree(new int[]{4,2,3,6});


        tree.visit(2);
        System.out.println("节点个数："+ tree.getNodeCount());
    }


}
