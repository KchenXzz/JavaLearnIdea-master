package test.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/3/2 18:42
 */
public class MapTest2 {
    public static void main(String[] args) {


        Map<String,String> map=new HashMap<>();

        map.put("a","1");
        map.put("b","2");
        map.put("c","3");
        map.put("d","4");
        map.put("e","5");


        //放到个集合里再用集合的方法遍历
        Set<String> keys = map.keySet();

        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        keys.forEach(System.out::println);


        //便利值
        System.out.println(map.values());


        //键值对遍历
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries);

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        Iterator<Map.Entry<String, String>> iterator1 = entries.iterator();
        while (iterator1.hasNext()){
            System.out.print(iterator1.next()+" ");
        }
        System.out.println();

        map.forEach((String key,String val)-> System.out.println(key +"="+val));

    }
}
