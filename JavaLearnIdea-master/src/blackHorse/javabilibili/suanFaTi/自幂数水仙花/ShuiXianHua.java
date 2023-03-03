package blackHorse.javabilibili.suanFaTi.自幂数水仙花;

/**
 * @projectName: JavaLearnIdea
 * @package: blackHorse.javabilibili.leetCode.自幂数
 * @className: ShuiXianHua
 * @author: Kchenx
 * @description: 三位数的自幂数叫水仙花数-----》 153=1^3+5^3+3^3
 * @date: 2023/1/4 10:16
 * @version: 1.0
 */
public class ShuiXianHua {
    //三位数的自幂数叫水仙花数-----》 153=1^3+5^3+3^3
    // 求一共有多少个水仙花数
    public static void main(String[] args) {

        System.out.println(countSiWei());






    }

    //三位数的
    public static int countSxh() {
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = ((i / 10) / 10) % 10;
            if ((Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3)) == i) {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
    //四位数的
    public static int countSiWei() {
        int count = 0;
        for (int i = 1000; i < 10000; i++) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = ((i / 10) / 10) % 10;
            int d=(((i / 10) / 10)/10)%10;
            if ((Math.pow(a,4) + Math.pow(b,4) + Math.pow(c,4)+Math.pow(d,4)) == i) {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }



}
