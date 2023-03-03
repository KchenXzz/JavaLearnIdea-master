package test.lambda;

import tool.arrays.MyTools;

import java.util.Arrays;

/**
 * @projectName: JavaLearnIdea
 * @package: test.lambda
 * @className: LambadTest1
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-1-31 上午 10:23
 * @version: 1.0
 */
public class LambadTest1 {
    public static void main(String[] args) {

        int[] arr =  MyTools.createIntArray(20);

        //将这个int数组转成Integer数组
        Integer[] iarr = Arrays.stream(arr).boxed().toArray(Integer[]::new);


//        Arrays.sort(iarr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });

//        Arrays.sort(iarr,(Integer o1,Integer o2)->{
//            return o2-o1;
//        });

        Arrays.sort(iarr,((o1, o2) -> o2-o1));




        System.out.println(Arrays.toString(iarr));

//        show(()->{
//            System.out.println("chi!");
//        });
//        //省略后
//        show(()->System.out.println("aa"));


    }
    public static void show(Eat e){
        e.eat();
    }

}
interface Eat{
    public abstract void eat();


}