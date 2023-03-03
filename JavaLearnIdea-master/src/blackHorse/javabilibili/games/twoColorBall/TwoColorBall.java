package blackHorse.javabilibili.games.twoColorBall;

import java.util.Random;
import java.util.Scanner;

public class TwoColorBall {
    public static void main(String[] args) {
        /**
         * 双色球系统
         * 生一个随机号码
         * 六红 一篮
         * 用户输入
         * 判断是否中奖
         *
         */
        int[] number = creatNum();
        for (int num : number) {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] choose = inPut();
        for (int num : choose) {
            System.out.print(num + " ");
        }
        System.out.println();
        isWinning(choose, number);
    }

    //生成中奖号码
    public static int[] creatNum() {
        Random random = new Random();
        //中奖号码数组
        int[] num = new int[7];
        //生成6个红球
        //红球号码不能重复，生成随机的1~33放到num数组，放之前先判断这个值在数组里有没有重复
        //重复还要再生成一次
        //循环六次（六个红球）
        for (int i = 0; i < 6; ) {
            //随机号码
            int index = random.nextInt(33) + 1;
            //判断这个随机号码重复吗？
            if (!isHas(num, index)) {
                //不重复放到数组
                num[i] = index;
                //此时i才能++，如果重复还要循环，但是不++，这样就继续在i位置生成随机号码
                i++;
            }
        }
        //生成蓝球
        //蓝球只有一个，范围1~16，可以重复
        num[6] = random.nextInt(16) + 1;
        //返回这个数组
        return num;
    }

    //判断数组中有没有这个值
    public static boolean isHas(int[] arr, int index) {
        //遍历数组，如果有等于index的元素就是重复，返回TRUE
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == index) return true;
        }
        //循环完都没返回TRUE，那就是没重复，返回FALSE
        return false;
    }

    //用户输入
    public static int[] inPut() {
        //用户输入
        Scanner sc = new Scanner(System.in);
        //用户输入放到这个数组
        int[] choose = new int[7];
        System.out.println("依次输入号码");
        //红球的输入
        //循环依次接收,往数组的前六项里放入
        for (int i = 1; i < 7; ) {
            System.out.println("请输入第" + i + "个红球号码");
            int rednum = sc.nextInt();
            //判断输入是否合法
            //红球范围
            if (rednum >= 1 && rednum <= 33) {
                //在判断是否重复
                if (isHas(choose, rednum)) {
                    System.out.println("已经选择了这个号码，重新输入");
                } else {
                    //不重复录入，此时i++
                    choose[i - 1] = rednum;
                    i++;
                }
            } else {
                System.out.println("输入超出范围，重新输入");
            }
        }
        //蓝球输入
        //蓝球放到数组第七个位置
        //用循环，防止非法输入
        while (true) {
            System.out.println("请输入蓝球号码");
            int bluenum = sc.nextInt();
            //判断范围
            if (bluenum >= 1 && bluenum <= 16) {
                choose[6] = bluenum;
                //合法直接跳出循环
                break;
            } else {
                System.out.println("输入超出范围，重新输入");
            }
        }
        //返回这个输入的数组
        return choose;
    }

    //中奖判断
    //需要两个形参，一个是中奖号码，一个是用户选择的号码
    public static void isWinning(int[] choose, int[] winning) {
        //分别记录红球蓝球的正确个数
        int red = 0;
        int blue = 0;
        //计算红球正确个数
        //依次拿choose数组里的前六项，跟winning数组的前六项的值比较
        for (int i = 0; i < choose.length - 1; i++) {
            int index = choose[i];
            //跟winning数组的前六项的值比较
            for (int j = 0; j < winning.length - 1; j++) {
                //如果相等
                if (index == winning[j]) {
                    red++;//红球正确个数++
                }
            }
        }
        //计算蓝球的正确个数，蓝球只有一个，正确个数只是1或0
        if (choose[6] == winning[6]) {
            blue = 1;
        }

        //根据得到的正确个数判断中了几等奖

        if (red == 6) {
            if (blue == 1) {
                System.out.println("一等奖");
            } else System.out.println("二等奖");
        } else {
            if (red == 5) {
                if (blue == 1) System.out.println("三等奖");
            } else {
                if ((red + blue) == 5) {
                    System.out.println("四等奖");
                } else {
                    if ((red + blue == 4) || (red == 2 && blue == 1)) {
                        System.out.println("五等奖");
                    } else {
                        if (blue == 1) {
                            System.out.println("六等奖");
                        } else System.out.println("没中奖");
                    }
                }
            }
        }
    }

    //中奖判断
    public static int whichWinning(int[] choose, int[] winning) {
        //分别记录红球蓝球的正确个数
        int red = 0;
        int blue = 0;
        //计算红球正确个数
        //依次拿choose数组里的前六项，跟winning数组的前六项的值比较
        for (int i = 0; i < choose.length - 1; i++) {
            int index = choose[i];
            //跟winning数组的前六项的值比较
            for (int j = 0; j < winning.length - 1; j++) {
                //如果相等
                if (index == winning[j]) {
                    red++;//红球正确个数++
                }
            }
        }
        //计算蓝球的正确个数，蓝球只有一个，正确个数只是1或0
        if (choose[6] == winning[6]) {
            blue = 1;
        }

        //根据得到的正确个数判断中了几等奖

        if (red == 6) {
            if (blue == 1) {
                return 1;
            } else return 2;
        } else {
            if (red == 5) {
                if (blue == 1) return 3;
            } else {
                if ((red + blue) == 5) {
                    return 4;
                } else {
                    if ((red + blue == 4) || (red == 2 && blue == 1)) {
                        return 5;
                    } else {
                        if (blue == 1) {
                            return 6;
                        }
                    }
                }
            }
        }
        return 0;
    }
}