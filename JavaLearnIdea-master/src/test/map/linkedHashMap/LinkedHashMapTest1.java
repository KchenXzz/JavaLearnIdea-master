package test.map.linkedHashMap;

import java.util.LinkedHashMap;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/3/5 15:16
 */
public class LinkedHashMapTest1 {
    public static void main(String[] args) {

        LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();


        hashMap.put("a", "1");
        hashMap.put("we", "1");
        hashMap.put("sdf", "1");
        hashMap.put("bb", "1");
        hashMap.put("2", "1");


        System.out.println(hashMap);

        System.out.println("a".hashCode());
        System.out.println("we".hashCode());
        System.out.println("sd".hashCode());
        System.out.println("bb".hashCode());
        System.out.println("2".hashCode());










    }



}
