package blackHorse.javabilibili.suanFaTi.求素数;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        //判断是不是质数
        //质数，就是除一和他本身外，不能被整除

        System.out.println("请输入要判断的数：");
        Scanner sc = new Scanner(System.in);
        //录入一个数
        int num = sc.nextInt();
        //拿num对i取余，如果余数为零，那就不是质数
        System.out.println(num+"是不是质数");
        System.out.println("-----------------------------");
        System.out.println(isPrime(num));
        System.out.println("-----------------------------");
        System.out.println(isPrime2(num));

    }

    public static boolean isPrime(int num){
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime2(int num){
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
