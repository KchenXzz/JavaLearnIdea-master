package test.IO.bufferedStreams;

import java.io.*;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/4/16 21:01
 */
public class Test2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("JavaLearnIdea-master\\src\\test\\IO\\bufferedStreams\\txtfile.txt"));
        BufferedWriter brw = new BufferedWriter(new FileWriter("JavaLearnIdea-master\\src\\test\\IO\\bufferedStreams\\txtfile2.txt"));
//        String s = br.readLine();
//        System.out.println(s);





        while (true) {
            String s = br.readLine();
            if (s!=null) {
                brw.write(s);
                brw.newLine();
            } else {
                break;
            }
        }

        br.close();

        brw.close();

    }
}
