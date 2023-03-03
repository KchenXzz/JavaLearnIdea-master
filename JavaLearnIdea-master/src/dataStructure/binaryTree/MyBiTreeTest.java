package dataStructure.binaryTree;

import dataStructure.binaryTree.myBinaryTree.MyBinaryTree;

/**
 * @projectName: JavaLearnIdea
 * @package: dataStructure.binaryTree
 * @className: MyBiTreeTest
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-2-3 下午 3:20
 * @version: 1.0
 */
public class MyBiTreeTest {
    public static void main(String[] args) {

        MyBinaryTree tree = new MyBinaryTree();

        int[] arr = {1, 2, 3, 4, 5,6,7,8,9,10};
        for (int i : arr) {
            tree.add(i);
        }
        //先序遍历
        tree.visit(1);
        System.out.println();
        //中序遍历
        tree.visit(2);
        System.out.println();
//        //后序遍历
//        tree.visit(3);
//        System.out.println();
//        tree.visitNotRecByMid();
        tree.visitByQueue();

        //System.out.println(tree.size());


    }
}
