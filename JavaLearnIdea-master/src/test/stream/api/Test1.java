package test.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/3/28 23:05
 */
public class Test1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("张桑");
        list.add("张三丰");
        list.add("张无几");
        list.add("赵敏");
        list.add("独孤求败");
        list.add("张三");
        list.add("张三");
        list.add("张三");

        //取前几个元素
        list.stream().limit(3).forEach(s -> System.out.print(s + "  "));
        System.out.println();

        //跳过
        list.stream().skip(3).forEach(s -> System.out.print(s + "  "));
        System.out.println();

        //去重
        list.stream().distinct().forEach(s -> System.out.print(s + "  "));
        System.out.println();

        //合并流
        Stream.concat(list.stream(),list.stream().distinct()).forEach(s -> System.out.print(s+"   "));
        System.out.println();

        //提取流里面的数据

        //提取s的长度
        list.stream().map(s -> s.length()).forEach(s -> System.out.print(s+"     "));
        //提取第一个字符强转成int
        list.stream().map(s -> (int)s.charAt(1)).forEach(s -> System.out.print(s+"     "));
        System.out.println();

        //终结方法
        System.out.println(list.stream().count());//计数

        String[] array = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(array));

        //收集方法



    }
}
