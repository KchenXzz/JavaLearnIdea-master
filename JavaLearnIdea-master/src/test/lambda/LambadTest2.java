package test.lambda;

import java.util.Arrays;

/**
 * @projectName: JavaLearnIdea
 * @package: test.lambda
 * @className: LambadTest2
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-1-31 上午 11:09
 * @version: 1.0
 */
public class LambadTest2 {


    public static void main(String[] args) {


        String[] strings={"as","2444","cc3ff","def2fd","xx4dff","zgwe","o2fberaawer","3fdsf"};
        //默认按字典顺序排序
        Arrays.sort(strings);

        System.out.println(Arrays.toString(strings));

        //按长度排序
        Arrays.sort(strings,(o1,o2)-> o1.length()-o2.length());

        System.out.println(Arrays.toString(strings));





    }
}
