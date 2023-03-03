package test.stackTrace;

import java.util.Scanner;

public class StackTraceTest {
    /*
    *Computes the factorial of a number  计算N的阶乘
    *n a non-negative integer  N是一个非负整数
     */
    public static void main(String[]args){
        try(var in=new Scanner(System.in)) {
            System.out.print("输入 N=");
            int n = in.nextInt();
            System.out.println(factorial(n));
        }
    }
    public static int factorial(int n){
//        /*
//        *这一段和下一段代码作用一样？
//         */
//        var out = new StringWriter();
//        new Throwable().printStackTrace(new PrintWriter(out));
//        String description = out.toString();
//        System.out.println(description);
//        /*
//        *一样？？
//         */
//        var walker=StackWalker.getInstance();
//        walker.forEach(System.out::println);

        int r;
        if(n<=1) r=1;
            else r=n*factorial(n-1);
        return r;
    }
}
