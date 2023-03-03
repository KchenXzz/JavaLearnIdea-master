package blackHorse.javabilibili.games.yaoshaizi;

import java.util.Random;

public class ShaiZi {
    // 骰子的属性，点数。可以摇，可以猜点数
    //随机数
    Random random=new Random();
    //储存当前摇出来的点数
    private int dian;
    //构造方法，构造一个点数随机的骰子对象
    public ShaiZi(){
        //点数是1~6的随机数
        dian = random.nextInt(6) + 1;
    }
    //摇骰子方法，更新骰子的点数
    public int yaoShaizi(){
        return dian=random.nextInt(6)+1;
    }
    //得到当前骰子的点数
    public int  getDianshu() {
        return this.dian;
    }

}
