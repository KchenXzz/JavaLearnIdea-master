package dataStructure.stack.used.conversion;

import dataStructure.stack.linkStack.LinkStack;

import java.util.Scanner;

public class ConversionTest {
    public static void main(String[] args) {
        LinkStack lStack=new LinkStack();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要转换的数值");
        Conversion c=new Conversion(scanner.nextInt());
        System.out.println("二进制："+c.toBinary());
        System.out.println("八进制："+c.toOctal());
        System.out.println("十六进制："+c.toHexadecimal());
    }
}
