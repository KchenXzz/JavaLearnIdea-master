package test.IO.exp;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/4/16 15:07
 */
public class Sort2 {
    public static void main(String[] args) throws IOException {

        /*
        2-5-7-3-1-9-8-4
        排序
        1-2-3-4-5-7-8-9

         */

        //输入流
        FileInputStream in = new FileInputStream("JavaLearnIdea-master\\src\\test\\IO\\sort.txt");
        //字符串拼接
        StringBuilder builder = new StringBuilder();
        while (true) {//读并放到builder
            int i = in.read();
            if (i != -1) {
                builder.append((char) i);
            } else break;
        }
        in.close();//关流

        Integer[] ints = Arrays.stream(builder.toString().split("-"))//把字符串切割成数组并放到流里
                .map(Integer::parseInt)//把流的类型转成int
                .sorted()//排序
                .toArray(Integer[]::new);//返回一个数组并接受

        //吧ints数组转成字符串并格式化成需要的格式
        String s = Arrays.toString(ints).replace(", ", "-");

        //写回文件
        FileWriter out = new FileWriter("JavaLearnIdea-master\\src\\test\\IO\\sort.txt");
        out.write(s.substring(1,s.length()-1));//也是格式化，上面没格式化完
        out.close();//关

    }
}
