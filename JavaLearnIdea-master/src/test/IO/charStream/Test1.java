package test.IO.charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/4/13 12:54
 */
public class Test1 {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("JavaLearnIdea-master\\src\\test\\IO\\txtfile.txt");

        while (true){
            char [] chars=new char[1024];
            int ch;
            if ((ch=reader.read(chars))!=-1){
                System.out.print(new String(chars,0,ch));

            }else break;
        }

        reader.close();

    }
}
