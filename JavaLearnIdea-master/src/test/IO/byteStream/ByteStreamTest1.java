package test.IO.byteStream;

import javax.xml.stream.StreamFilter;
import java.io.*;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/4/12 10:31
 */
public class ByteStreamTest1 {
    public static void main(String[] args) throws IOException {

        String file = "JavaLearnIdea-master/src/test/IO/txtfile.txt";
        File txt = new File(file);
        //续写true,默认是false，不续写的,文件可以接受字符串和file对象
        FileOutputStream out = new FileOutputStream(txt, true);
        out.write(97);
        out.write('\n');
        byte[] bytes = {97, 98, 99, 'd', '$', '9'};
        out.write(bytes);
        out.write('\n');
        out.write(bytes, 3, 2);//从第三个位置取两个字符
        out.write('\n');
        out.close();


        FileInputStream in = new FileInputStream(txt);


        ArrayList<Integer> list = new ArrayList<>();
        //用一个循环读出文件,并放到list里
        while (true) {
            int ch=in.read();
            if (ch !=-1)
                list.add(ch);
            else break;
        }

        for (int integer : list) {
            System.out.print((char)integer);
        }


        in.close();
    }
}
