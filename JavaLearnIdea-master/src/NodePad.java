/**
 * //TODO
 *
 * @author kcx
 * @version v1.0.0
 * @description //TODO
 * @createTime 2023/3/15 19:28
 */
public class NodePad {
    public static void main(String[] args) {

    }
    public static int  getSum(int ...a ){
        int sum=0;
        for (int j : a) {
            sum = sum + j;
        }
        return sum;

    }
    public static int  getSum2(int a1, int ...a ){
        int sum=0;
        for (int j : a) {
            sum = sum + j;
        }
        return sum;

    }
}
