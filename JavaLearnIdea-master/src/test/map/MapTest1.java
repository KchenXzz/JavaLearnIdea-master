package test.map;

import java.util.HashMap;
import java.util.Map;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/3/2 18:27
 */
public class MapTest1 {


    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();


        map.put("a","1");
        map.put("b","2");
        map.put("c","3");
        map.put("d","4");
        System.out.println(map.put("e", "5"));//没覆盖返回null
        System.out.println(map.put("e", "6"));//会覆盖5,并将5返回
        System.out.println(map);

        System.out.println(map.remove("a"));//删除键为A的键值对对象并把值1返回

        map.clear();//清空
        System.out.println(map.isEmpty());//判空
        System.out.println(map);

        map.put("a","1");
        map.put("b","2");
        map.put("c","3");
        map.put("d","4");
        map.put("e","5");

        System.out.println(map.containsKey("a"));//判断是否包含键a
        System.out.println(map.containsValue("5"));//判断是否包含值5

        System.out.println(map.size());//长度





    }



}
