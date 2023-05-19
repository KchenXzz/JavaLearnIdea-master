package blackHorse.javabilibili.suanFaTi.IO点名器;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

/**
 * //TODO
 *
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/5/19 14:01
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {




    }

    /**
     * 计算一万次的男女分布
     * @throws IOException
     */
    private static void sum() throws IOException {
        int boy=0,girl=0;
        for (int i = 0; i < 10000; i++) {
            String stu = dianMing2();
            String[] split = stu.split("-");
            if (split[1].equals("男")){
                boy++;
            }else girl++;
        }
        System.out.println(boy);
        System.out.println(girl);
    }


    /**
     * 正常点名，每次概率一样，可重复
     * @return
     * @throws IOException
     */
    private static String dianMing1() throws IOException {
        String stud;

        Random random = new Random();

        int tar = random.nextInt(10)+1;
        BufferedReader br = new BufferedReader(new FileReader("JavaLearnIdea-master\\src\\test\\IO\\paQuXingMing\\name.txt"));
        int count = 1;
        while (true) {
            String stu = br.readLine();
            if (count == tar) {
                stud=stu;
                break;
            }
            count++;
        }

        br.close();
        return stud;
    }

    /**
     * 男女概率不一样的点名
     * @return
     * @throws IOException
     */
    private static String dianMing2() throws IOException {
        int sum = 100;

        String student;
        Random random = new Random();

        int tar = random.nextInt(101)+1;
        int num = random.nextInt(10);
        String flag;
        if (num <= 6) {
            flag= "男";//70%
        } else {
            flag= "女";//30%
        }

        BufferedReader br = new BufferedReader(new FileReader("JavaLearnIdea-master\\src\\test\\IO\\paQuXingMing\\name.txt"));
        int count = 1;
        while (true) {
            String stu = br.readLine();

            if (count == tar) {
                String[] split = stu.split("-");
                if (split[1].equals(flag)){
                    student=stu;
                    break;
                }else {
                    stu=br.readLine();
                    count--;
                }
            }
            count++;
        }
        br.close();
        return student;



    }

}
