package dataStructure.recursive;

/**
 * @projectName: JavaLearnIdea
 * @package: dataStructure.recursive
 * @className: Test1
 * @author: Kchenx
 * @description: 简单递归
 * @date: 2023-1-28 上午 10:13
 * @version: 1.0
 */
public class Test1 {

    public static void main(String[] args) {

        //System.out.println(getSum(1000));
        System.out.println(getFac(4));

    }

    private static int getFac(int num){
        if(num==1){
            return 1;
        }
        return num*getFac(num-1);

    }




    private static int getSum(int num){
        if(num==1){
            return 1;
        }
        return num+getSum(num-1);
    }
}
