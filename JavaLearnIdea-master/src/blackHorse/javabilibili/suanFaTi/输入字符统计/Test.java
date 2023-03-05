package blackHorse.javabilibili.suanFaTi.输入字符统计;

import java.util.HashMap;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/3/5 16:06
 */
public class Test {
    /**
     * 统计字符产中每个字符出现的次数
     * 字符串 aababcabcdabcde
     * 并按照一下格式输出
     * a(5) b(4) c(3) d(2) e(1)
     */
    public static void main(String[] args) {


        String s="aababcabcdabcde";

        HashMap<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < s.length() ;i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else {
                map.put(s.charAt(i),1);
            }

        }


        map.forEach((ch,count)-> System.out.print(ch+"("+count+") "));















    }
}
