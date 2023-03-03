package dataStructure.stack.used.labyrinth;

/**
 * @projectName: JavaLearnIdea
 * @package: dataStructure.stack.used.labyrinth
 * @className: Labyrinth
 * @author: Kchenx
 * @description: 迷宫求解
 * @date: 2022/12/29 15:04
 * @version: 1.0
 */
public class Labyrinth {
    /**
     * 栈实现迷宫求解
     * 主要是递归，
     * 二维数组构造地图，数组里的元素代表地图上的不同的点，如：通路，墙壁，
     * 递归方法：
     * 如果当前坐标到达终点就直接返回
     * 否则判断次坐标是否到达过，如果未到达则对此位置做标记（修改相应位置数组元素的值）来防止重走，否则就是未到达过，直接返回false退出本次循环
     * 做完标记后递归探索次坐标的上下左右坐标，如果可行就返回true
     * 未到达终点就继续递归，未到达，对此坐标的上下左右坐标递归
     * 如果四个方向都走不通，那就返回false并把当前坐标值设成3（死路）
     * 直到在if (map[8][8] == 2) {
     *             return true;
     *         }
     *         结束递归
     */
    static int[][] map;

    public static void main(String[] args) {

        // 1 代表围墙，2代表走过，3代表该点不通，避免下次重复搜索
        map = new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 1, 0, 0, 0, 1, 0, 1},
                {1, 0, 0, 1, 0, 0, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 1, 1, 0, 0, 1},
                {1, 0, 1, 1, 1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
                {1, 0, 1, 0, 0, 0, 1, 0, 0, 1},
                {1, 0, 1, 1, 1, 0, 1, 1, 0, 1},
                {1, 1, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };
        // 起点 （1,1）终点（8,8），可以灵活设置
        fandRecursion(3, 3);
        printMap();
    }

    // 递归方法
    public static boolean fandRecursion(int i, int j) {
        // 递归结束条件，代表已到达终点（8,8）
        if (map[8][8] == 2) {
            return true;
        }
        // 判断4个方向是否可行，一个方向可行就往深度递归，否则:回溯
        if (map[i][j] == 0) {  // 如果该点未访问过，则从该点探索
            map[i][j] = 2;
            printMap();
            if (fandRecursion(i + 1, j)) {  // 如果下方可行，则继续探索
                return true;
            } else if (fandRecursion(i, j + 1)) {  // 右方
                return true;
            } else if(fandRecursion(i - 1, j)) {  // 上方
                return true;
            } else if (fandRecursion(i, j - 1)) {  // 左方
                return true;
            } else {  // 如果四个方向 都不行说明该递归分支，不行，回溯
                // 该点走不通，标记 3，避免重复访问
                map[i][j] = 3;
                return false;
            }
        } else {
            return false;
        }

    }


    // 输出迷宫图，显示路线
    public static void printMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
