package dataStructure.binaryTree.myBinaryTree;

import dataStructure.queue.linkQueue.LinkQueue;
import tool.arrays.MyTools;

import java.util.Scanner;
import java.util.Stack;

/**
 * @projectName: JavaLearnIdea
 * @package: dataStructure.binaryTree
 * @className: MyBinaryTree
 * @author: Kchenx
 * @description: 简单二叉树
 * @date: 2023-2-3 下午 2:54
 * @version: 1.0
 */
public class MyBinaryTree {
    /**
     * 节点类
     */
    private static class BiNode {
        //数据域
        private int data;

        //双亲
//        private BiNode prent;
        //左儿子
        private BiNode left;
        //右儿子
        private BiNode right;

        public BiNode(int data, BiNode left, BiNode right, BiNode prent) {
            this.data = data;
            this.left = left;
            this.right = right;
//            this.prent = prent;
        }

        public BiNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
//            this.prent = null;
        }

        public BiNode() {
            this(0);
        }


        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public BiNode getLeft() {
            return left;
        }

        public void setLeft(BiNode left) {
            this.left = left;
            //this.left.setPrent(this);

        }

        public BiNode getRight() {
            return right;
        }

        public void setRight(BiNode right) {
            this.right = right;
//            this.right.setPrent(this);
        }

//        public BiNode getPrent() {
//            return prent;
//        }
//
//        public void setPrent(BiNode prent) {
//            this.prent = prent;
//        }

        /**
         * 计算非空二叉树深度的递归调用（每一个节点其实又是一个二叉树）
         *
         * @param node 节点
         * @return 深度
         */
        public static int depth(BiNode node) {
            //左右子树的深度
            int depthLeft;
            int depthRight;
            //如果该节点的左子树为空，那么这个树的深度就是1，否则就是它子树的深度+1
            depthLeft = node.getLeft() == null ? 0 : depth(node.getLeft());
            depthLeft++;
            depthRight = node.getRight() == null ? 0 : depth(node.getRight());
            depthRight++;
            //返回左右子树深度的最大值作为该树的深度
            return Math.max(depthLeft, depthRight);
        }

        /**
         * 左子树的高度
         */
        public int leftHeight() {
            if (this.getLeft() != null) {
                return depth(this.getLeft());
            } else {
                return 0;
            }
        }

        /**
         * 右子树的高度
         */
        public int rightHeight() {
            if (this.getRight() != null) {
                return depth(this.getRight());
            } else {
                return 0;
            }
        }


    }

    //根节点
    private BiNode root;
    //大小
    private int size;

    //遍历方式
    private static final int BY_PRE = 1;
    private static final int BY_MID = 2;
    private static final int BY_AFTER = 3;

    //建立数的字符序列，如 123##45#7##6###
    private String treeOfStr;

    //记录treeOfStr的索引位置
    private int indexOfStr = 0;


    //包含查找二叉树的元素的数组
    private int[] treeOfArray;

    //记录数组的索引
    private int indexOfArr;


    public MyBinaryTree() {
        this.root = null;//new BiNode(0, null, null);
        size = 0;
    }

    public void setTreeOfArray(int[] treeOfArray) {
        this.treeOfArray = treeOfArray;
    }

    public void setTreeOfStr(String treeOfStr) {
        this.treeOfStr = treeOfStr;
    }


    /**
     * 判断是否为空
     *
     * @return 空TRUE
     */
    public boolean isEmpty() {
        return this.size == 0;
    }


    /**
     * 清空二叉树
     */
    public void cleanTree() {
        this.root = null;//new BiNode(0, null, null);
        this.size = 0;
        this.indexOfArr = 0;
        this.indexOfStr = 0;
    }

    /**
     * 得到二叉树的元素个数，也就是节点个数
     *
     * @return size
     */
    public int size() {
        return size;
    }


    /**
     * 按照查找二叉树方式向二叉树添加元素 （自动平衡的）
     *
     * @param data 要添加的数值
     */
    public void add(int data) {
        /*
          最好是给每个节点标号
          然后添加时需要确定
          新节点的父亲的索引 以及 新插入的节点是父亲的左子树还是右子树
         */
        //空树直接添加到根节点的数据域
        if (isEmpty()) {
            this.root = new BiNode(data, null, null, null);
            size++;
        } else {
            addByFind(this.root, data);
        }

    }


    /**
     * 得到当前树的根节点
     *
     * @return 根节点
     */
    public BiNode getRoot() {
        if (isEmpty()) {
            throw new EmptyBinaryTreeException();
        }
        return this.root;
    }


    /**
     * 二叉树的遍历方法，对空二叉树遍历会抛出异常
     *
     * @param mode 遍历方式 1->前序遍历
     *             2->中序遍历
     *             3->后序遍历
     */
    public void visit(int mode) {
        if (isEmpty()) {
            throw new EmptyBinaryTreeException();
        }
        switch (mode) {
            case BY_PRE -> visitByPre(root);
            case BY_MID -> visitByMid(root);
            case BY_AFTER -> visitByAfter(root);
        }
        System.out.println();
    }

    /**
     * 利用队列对二叉树进行层次遍历
     */
    public void visitByQueue() {
        if (isEmpty()) {
            throw new EmptyBinaryTreeException();
        }
        LinkQueue<BiNode> queue = new LinkQueue<>();
        //现将根节点入队
        queue.add(this.root);
        while (!queue.isEmpty()) {
            BiNode head = queue.getHead();
            if (head.getLeft() != null) {
                queue.add(head.getLeft());
            }
            if (head.getRight() != null) {
                queue.add(head.getRight());
            }
            System.out.print(queue.pop().getData() + ", ");
        }

 /*
已解决 add方法有问题
     //一开始的错误代码 ，会出现空指针引用 ?
     while (!queue.isEmpty()) {
            BiNode pop = queue.pop();
            if (pop.getLeft() != null) {
                queue.add(pop.getLeft());
            }
            if (pop.getRight()!=null) {
                queue.add(pop.getRight());
            }
            System.out.println(pop.getData());
        }
修改的正确的
  while (!queue.isEmpty()) {
            BiNode head = queue.getHead();
            if (head.getLeft() != null) {
                queue.add(head.getLeft());
            }
            if (head.getRight()!=null) {
                queue.add(head.getRight());
            }
            System.out.println(queue.pop().getData());
        }
     */
    }


    /**
     * 非递归的中序遍历
     */
    public void visitNotRecByMid() {
        if (isEmpty()) {
            throw new EmptyBinaryTreeException();
        }
        Stack<BiNode> stack = new Stack<>();
        //将根节点入栈
        stack.push(this.root);
        while (!stack.empty()) {
            //站不为空，取栈顶元素
            BiNode top = stack.peek();
            while (top != null && !stack.empty()) {
                //如果左二子不为空而且没走过，则入栈
                if (top.getLeft() != null) {
                    stack.push(top.getLeft());
                    top = top.getLeft();
                } else {
                    //出栈，输出data域 并判断右儿子的情况
                    BiNode pop = stack.pop();
                    System.out.print(pop.getData() + ", ");
                    if (pop.getRight() != null) {
                        stack.push(pop.getRight());
                        top = top.getRight();
                    }
                }
            }
        }
        System.out.println();
    }

        /*
        //不需要记录走过位置的方法
    public void intravel3() {
        Stack<BiNode> stack = new Stack<>();

        BiNode p = this.root;
        while (p != null || !stack.isEmpty()) {
            while (p != null) {
                stack.push(p);
                p = p.getLeft();
            }

            if (!stack.isEmpty()) {
                BiNode pop = stack.pop();
                System.out.print(pop.getData() + " ");
                p = pop.getRight();
            }
        }
    }

     //主要注意遍历二叉树时，要记录走过的位置
        //这里使用list来存放走过的位置
        Stack<BiNode> stack = new Stack<>();
        ArrayList<BiNode> list = new ArrayList<>();
        stack.push(this.root);

        while (!stack.empty()) {
            BiNode top = stack.peek();
            //如果左二子不为空而且没走过，则入栈
            if (top.getLeft() != null && !list.contains(top.getLeft())) {
                stack.push(top.getLeft());
                list.add(top.getLeft());
            } else {
                //出栈，输出data域 并判断右儿子的情况
                BiNode pop = stack.pop();
                System.out.print(pop.getData() + ", ");
                if (pop.getRight() != null && !list.contains(pop.getRight())) {
                    stack.push(pop.getRight());
                    list.add(pop.getRight());
                }
            }
        }
        System.out.println();

         */


    /**
     * 先序遍历
     *
     * @param node 节点
     */
    private void visitByPre(BiNode node) {
        if (node != null) {
            System.out.print(node.getData() + ", ");
            visitByPre(node.getLeft());
            visitByPre(node.getRight());
        }
    }

    /**
     * 中序遍历
     *
     * @param node 节点
     */

    private void visitByMid(BiNode node) {
        if (node == null) {
        } else {
            visitByMid(node.getLeft());
            System.out.print(node.getData() + ", ");
//            if (node.prent != null) {
//                System.out.println(node.getPrent().getData());
//            } else {
//                System.out.println();
//            }
            visitByMid(node.getRight());
        }
    }

    /**
     * 后序遍历
     *
     * @param node 节点
     */

    private void visitByAfter(BiNode node) {
        if (node == null) {
        } else {
            visitByAfter(node.getLeft());
            visitByAfter(node.getRight());
            System.out.print(node.getData() + ", ");
        }
    }

    /**
     * 按照键盘里录入的方式构造二叉树
     */
    public void creatTreeByInput() {
        if (isEmpty()) {
            this.root = new BiNode();
        }
        creat(this.root);
    }


    /**
     * 递归的键盘录入构造节点
     *
     * @param node 根节点
     * @return node
     */


    private BiNode creat(BiNode node) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入节点的值（#为空）");
        String str = sc.nextLine();
        while (!str.matches("(\\d+)||[#]")) {
            System.out.println("错误");
            str = sc.nextLine();
        }
        if (str.equals("#")) {
            node = null;
        } else {
            node.setData(Integer.parseInt(str));
            size++;
            System.out.println(node.getData());
            node.setLeft(creat(new BiNode()));

            node.setRight(creat(new BiNode()));

        }
        return node;
    }


    /**
     * 利用“先序遍历”序列来构造二叉树
     * 非空二叉树调用这个方法会覆盖原来节点
     *
     * @param str 表示二叉树“先序遍历”序列的字符串 如："123##45#7##6###"
     *            没有合法性效验如果不合法会抛出异常
     */
    public void creatTree(String str) {
        this.setTreeOfStr(str);
        this.root = new BiNode();
        //调用私有方法
        this.creatTree2(this.root, this.treeOfStr.charAt(this.indexOfStr));
        this.indexOfStr = 0;

    }


    /**
     * 私有的二叉树建立方法 被creatTree(MyBinaryTree tree,String str)调用
     *
     * @param node 节点
     * @param ch   添加到该节点的字符
     * @return 节点
     */
    private BiNode creatTree2(BiNode node, char ch) {
        if (ch == '#') {
            node = null;

        } else {
            node.setData(ch - 48);
            size++;
            indexOfStr++;
            node.setLeft(creatTree2(new BiNode(), treeOfStr.charAt(indexOfStr)));

            indexOfStr++;
            node.setRight(creatTree2(new BiNode(), treeOfStr.charAt(indexOfStr)));

        }
        return node;
    }


    /**
     * 构造二叉查找树（是平衡二叉树），中序遍历会的到由大到小的节点序列
     * 非空二叉树调用这个方法会将原来值覆盖
     *
     * @param arr 存储节点序列的数组 （不能有重复值）
     */
    public void creatFindTree(int[] arr) {
        boolean flag = MyTools.isRepeat(arr);
        if (flag) {
            //传递一个有重复元素的数组会异常
            throw new RuntimeException() {
            };
        }

        cleanTree();
        this.root = new BiNode();
        setTreeOfArray(arr);
        //调用私有方法,一个个的按照查找二叉树规则 构建二叉树
        while (indexOfArr < treeOfArray.length) {
            this.addByFind(root, this.treeOfArray[indexOfArr]);
            indexOfArr++;
        }
        indexOfArr = 0;

    }

    /**
     * 私有的构建查找二叉树节点的方法
     *
     * @param node 当前节点
     * @param data 要插入的数据
     */

    private void addByFind(BiNode node, int data) {

        //空树就直接赋值
        if (isEmpty()) {
            node.setData(data);
            size++;
            return;
        }

        //判断 小于当前节点就插到左子树
        if (data < node.getData()) {
            //判断左子树是不是空
            if (node.getLeft() == null) {
                //空就要新建一个节点，并将data赋值
                node.setLeft(new BiNode(data));

                size++;
            } else {
                //不为空就要递归调用他的左子树，并将data传过去
                addByFind(node.getLeft(), data);
            }
        } else {
            if (node.getRight() == null) {
                node.setRight(new BiNode(data));

                size++;
            } else {
                addByFind(node.getRight(), data);
            }
        }

        //判断当前是不是平衡二叉树
        //当添加完一个节点，不平衡的话，就旋转

        //左旋转
        if (node.rightHeight() - node.leftHeight() > 1) {
            //如果该节点的右子树的左子树的高度大于该节点的右子树的右子树的高度

            if (node.getRight() != null && node.getRight().leftHeight() > node.getRight().rightHeight()) {
                //就先对右子节点右旋转
                //node.getRight().rightRotate();
                rightRotate(node.getRight());
                //然后对当前节点左旋转
                leftRotate(node);
            } else {
                //否则直接对当前节点左旋转
                leftRotate(node);
            }
            return;
        }

        //右旋转
        if (node.leftHeight() - node.rightHeight() > 1) {
            //如果该节点的左子树的右子树的高度大于该节点的左子树的左子树的高度
            if (node.getLeft() != null && node.getLeft().rightHeight() > node.getLeft().leftHeight()) {
                //就先对左子节点左旋转
                //this.getLeft().leftRotate();
                leftRotate(node.getLeft());
                //然后对当前节点右旋转
                rightRotate(node);
            } else {
                //否则直接对当前节点右旋转
                rightRotate(node);
            }
        }

    }


    /**
     * 左旋操作
     * @param node 以node节点
     */
    private void leftRotate(BiNode node) {
        //创建一个新的节点，且其值等于二叉树根节点的值
        BiNode newNode = new BiNode(node.getData());
        //把新节点的左子树设置成当前节点的左子树
        newNode.setLeft(node.getLeft());
        //把新节点的右子树设置成当前节点右子树的左子树
        newNode.setRight(node.getRight().getLeft());
        //把当前节点的值设置成其右子节点的值
        node.setData(node.getRight().getData());
        //把当前节点的右子树设置成其右子树的右子树
        node.setRight(node.getRight().getRight());
        //把当前节点的左子树设置成新节点
        node.setLeft(newNode);
    }

    /**
     * 右旋转
     * @param node 以node节点
     */
    private void rightRotate(BiNode node) {
        //创建一个新的节点，且其值等于二叉树根节点的值
        BiNode newNode = new BiNode(node.getData());
        //把新节点的右子树设置成当前节点的右子树
        newNode.setRight(node.getRight());
        //把新节点的左子树设置成当前节点左子树的右子树
        newNode.setLeft(node.getLeft().getRight());
        //把当前节点的值设置成其左子节点的值
        node.setData(node.getLeft().getData());
        //把当前节点的左子树设置成其左子树的左子树
        node.setLeft(node.getLeft().getLeft());
        //把当前节点的右子树设置成新节点
        node.setRight(newNode);
    }


    /**
     * 复制二叉树，新树与旧树有着相同结构
     *
     * @param tree 要复制的二叉树
     * @return 复制到的新树
     */
    public static MyBinaryTree copyTree(MyBinaryTree tree) {

        if (tree.isEmpty()) {
            return null;
        }
        MyBinaryTree newTree = new MyBinaryTree();
        newTree.size = tree.size();
        copy(tree.getRoot(), newTree.getRoot());
        return newTree;
    }

    /**
     * 私有的的递归节点复制方法
     *
     * @param node    被复制的节点
     * @param newNode 复制到的节点
     */
    private static void copy(BiNode node, BiNode newNode) {

        //复制 data域
        newNode.setData(node.getData());

        //判断node的左子树是不是空，空就不用复制，非空就继续递归复制。直到为空
        if (node.getLeft() != null) {
            newNode.setLeft(new BiNode());

            copy(node.getLeft(), newNode.getLeft());
        }

        if (node.getRight() != null) {
            newNode.setRight(new BiNode());

            copy(node.getRight(), newNode.getRight());
        }

    }

    /**
     * 得到该二叉树的深度
     *
     * @return 深度
     */
    public int getDepth() {
        if (isEmpty()) {
            return 0;
        }
        return this.root.depth(this.root);
    }


    /**
     * 得到该二叉树的节点个数
     *
     * @return 节点个数
     */
    public int getNodeCount() {
        if (isEmpty()) {
            return 0;
        }
        return nodeCount(this.root);
    }

    /**
     * 私有的递归调用求节点个数的方法
     *
     * @param node 要求的节点
     * @return 节点个数
     */
    private int nodeCount(BiNode node) {
        //!!!注意 每一个节点就是一个二叉树
        //左右子树的节点个数
        int countLeft;
        int countRight;

//        if (node.getLeft()==null){
//            countLeft=0;
//        }else {
//            countLeft=nodeCount(node.getLeft());
//        }

        //如果该节点的左子树为空,那么他左子树的节点个数为0，否则左子树的节点个数就得递归了
        countLeft = node.getLeft() == null ? 0 : nodeCount(node.getLeft());
        countRight = node.getRight() == null ? 0 : nodeCount(node.getRight());

        //node 的节点个数就是他左右节点个数加上根节点
        return countLeft + countRight + 1;

    }

    /**
     * 得到该二叉树的叶子节点个数
     *
     * @return 叶子节点数
     */
    public int getLeafCount() {
        //空树直接为空
        if (isEmpty()) {
            return 0;
        }
        return leafCount(this.root);
    }


    /**
     * 私有的递归调用求叶子节点个数的方法
     *
     * @param node 要求的节点
     * @return 叶子节点个数
     */
    private int leafCount(BiNode node) {

        //左右计数
        int countLeft = 0;
        int countRight = 0;

        //左右都是空，那这个节点就是叶子结点，返回1
        if (node.getLeft() == null && node.getRight() == null) {
            return 1;
        } else {
            //不为空就要递归调用
            if (node.getLeft() != null) {
                countLeft = leafCount(node.getLeft());
            }
            if (node.getRight() != null) {
                countRight = leafCount(node.getRight());
            }
        }

        //返回 左子树的叶子结点数+右子树的叶子节点数
        return countLeft + countRight;
    }


}
