package test.collection.unchangedColl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/3/28 21:59
 */
public class Test1 {
    public static void main(String[] args) {

        //list();

        Set<String> set = Set.of("saa", "saaa", "saa1", "s2aa", "s3aa", "s4aa");


        Map<String, String> map = Map.of("saa", "saaa", "saa1", "s2aa", "s3aa", "s4aa");


        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("3","c");
        hashMap.put("4","d");
        hashMap.put("5","e");
        hashMap.put("1","a");
        hashMap.put("2","b");
        hashMap.put("6","f");
        hashMap.put("7","g");
        hashMap.put("8","h");
        hashMap.put("9","i");
        hashMap.put("10","j");


        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        Map.Entry[] array = entries.toArray(new Map.Entry[0]);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }
        System.out.println();

        Map map1 = Map.ofEntries(array);

        System.out.println(map1);

        //也可以用 Map.copyOf(hashMap) 可变集合会复制一个不可变的集合
        Map<String, String> map2 = Map.copyOf(hashMap);

        System.out.println(map2);


    }

    private static void list() {
        List<String> list = List.of("aafd", "saf", "saf", "saf", "saf", "saf", "saf");

        System.out.println(list);
//        list.add("saa");//不能添加
//        list.clear();//不能清空
//        list.remove("aafd");//不能删除
//        list.remove(1);//不能删除
        System.out.println(list);
    }
}
