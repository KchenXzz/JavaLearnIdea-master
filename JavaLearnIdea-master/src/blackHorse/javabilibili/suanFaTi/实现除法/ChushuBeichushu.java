package blackHorse.javabilibili.suanFaTi.实现除法;

public class ChushuBeichushu {
    public static void main(String[] args) {
        //给定被除数除数
        //不用/,%运算符求 商和余数
        //  被除数/除数=商......余数
        //    用减法来实现除法
        // 1   23 -7  16
        // 2   16-7    9
        // 3次  9-7    2
        //     2-7  不行
        int beichu=23;
        int chu=7;
        int shang=0;
        int yu=0;
        while (beichu>chu){

            beichu=beichu-chu;
            shang++;
        }
        //被除数剩的就是余数
        yu=beichu;
        System.out.println("商："+shang);
        System.out.println("余数："+yu);



    }
}
