package blackHorse.javabilibili.suanFaTi.爬楼梯;

/**
 * @projectName: JavaLearnIdea
 * @package: blackHorse.javabilibili.suanFaTi.爬楼梯
 * @className: Test
 * @author: Kchenx
 * @description: TODO
 * @date: 2023-2-1 上午 9:27
 * @version: 1.0
 */
public class Test {
    /**
     * 小明爬楼梯
     * 有时候一次上一个台阶
     * 有时候一次上两个台阶
     * 如果一共有20个台阶
     * 问
     * 一共有多少种爬法
     * 层数  1   2   3   4   5   6
     * 爬法  1   2   3   5   8   13
     * 也是用递归
     */
    public static void main(String[] args) {

        System.out.println(paLouTi(20));
    }
    private static int paLouTi(int layer){
        if(layer==1){
            return 1;
        }
        if(layer==2){
            return 2;
        }
        return paLouTi(layer-1)+paLouTi(layer-2);
    }





}
