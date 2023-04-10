package test.file;

import java.io.File;
import java.io.IOException;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/4/9 12:03
 */
public class Test2 {
    public static void main(String[] args) throws IOException {

        File file1 = new File("C:\\Users\\kcx\\Documents\\learning\\java\\abc.txt");

        File file2 = new File(file1.getParent(),"b.txt");
        System.out.println(file2);

        System.out.println(file2.exists());
//        System.out.println(file2.isDirectory());
//        System.out.println(file2);




        boolean isCra = file2.createNewFile();
        System.out.println(isCra);

        System.out.println(file2);

    }
}
