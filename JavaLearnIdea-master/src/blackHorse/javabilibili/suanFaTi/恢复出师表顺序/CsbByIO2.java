package blackHorse.javabilibili.suanFaTi.恢复出师表顺序;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/4/22 21:25
 */
public class CsbByIO2 {
    public static void main(String[] args) throws IOException {

        //读文件
        BufferedReader reader = new BufferedReader(new FileReader("JavaLearnIdea-master\\src\\blackHorse\\javabilibili\\suanFaTi\\恢复出师表顺序\\csb.txt"));
        //待会把文件放到list里
        ArrayList<String> list = new ArrayList<>();

        String line;
        while ((line=reader.readLine())!=null){
            list.add(line);
        }

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(0) - o2.charAt(0);
            }
        });
        //写入文件
        BufferedWriter writer = new BufferedWriter(new FileWriter("JavaLearnIdea-master\\src\\blackHorse\\javabilibili\\suanFaTi\\恢复出师表顺序\\csb2.txt"));

        for (String s : list) {
            writer.write(s);
            writer.newLine();
        }

        reader.close();
        writer.close();
    }
}
