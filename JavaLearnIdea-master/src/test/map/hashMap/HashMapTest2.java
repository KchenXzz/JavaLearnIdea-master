package test.map.hashMap;

import horstmann.corejava.Employee;

import java.util.*;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/3/3 14:26
 */
public class HashMapTest2 {


    /**
     * 某班80名学生
     * 对ABCD四个景点进行投票
     * 每个学生只能投一个
     * 计算哪个景点的票多
     */



    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        //随机数模拟投票
        random(map);

        System.out.println(map);

        //将得到的键值对放到集合里
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        //存最高票数
        Integer val = 0;
        //找到最高票数
        for (Map.Entry<String, Integer> ent : entries) {
            if (ent.getValue() > val) {
                val = ent.getValue();
            }
        }

        //利用迭代器在键值对里找val对应的key(景点)
        for (Map.Entry<String, Integer> next : entries) {
            if (next.getValue().equals(val)) {
                System.out.println(next);
            }
        }

    }

    /**
     * 模拟80人投票
     */
    private static void random(HashMap<String, Integer> map) {
        Random random = new Random();

        for (int i = 0; i < 80; i++) {

            switch (random.nextInt(4)) {
                case 0 -> toupiao(map, "A");
                case 1 -> toupiao(map, "B");
                case 2 -> toupiao(map, "C");
                case 3 -> toupiao(map, "D");
            }
        }


    }


    /**
     * 投票方法
     * @param map 将票数（val）放到对应的景点（Key）
     * @param jd 要投的景点
     */
    private static void toupiao(HashMap<String, Integer> map, String jd) {

        if (map.containsKey(jd)){
            Integer val = map.get(jd)+1;
            map.put(jd,val);
        }else {
            map.put(jd,1);
        }

    }


}
