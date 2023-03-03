package dataStructure.stack.used.bracketsMatch;

import dataStructure.stack.linkStack.LinkStack;

/**
 * @projectName: JavaLearnIdea
 * @package: dataStructure.stack.used.bracketsMatch
 * @className: BracketsMatch
 * @author: Kchenx
 * @description: 括号匹配
 * @date: 2022/12/27 9:18
 * @version: 1.0
 */
public class BracketsMatch {
    /*
    栈应用，括号匹配
    (()[](())) 正确格式
    ((()[])    错误格式
     */
    public static void main(String[] args) {


        LinkStack chars = new LinkStack();
        //字符串存括号
        String string = "((()[])";
        //把这个字符串依次判断入栈，括号匹配的话，栈最后为空
        // ()分别为 40 41  []分别为 91 93 {}分别为 123 125
        for (int i = 0; i < string.length(); i++) {
            //从字符串里取元素
            char ch = string.charAt(i);
            //先判断是不是空栈，空栈就直接进栈
            if (chars.isEmpty()) {
                chars.push(ch);
            } else {
                //入栈判断,如果栈顶括号与将入栈的括号匹配，弹出栈顶括号
                //用ASCII码表判断
                if (ch - (char) chars.peek() == 1 || ch - (char) chars.peek() == 2) {
                    chars.pop();
                } else {
                    chars.push(ch);
                }
            }
        }
        //最后如果栈空就说明匹配
        if (chars.isEmpty()) {
            System.out.println("匹配");
        } else {
            System.out.println("不匹配");
        }

    }

}