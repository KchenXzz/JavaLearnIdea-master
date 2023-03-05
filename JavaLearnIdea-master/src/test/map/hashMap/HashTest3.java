package test.map.hashMap;

import java.util.HashMap;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/3/5 15:21
 */
public class HashTest3 {
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();

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