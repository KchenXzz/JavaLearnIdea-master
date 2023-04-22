package test.IO;

import java.io.*;
import java.util.Arrays;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/4/16 14:49
 */
public class Sort {
    public static void main(String[] args) throws IOException {

        FileInputStream in = new FileInputStream("JavaLearnIdea-master\\src\\test\\IO\\sort.txt");

        StringBuilder builder = new StringBuilder();
        while (true){
            int i=in.read();
            if (i!=-1){
                builder.append((char) i);
            }else break;
        }
        String s = builder.toString();//转成字符串
        String[] split = s.split("-");//切割

        Arrays.sort(split);//排序

        FileWriter out = new FileWriter("JavaLearnIdea-master\\src\\test\\IO\\sort.txt");

        //用循环写
        for (int i = 0; i < split.length; i++) {
            if (i== split.length-1){
                out.write(split[i]+"");
            }else {
                out.write(split[i]+"-");
            }
        }

        out.close();












    }
}
