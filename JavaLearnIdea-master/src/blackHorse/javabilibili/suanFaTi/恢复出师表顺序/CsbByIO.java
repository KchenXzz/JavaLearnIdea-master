package blackHorse.javabilibili.suanFaTi.恢复出师表顺序;

import java.io.*;
import java.util.ArrayList;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/4/22 20:38
 */
public class CsbByIO {
    public static void main(String[] args) throws IOException {

        //读文件
        BufferedReader reader = new BufferedReader(new FileReader("JavaLearnIdea-master\\src\\blackHorse\\javabilibili\\suanFaTi\\恢复出师表顺序\\csb.txt"));
        //待会把文件放到list里
        ArrayList<String> list = new ArrayList<>();
        //一个字符一个字符的读
        int i = reader.read();
        //等于-1说明没读到
        while (i != -1) {
            //字符拼接
            StringBuilder builder = new StringBuilder();

            //把数字后面到一起放到builder里
            do {
                builder.append((char) i);
                i = reader.read();
            } while (i > 57 || i < 49 && i != -1);//当读到数字或者没有字符了就退出循环
            //放到list里
            list.add(builder.toString());
            //清空builder
            builder.setLength(0);
        }
        //关流
        reader.close();

        //再定义一个用于拼接字符串的
        StringBuilder builder = new StringBuilder();
        //用个循环来依次找出1~9的顺序
        for (int j = 1; j < 10; j++) {//一次生成1~9
            //遍历list
            for (String s1 : list) {
                //如果s1的一一个字符是当前的j的值（需要+48）
                if (s1.charAt(0) == (j+48)) {
                    builder.append(s1.substring(1));//放到字符缓冲区，并删除序号，直接添加s1则带着序号
                }
            }
        }
        //写入文件
        BufferedWriter writer = new BufferedWriter(new FileWriter("JavaLearnIdea-master\\src\\blackHorse\\javabilibili\\suanFaTi\\恢复出师表顺序\\csb1.txt"));
        //转成字符串并写到文件
        writer.write(builder.toString());
        writer.close();//关流

    }
}
