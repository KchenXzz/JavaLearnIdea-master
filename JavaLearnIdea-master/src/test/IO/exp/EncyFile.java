package test.IO.exp;

import java.io.*;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/4/16 12:25
 */
public class EncyFile {

    private static int password =100;
    public static void main(String[] args) throws IOException {
        /*
        异或加密：
            10010
          ^ 00010
          —————————
            10000
          ^ 00010
          ————————
            10010
          两次异或同一个数，就会得到原来的数
         */

        File file = new File("JavaLearnIdea-master\\src\\test\\IO\\a.png");
        File file1 = new File("JavaLearnIdea-master\\src\\test\\IO\\a1.png");


        //加密
        encryFile(file,file1);


        //解密
        File file2 = decryFile(file1);


    }

    private static void encryFile(File file, File newFile) throws IOException {
        FileInputStream in = new FileInputStream(file);
        //新文件
        FileOutputStream out = new FileOutputStream(newFile);
        while (true) {
            int i = in.read();
            if (i != -1) {
                out.write(i^password);
            } else break;
        }
        in.close();
        out.close();
    }
    private static File decryFile(File file) throws IOException {
        FileInputStream in = new FileInputStream(file);
        //新文件
        File desc = new File(file.getParent() + "\\desc.png");
        FileOutputStream out = new FileOutputStream(desc);
        while (true) {
            int i = in.read();
            if (i != -1) {
                out.write(i^password);
            } else break;
        }
        in.close();
        out.close();
        return desc;
    }
}
