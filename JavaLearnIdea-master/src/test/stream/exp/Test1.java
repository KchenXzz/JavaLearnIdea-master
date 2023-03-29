package test.stream.exp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/3/29 11:50
 */
public class Test1 {
    public static void main(String[] args) {

        //guolv();

        //toMap();

        /**
         * 要求：
         * 男演员只要名字为三个的前两人
         * 女演员只要姓杨的，不要第一个
         * 把过滤后的男演员和女演员合并到一起
         * 再将上述演员信息封装成Actor对象
         * 将所有Actor对象放到LIst集合里
         */

        //数据初始化
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        Collections.addAll(list1,"成龙,60","李连杰,55","刘德华,50","张译,35",
                "洪金宝,55","沈腾,36");
        Collections.addAll(list2,"杨幂,22","张婧怡,25","张曼玉,45","刘亦菲,35",
                "林青霞,55","杨千嬅,46");


        //对男演员的过滤
        Stream<String> stream1 = list1.stream()
                .filter(name -> name.split(",")[0].length() == 3)
                .limit(2);

        //女演员的过滤
        Stream<String> stream2 = list2.stream()
                .filter(name -> '杨' == name.charAt(0))// name.splist(",")[0].startsWith("杨")
                .skip(1);


        List<Actor> actors = Stream.concat(stream1, stream2)//合并流
                .map(str -> { //封装成Actor对象
                    return new Actor(str.split(",")[0], Integer.parseInt(str.split(",")[1]));
                })
                .toList();//放到集合里


        System.out.println(actors);


    }

    private static void toMap() {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"张三,23","李四,24","王五,25","赵四,26");

        Map<String, String> map = list.stream()
                .filter(age -> Integer.parseInt(age.split(",")[1]) >= 24)
                .collect(Collectors.toMap(
                        k -> k.split(",")[0], v -> v.split(",")[1]));

        System.out.println(map);
    }

    private static void guolv() {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9);


        //对list进行过滤，留下奇数
        list=list.stream().filter(n -> n%2!=0).toList();

        System.out.println(list);
    }

}
class Actor{

    String name;
    int age;

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
