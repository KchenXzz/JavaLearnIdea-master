package dataStructure.binaryTree;

import dataStructure.binaryTree.myBinaryTree.MyBinaryTree;
import tool.arrays.MyTools;

/**
 * @projectName: JavaLearnIdea
 * @package: dataStructure.binaryTree
 * @className: MyBinaryTest2
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-2-6 上午 11:43
 * @version: 1.0
 */
public class MyBinaryTest2 {
    public static void main(String[] args) {

        int[] array = MyTools.createSqIntArray(10);

        String str = "123##45#7##6###";
        String str2 = "23#5##7##";


        MyBinaryTree tree = new MyBinaryTree();
        MyBinaryTree tree2 = new MyBinaryTree();


        //给定序列构造二叉树
        tree.creatTree(str);
        //按照键盘里录入的方式构造二叉树
        //tree.creatTreeByInput();
//        tree.visit(1);
//
//        tree.creatTree(str2);
//        tree.visit(1);















        //countTest(tree, tree2);

        //copyTest(tree);

        depthTest(tree, tree2);


    }

    private static void countTest(MyBinaryTree tree, MyBinaryTree tree2) {
        System.out.println(tree.getNodeCount());
        System.out.println(tree2.getNodeCount());

        System.out.println(tree.getLeafCount());
        tree2.add(2);
        tree2.add(2);
        tree2.add(2);
        System.out.println(tree2.getLeafCount());
    }

    private static void depthTest(MyBinaryTree tree, MyBinaryTree tree2) {
        System.out.println(tree.getDepth());
        tree2.add(1);
        tree2.add(1);
        System.out.println(tree2.getDepth());
    }

    private static void copyTest(MyBinaryTree tree) {
        MyBinaryTree copyTree = MyBinaryTree.copyTree(tree);


        //tree.visitByQueue();
        tree.visit(1);
        System.out.println();
        assert copyTree != null;
        copyTree.visit(1);
        System.out.println();
    }
}
