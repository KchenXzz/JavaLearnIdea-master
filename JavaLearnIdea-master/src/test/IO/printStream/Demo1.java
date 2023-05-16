package test.IO.printStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/4/27 16:12
 */
public class Demo1 {
    public static void main(String[] args) throws FileNotFoundException {


        PrintStream ps = new PrintStream(new FileOutputStream("JavaLearnIdea-master\\src\\test\\IO\\printStream\\demo1.txt"),false);
        PrintStream ps1 = new PrintStream(new FileOutputStream("JavaLearnIdea-master\\src\\test\\IO\\printStream\\demo1.txt"), false,Charset.forName("UTF-8"));


        ps.println("ps");

        ps1.println("ps1");

        ps.println(123 );

        ps1.println("asfd");




    }
}
