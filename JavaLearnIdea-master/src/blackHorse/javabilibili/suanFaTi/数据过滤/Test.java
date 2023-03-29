package blackHorse.javabilibili.suanFaTi.数据过滤;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/3/29 11:57
 */
public class Test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Collections.addAll(list,1,2,3,4,5,6,7,8,9);


        //对list进行过滤，留下奇数
        list=list.stream().filter(n -> n%2!=0).toList();

        System.out.println(list);


    }
}
