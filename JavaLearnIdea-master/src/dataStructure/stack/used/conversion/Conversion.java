package dataStructure.stack.used.conversion;

import dataStructure.stack.linkStack.LinkStack;
/**
 * @projectName: JavaLearnIdea
 * @package: dataStructure.stack.used.conversion
 * @className: Conversion
 * @author: Kchenx
 * @description: 进制转换
 * @date: 2022/12/25 12:35
 * @version: 1.0 可以转换10进制为2，8，16进制,转换方法会返回会转换后的字符串表示
 */
public class Conversion {

    //* Binary表示二进制，简写为B。
    //* Octal表示八进制，简写为O。
    //* Decimal表示十进制，简写为D。
    //* Hexadecimal表示十六进制，简写为H。

    //要转换的值
    private int num;

    //构造方法应该接收一个待转换的十进制数
    public Conversion(int num) {
        this.num = num;
    }

    //转换为二进制
    public String toBinary() {
        return conver(this.num, 2);
    }

    //转换为八进制
    public String toOctal() {
        return conver(this.num, 8);
    }

    //转换十六进制
    public String toHexadecimal() {
        return conver(this.num, 16);
    }

    //转换的私有静态方法
    private static String conver(int toNum, int con) {
        //用栈来实现，构造个栈
        LinkStack lStack = new LinkStack();
        //字符序列，接收出栈的元素
        StringBuilder octal = new StringBuilder();
        while (toNum != 0) {
            //对指定进制取余后余数进展
            lStack.push(toNum % con);
            //求商，
            toNum = toNum / con;
        }
        while (!lStack.isEmpty()) {
            //转换完将得到的转换后的元素出栈添加到字符序列
            octal.append(lStack.pop());
            //最开始octor为int型,数值大了（比如1024转换二进制为100 0000 0000，超出int值）就会出bug
            //octal=octal*10+(int)lStack.peek();
        }
        lStack.clear();
        //返回这个字符序列的字符串形式
        return octal.toString();
    }
}
