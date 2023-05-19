package blackHorse.javabilibili.suanFaTi.IO点名器;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * //TODO
 * 带权重的随机点名
 * 被点到的权重减半
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/5/19 16:05
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {


        //输入流
        BufferedReader reader = new BufferedReader(new FileReader("JavaLearnIdea-master\\src\\blackHorse\\javabilibili\\suanFaTi\\IO点名器\\stu.txt"));

        ArrayList<Stu> list = new ArrayList<>();

        String read;
        while ((read = reader.readLine()) != null) {
            String[] split = read.split("-");
            //放到列表里
            list.add(new Stu(split[0], split[1], Integer.parseInt(split[2]), Double.parseDouble(split[3])));
        }

        reader.close();
        System.out.println(list);


        //计算总权重
        double w=0;
        for (Stu stu : list) {
            w=w+ stu.getWeight();
        }

        //用同样长度的数组来保存权重
        double[] arr=new double[list.size()];
        //把每个权重的占比放到数组   ————》注意是占比
        for (int i = 0; i < arr.length; i++) {
            arr[i]=list.get(i).getWeight()/w;
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i]+arr[i-1];
        }

        System.out.println(Arrays.toString(arr));

        double random = Math.random();//得到0~1之间的随机数

        System.out.println(random);
        //利用二分查找找到这个随机数在数组的范围的索引，因为二分查找找不到也会返回一个值，可以通过这个值来确定index
        int index = -Arrays.binarySearch(arr, random)-1;

        System.out.println(index);
        System.out.println(list.get(index));
        //更新index处的权重
        list.get(index).setWeight(list.get(index).getWeight()/2);

        //再把包含新权重的对象写到文件
        BufferedWriter writer = new BufferedWriter(new FileWriter("JavaLearnIdea-master\\src\\blackHorse\\javabilibili\\suanFaTi\\IO点名器\\stu.txt"));
        for (Stu stu : list) {
            writer.write(stu.toString());
            writer.newLine();
        }

        writer.close();






    }
}
