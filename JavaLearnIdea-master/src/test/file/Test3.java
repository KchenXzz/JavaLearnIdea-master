package test.file;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/4/10 16:44
 */
public class Test3 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\kcx\\Documents\\learning");


        findPng(file);//找出所有的png文件

        System.out.println(getDirSize(file));//这个文件夹的大小
        //9.66 MB (10,133,504 字节)  10017095



        getFileCount(file);//每种文件类型的统计


//        File[] files = file.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isDirectory();
//            }
//        });
//
//        System.out.println(Arrays.toString(files));
//
//        File[] files1 = file.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return true;
//            }
//        });
//        System.out.println(Arrays.toString(files1));


    }

    /**
     * 统计各种类型文件的数量并打印
     * @param file file对象
     */
    private static void getFileCount(File file) {
        HashMap<String, Integer> count = Count(file);
        Set<Map.Entry<String, Integer>> entries = count.entrySet();
        System.out.print("[");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.print(" "+entry.getKey()+"="+entry.getValue()+" ");
        }
        System.out.println("]");
    }

    /**
     * 依次输出文件夹下的png文件名
     * @param file file对象
     */
    private static void findPng(File file) {//删除方法思路一样，是路径就递归，是文件就删除，最后在删除传进来的参数file
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {//是不是文件夹
                findPng(file1);//是，就递归
            } else {//不是就判断文件是不是Png类型
                if (file1.isFile() && file1.getName().endsWith(".png")) {
                    System.out.println(file1.getName());
                }
            }
        }

    }


    /**
     * 返回这个文件夹的大小
     * @param file file对象
     * @return 字节数
     */
    public static long getDirSize(File file) {

        File[] files = file.listFiles();
        long count = 0;//计数
        for (File file1 : files) {//遍历目录
            if (file1.isDirectory()) {//是不是文件夹
                count = count + getDirSize(file1);//是就递归，另外要累加count
            } else {//不是，就判断是不是文件
                if (file1.isFile()) {
                    //System.out.println(file1.length());
                    count += file1.length();//累加，加上这个文件的字节数
                }
            }

        }
        return count;

    }

    /**
     * 返回存储这个文件夹下的各种类型文件数量的hashmap
     * @param file file对象
     * @return 将统计的个数放到map里返回
     */
    private static HashMap<String, Integer> Count(File file) {
        File[] files = file.listFiles();
        HashMap<String, Integer> map = new HashMap<>();//用hashmap来存储统计到的数据

        for (File file1 : files) {//遍历
            if (file1.isFile()) {//是不是文件，
                String name = file1.getName();//是，就先得到文件名
                String[] split = name.split("\\.");//分割，以.来分割 ada.txt
                if (split.length >= 2) {//大于等于2说明分割开了,没有扩展名的文件是分不开的
                    String key = split[split.length - 1];//得到字符分割的最后一段，也就是扩展名key
                    if (map.containsKey(key)) {//先看map里有没有这个Key
                        int val = map.get(key);//有，就得到他当前数量val
                        map.put(key, ++val);//再加1放回map里
                    } else {//没有
                        map.put(key, 1);//直接放进去val=1
                    }
                }
            } else {//不是文件，也就是文件夹，就要递归了，返回值用map1接受
                HashMap<String, Integer> map1 = Count(file1);
                Set<Map.Entry<String, Integer>> entries = map1.entrySet();//得到他的键值对
                for (Map.Entry<String, Integer> entry : entries) {//遍历
                    String key = entry.getKey();//依次得到key和val
                    Integer value = entry.getValue();
                    if (map.containsKey(key)) {//还是判断map里有没有key
                        int sum = map.get(key);//有，就在原有值sum上加上val
                        sum = sum + value;
                        map.put(key, sum);//放进去
                    } else {
                        map.put(key, value);//没有就直接吧key和val放进去
                    }
                }
            }
        }
        return map;//每次递归返回map
    }


}