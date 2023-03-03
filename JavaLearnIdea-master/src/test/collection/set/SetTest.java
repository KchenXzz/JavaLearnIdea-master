package test.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @projectName: JavaLearnIdea
 * @package: test.collection.set
 * @className: SetTest
 * @author: Kchenx
 * @description: Set测试类
 * @date: 2023-2-10 上午 9:42
 * @version: 1.0
 */
public class SetTest {
    public static void main(String[] args) {
/*
              去重
              无序
              无索引
 */

        Set<String> set = new HashSet<>();

        set.add("tom");
        set.add("tom");//重复
        set.add("jerry");
        set.add("mixi");
        set.add("tim");

        System.out.println(set);//[tom, tim, jerry, mixi]

        set.forEach(System.out::print);

        System.out.println();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        for (String s : set) {
            System.out.print(s+" ");
        }


    }
}
