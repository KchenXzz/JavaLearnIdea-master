package blackHorse.javabilibili.suanFaTi.验证码;

import java.util.Random;

public class YanZhengMa {
    /**
     * 验证码类
     * 验证码组成，前四位随机的大小写字母和数字，最后一位随机数字
     * 前四位用随机数生成器生成ascll码，再把int强转成char
     * 0~9--->48~57
     * A~Z--->65~90
     * a~z--->97~122
     * 构造方法声明一个验证码对象
     * 验证码是实时的，得到的每个都不一样
     * get方法生成一个新验证码
     */

    //随机数，必不可少
    Random random = new Random();

    //构造方法，
    public YanZhengMa() {
    }

    //得到一个验证码，验证码是实时的，得到的每个都不一样
    public String getCode() {
        //chars数组存每次循环生成的验证码的一位字符，一位一位的存到char数组
        char[] chars = new char[5];
        //循环五次，对应验证码五位
        for (int i = 0; i < 5; i++) {
            //验证码组成，前四位随机的大小写字母和数字，最后一位随机数字
            //前四位
            if (i < 4) {
                //大小写字母和数字也就是三种情况，让随机数决定哪一种Switch
                switch (random.nextInt(3) + 1) {
                    //数字
                    case 1 -> {
                        //强转成char放到数组,数字0~9--对应ascll码-->48~57
                        chars[i] = (char) (random.nextInt(10) + 48);
                    }
                    //大写字母
                    case 2 -> {
                        chars[i] = (char) (random.nextInt(24) + 65);
                    }
                    //小写字母
                    case 3 -> {

                        chars[i] = (char) (random.nextInt(24) + 97);
                    }
                }
            }//第五位为随机数字
            else {
                chars[i] = (char) (random.nextInt(10) + 48);
            }
        }
        //将数组里的值转成字符串,返回得到的字符串
        //最下面的方法2
        /**static String
         * valueOf(char[] data)
         * Returns the string representation of the char array argument.
         *译:
         *返回 char数组参数的字符串表示形式。
         */
        return String.valueOf(chars);
    }
}
/**
 * char转换为String大致有6种方法
 * 1. String s = String.valueOf('c'); //效率最高的方法
 * <p>
 * 2. String s = String.valueOf(new char[]{'c'}); //将一个char数组转换成String
 * <p>
 * 3. String s = Character.toString('c');
 * // Character.toString(char)方法实际上直接返回String.valueOf(char)
 * <p>
 * 4. String s = new Character('c').toString();
 * <p>
 * 5. String s = "" + 'c';
 * // 虽然这个方法很简单，但这是效率最低的方法
 * // Java中的String Object的值实际上是不可变的，是一个final的变量。
 * // 所以我们每次对String做出任何改变，都是初始化了一个全新的String Object并将原来的变量指向了这个新String。
 * // 而Java对使用+运算符处理String相加进行了方法重载。
 * // 字符串直接相加连接实际上调用了如下方法：
 * // new StringBuilder().append("").append('c').toString();
 * <p>
 * <p>
 * 6. String s = new String(new char[]{'c'});
 * ————————————————
 */

