package test.file;

import java.io.File;
import java.sql.SQLOutput;
import java.util.Date;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/4/9 11:39
 */
public class Test1 {
    public static void main(String[] args) {

        String path = "C:\\Users\\kcx\\Downloads\\JavaLearnIdea-master\\JavaLearnIdea-master\\src\\test\\file\\Test1.java";
        File file = new File(path);

        System.out.println(file.isFile());//是文件吗
        System.out.println(file.isDirectory());//是路径吗


        System.out.println(file.getParentFile());//得到父级路径
        System.out.println(file.exists());//是否存在
        long l = file.lastModified();//返回上次修改时间的毫秒值
        System.out.println(new Date(l));//转成日期

        System.out.println(file.getAbsolutePath());//返回绝对路径
        System.out.println(file.getPath());//返回定义文件之的路径
        System.out.println(file.getName());//返回文件名
        System.out.println(file.length());//返回文件大小（字节数量）



    }
}
    