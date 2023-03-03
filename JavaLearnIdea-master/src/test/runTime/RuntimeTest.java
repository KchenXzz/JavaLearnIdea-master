package test.runTime;

import java.io.IOException;

/**
 * @projectName: JavaLearnIdea
 * @package: test.runTime
 * @className: RuntimeTest
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/5 12:06
 * @version: 1.0
 */
public class RuntimeTest {
    public static void main(String[] args) throws IOException {
        System.out.println("当前系统运行对象"+Runtime.getRuntime());
        System.out.println("CPU的线程数"+Runtime.getRuntime().availableProcessors());
        System.out.println("JVM能从系统中获取的内存大小。"+Runtime.getRuntime().maxMemory());
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024+"M");
        System.out.println("JVM已从系统中获取的内存大小。"+Runtime.getRuntime().totalMemory());
        System.out.println("JVM剩余的内存大小。。。。。。"+Runtime.getRuntime().freeMemory());

        String[] strings={"python","java","notepad","shutdown -s -t 3600","shutdown -a"};
        Runtime.getRuntime().exec(strings[4]);
        Runtime.getRuntime().exec(strings[0]);
        System.out.println(Runtime.version());
    }
}
