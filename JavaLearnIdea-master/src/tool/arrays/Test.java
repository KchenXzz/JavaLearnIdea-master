package tool.arrays;

import java.util.Arrays;
import java.util.Objects;

/**
 * @projectName: JavaLearnIdea
 * @package: tool.arrays
 * @className: Test
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-2-4 上午 9:38
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {

        //testStrArr();

        int[] arr=MyTools.createIntArray(10);
        int[] arr1=MyTools.createSqIntArray(10);


        System.out.println(Arrays.toString(arr1));

        System.out.println(MyTools.isRepeat(arr1));




    }

    private static void testStrArr() {
        String[] strings = MyTools.creatStringArray(1000);

        for (String s : strings) {
            if (Objects.equals(s, "!")) {
                System.out.println("!");
            }
            if (Objects.equals(s, "z")) {
                System.out.println("z");
            }
        }
        System.out.println("结束");

//        System.out.println(Arrays.toString(strings));
//        Arrays.sort(strings);
//        System.out.println(Arrays.toString(strings));
    }


}
