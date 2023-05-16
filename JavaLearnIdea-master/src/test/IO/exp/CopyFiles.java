package test.IO.exp;

import java.io.*;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/4/16 11:54
 */
public class CopyFiles {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\kcx\\Documents\\learning\\test");//源文件
        File dest = new File("C:\\Users\\kcx\\Documents\\learning\\dest");//目的地
        //复制
        copyfiles(file, dest);


    }

    private static void copyfiles(File file, File dest) throws IOException {
        dest.mkdir();//创建目的文件夹
        File[] files = file.listFiles();//得到源文件的子目录

        //循环
        for (File file1 : files) {
            if (file1.isFile()) {//是文件，复制
                FileInputStream in = new FileInputStream(file1);//源文件的输入字节流
                //目的文件的输出字节流，new File(dest, file1.getName())dest与file是同一级，所以要在dest的目录下创建file.getname
                FileOutputStream out = new FileOutputStream(new File(dest, file1.getName()));
                //复制的循环
                while (true) {
                    byte[] bytes = new byte[1024 * 1024];//字节数组，复制快
                    int i = in.read(bytes);
                    if (i != -1) {//如果读的到
                        out.write(bytes, 0, i);//写入
                    } else break;//读不到跳出循环
                }
                //关流
                in.close();
                out.close();
            } else {//不是文件就递归，这里目的地也是file1的getname
                copyfiles(file1, new File(dest, file1.getName()));
            }
        }

    }
}
