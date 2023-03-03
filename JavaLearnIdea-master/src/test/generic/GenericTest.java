package test.generic;

import dataStructure.queue.linkQueue.LinkQueue;
import tool.arrays.MyTools;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @projectName: JavaLearnIdea
 * @package: test.generic
 * @className: GenericTest
 * @author: Kchenx
 * @description: 泛型测试类
 * @date: 2023-2-3 下午 7:34
 * @version: 1.0
 */
public class GenericTest {
    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>();
        MyTools.addAllForList(str,"3","aa","和覅亢","fasduhf","234r","shia");
        System.out.println(str);


        LinkedList<String> list = new LinkedList<>();
        MyTools.addAllForList(list,"3","aa","和覅亢","fasduhf","234r","shia");
        System.out.println(list);


        Stack<String> stack = new Stack<>();
        MyTools.addAllForList(stack,"3","aa","和覅亢","fasduhf","234r","shia");
        System.out.println(stack);


        LinkQueue<String> queue = new LinkQueue<>();
        MyTools.addAllForList(queue,"3","aa","和覅亢","fasduhf","234r","shia");
        System.out.println(queue.pop());

    }
}
