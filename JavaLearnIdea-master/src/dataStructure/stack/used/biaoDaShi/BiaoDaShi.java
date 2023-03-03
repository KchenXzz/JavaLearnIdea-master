package dataStructure.stack.used.biaoDaShi;

import java.util.Stack;

/**
 * @projectName: JavaLearnIdea
 * @package: dataStructure.stack.used.biaoDaShi
 * @className: BiaoDaShi
 * @author: Kchenx
 * @description: 表达式求值
 * @date: 2022/12/27 10:08
 * @version: 1.0
 */
public class BiaoDaShi {
    /*
        表达式求值，四则运算求值
        例如 4+2*3-10/5=8
        表达式用#作为起止符
        使用算符优先法，要用到两个栈，运算符栈，操作数栈
        遍历表达式，如果是数就进数栈，符进符栈

         */
    /*使用栈完成表达式的计算 思路
         首先，创建两个栈，一个数字栈，一个符号栈。
         1. 通过一个 index  值（索引），来遍历我们的表达式
         2. 如果我们发现是一个数字, 就直接入数栈
         3. 如果发现扫描到是一个符号,  就分如下情况
          3.1 如果发现当前的符号栈为 空，就直接入栈
          3.2 如果符号栈有操作符，就进行比较,如果当前的操作符的优先级小于或者等于栈中的操作符， 就需要从数栈中pop出两个数,在从符号栈中pop出一个符号，进行运算，将得到结果，入数栈，然后将当前的操作符入符号栈，
          如果当前的操作符的优先级大于栈中的操作符， 就直接入符号栈.
         4. 当表达式扫描完毕，就顺序的从 数栈和符号栈中pop出相应的数和符号，并运行.
         5. 最后在数栈只有一个数字，就是表达式的结果

验证： 3+2*6-2 = 13
————————————————
     */

    public static void main(String[] args) {
        //字符串存表达式
        String bds = "4+2*3-10/5";
        //定义两个栈
        Stack<Integer> numStack = new Stack<Integer>();
        Stack<Character> operStack = new Stack<Character>();
        char ch = ' ';
        int res = 0;
        StringBuilder keepNum = new StringBuilder(); //用于拼接 多位数  为什么不能定义到下面的for循环里？


        for (int i=0;i < bds.length();i++) {
            //依次得到bds的每一个字符
            ch = bds.substring(i, i + 1).charAt(0);
            //判断ch是什么，然后做相应的处理
            //如果是运算符
            if (isOper(ch)) {
                //判断当前的符号栈是否为空
                //不为空
                if (!operStack.isEmpty()) {
                    //对符号优先级进行比较,如果当前的操作符的优先级小于或者等于栈中的操作符,
                    if (priority(ch) <= priority(operStack.peek())) {
                        //就需要从数栈中pop出两个数,再从符号栈中pop出一个符号，进行运算，
                        res = cal(numStack.pop(), numStack.pop(), operStack.pop());
                        //把运算的结果如数栈
                        numStack.push(res);
                        //然后将当前的操作符入符号栈
                        operStack.push(ch);
                    } else {
                        //如果当前的操作符的优先级大于栈中的操作符， 就直接入符号栈.
                        operStack.push(ch);
                    }
                } else {
                    //如果为符号栈空直接入符号栈
                    operStack.push(ch);
                }
            }//如果是数，则直接入数栈
            else {
                //1. 当处理多位数时，不能发现是一个数就立即入栈，因为它可能是多位数
                //2. 看当前位置的下一位置是不是数字，是数字就要再往后判断，如果是符号才入栈
                //3. 因此我们需要定义一个变量 字符串，用于拼接
                //处理多位数
                keepNum.append(ch);

                //如果ch已经是bds的最后一位，就直接入栈
                if (i == bds.length() - 1) {
                    numStack.push(Integer.parseInt(keepNum.toString()));
                }//不是最后一位
                else {
                    //判断下一个字符是不是数字，如果是数字，就继续扫描，如果是运算符，则入栈
                    if (isOper(bds.substring(i + 1, i + 2).charAt(0))) {
                        //如果后一位是运算符，则入栈 keepNum = "1" 或者 "123"
                        numStack.push(Integer.parseInt(keepNum.toString()));
                        //重要的!!!!!!, keepNum清空
                        keepNum = new StringBuilder();
                    }
                }
            }
        }


        //当表达式扫描完毕，就顺序的从 数栈和符号栈中pop出相应的数和符号，并运行.
        while (!operStack.isEmpty()) {
            //如果符号栈为空，则计算到最后的结果, 数栈中只有一个数字【结果】
            res = cal(numStack.pop(), numStack.pop(), operStack.pop());
            numStack.push(res);//入栈
        }


        //将数栈的最后数，pop出，就是结果
        int res2 = numStack.pop();
        System.out.printf("表达式 %s = %d", bds, res2);


    }


    //判断是否为运算符的方法
    public static boolean isOper(char val) {
        return val == '+' || val == '-' || val == '*' || val == '/';
    }

    //返回这个运算符的优先级，用int表示
    public static int priority(int oper) {
        if (oper == '*' || oper == '/') {
            return 1;
        } else if (oper == '+' || oper == '-') {
            return 0;
        } else {
            return -1; // 假定目前的表达式只有 +, - , * , /
        }
    }

    //计算的方法，两个数一个运算符，返回结果
    public static int cal(int num1, int num2, int oper) {
        int res = 0; // res 用于存放计算的结果
        switch (oper) {
            case '+' -> res = num1 + num2;
            case '-' -> res = num2 - num1;// 注意顺序
            case '*' -> res = num1 * num2;
            case '/' -> res = num2 / num1;
            default -> {
            }
        }
        return res;
    }
}