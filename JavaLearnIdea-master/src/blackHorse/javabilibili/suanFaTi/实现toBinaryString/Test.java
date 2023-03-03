package blackHorse.javabilibili.suanFaTi.实现toBinaryString;

/**
 * @projectName: JavaLearnIdea
 * @package: blackHorse.javabilibili.suanFaTi.实现toBinaryString
 * @className: Test
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-1-20 下午 9:12
 * @version: 1.0
 */
public class Test {
    /**
     * 实现十进制数字转  二进制的字符串表示
     */
    public static void main(String[] args) {
        int num = 4;
        StringBuilder str = new StringBuilder();
        while (!(num == 0)) {
            switch (num % 2) {
                case 0 -> str.append('0');
                case 1 -> str.append('1');
            }
            num = num / 2;
        }
        //反转
        str.reverse();
        System.out.println(str);
    }
}
