package test.system;

import blackHorse.javabilibili.suanFaTi.求素数.Prime;

/**
 * @projectName: JavaLearnIdea
 * @package: test.system类
 * @className: Test
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/5 11:14
 * @version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        //可以利用System.currentTimeMillis()调用系统事件来计算程序运行时间
        //判断算法效率
        long start =System.currentTimeMillis();
        for (int i = 1; i <=100000 ; i++) {
            if (Prime.isPrime(i)){
                System.out.println(i);
            }
        }
        long end=System.currentTimeMillis();
        for (int i = 1; i <=100000 ; i++) {
            if (Prime.isPrime2(i)){
                System.out.println(i);
            }
        }
        long end2=System.currentTimeMillis();
        System.out.println("第一个运行"+(end-start)+"毫秒");
        System.out.println("第二个运行"+(end2-end)+"毫秒");





    }

}
