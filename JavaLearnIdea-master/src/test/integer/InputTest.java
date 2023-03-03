package test.integer;

import java.util.Scanner;

/**
 * @projectName: JavaLearnIdea
 * @package: test.integer
 * @className: InputTest
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-1-19 下午 8:56
 * @version: 1.0
 */
public class InputTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // 遇到空格，回车，制表符就停止接收
//        String s = sc.next();
  //      System.out.println(s);
/*
        String nextLine = sc.nextLine();
        System.out.println(nextLine);


 */
        String intstr = sc.findInLine("\\d*");
        System.out.println(Integer.parseInt(intstr));


    }
}
