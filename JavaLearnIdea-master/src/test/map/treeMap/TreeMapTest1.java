package test.map.treeMap;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/3/5 15:26
 */
public class TreeMapTest1 {
    public static void main(String[] args) {


        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        treeMap.put(4,"键盘");
        treeMap.put(6,"康师傅");
        treeMap.put(1,"书本");
        treeMap.put(3,"书包");
        treeMap.put(2,"铅笔");
        treeMap.put(5,"鼠标");


        System.out.println(treeMap);


    }
}
