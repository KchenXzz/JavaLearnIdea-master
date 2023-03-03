package blackHorse.javabilibili.suanFaTi.回文数;

import java.util.Scanner;

public class HuiWenShu {
    public static void main(String[] args) {
        //力扣回文数算法题
        //回文数：121,12321,1221都是
        //判断数是不是回文数，也就是看他翻转后跟原数相等吗


        System.out.println("请输入要判断的数：");
        Scanner sc=new Scanner(System.in);
        //定义一个Int数
        int  x=sc.nextInt();
        //定义一个备份，用于比较
        int tem=x;
        //定义一个新数，保存X的翻转
        int m=0;
        //循环把数的个十百位取出来，再接到新数
        while(x!=0){
            //定义个数保存从X各位取出来的值
            int wei =0;
            wei=x%10;
            //把取出来的位上的数放到M里，每次*10之后再相加
            //m按相反的顺序赋值高位到低位
            m=m*10+wei;
            //X缩小十倍，这样就能按>>个十百千万>>的顺序取值
            x=x/10;
        }
        //判断翻转后跟原数相等吗
        if (m==tem){
            System.out.println(tem+"是回文数");
        }else System.out.println(tem+"不是回文数");
        //

        //
    }
}
