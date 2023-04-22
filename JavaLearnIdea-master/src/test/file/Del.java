package test.file;

import java.io.File;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/4/10 20:57
 */
public class Del {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\kcx\\Downloads\\aria2-1.36.0-win-64bit-build1");

        del(file);

    }

    private static void del(File file) {


        File[] files = file.listFiles();
        if (files.length != 0) {
            for (File file1 : files) {

                if (file1.isFile()) {
                    file1.delete();
                } else {
                    del(file1);
                }

            }

            file.delete();

        }
    }
}