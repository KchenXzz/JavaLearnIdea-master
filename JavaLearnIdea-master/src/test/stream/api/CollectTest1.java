package test.stream.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/3/28 23:46
 */
public class CollectTest1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();


        Collections.addAll(list,"张-男-13","赵云-男-34","萨菲-女-24","赵敏-女-24","盖伦-男-26","诸葛亮-男-44");


        //提取列表中男性 放入到map中去
        Map<String, Integer> map = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]) )//一定使用 "男".equals
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));
        System.out.println(map);



        //lamba表达式写法
        Map<String, Integer> map1 = list.stream()
                .filter(n -> "男".equals(n.split("-")[1]))
                .collect(Collectors.toMap(
                        k -> k.split("-")[0], v -> Integer.parseInt(v.split("-")[2])
                ));
        System.out.println(map1);

    }
}
