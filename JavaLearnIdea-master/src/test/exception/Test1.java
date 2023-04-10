package test.exception;

/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/4/8 11:17
 */
public class Test1 {
    public static void main(String[] args) {


        int[] arr = new int[5];

        try {
            System.out.println(arr[11]);
            System.out.println(12/0);

        }catch (ArithmeticException e){
            System.out.println("算数");
        }catch (IndexOutOfBoundsException e){
            System.out.println("数组越界");
        }




    }

}
