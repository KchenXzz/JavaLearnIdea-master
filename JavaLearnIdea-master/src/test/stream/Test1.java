package test.stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/3/28 22:29
 */
public class Test1 {
    public static void main(String[] args) {

        //单列集合
        ArrayList<String> list = new ArrayList<>();

        list.add("张桑");
        list.add("张三丰");
        list.add("张无几");
        list.add("赵敏");
        list.add("独孤求败");
        list.add("张三");

        List<String> list1 = list.stream().filter(n -> n.startsWith("张")).filter(n -> n.length() == 2).toList();
        System.out.println(list1);


        //双列集合不能直接使用，要转成单列集合

        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("3", "c");
        hashMap.put("4", "d");
        hashMap.put("5", "e");
        hashMap.put("1", "a");
        hashMap.put("2", "b");
        hashMap.put("6", "f");
        hashMap.put("7", "g");
        hashMap.put("8", "h");
        hashMap.put("9", "i");
        hashMap.put("10", "j");

        Set<Map.Entry<String, String>> entries = hashMap.entrySet();

        List<Map.Entry<String, String>> list2 = entries.stream().filter(a -> (a.getKey().hashCode() % 2) == 0).toList();

        System.out.println(list2);


        //也可以
        hashMap.keySet().forEach(System.out::println);


        //数组
        String[] strings = new String[5];
        for (int i = 0; i < strings.length; i++) {
            strings[i]=String.valueOf(i);
        }

        List<String> list3 = Arrays.stream(strings).toList();
        System.out.println(list3);


        //零散数据
        Stream.of(2,3,4,45,5).forEach(System.out::println);



    }
}
