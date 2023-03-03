package blackHorse.javabilibili.games.textGame;

import java.util.Random;

public class GameRole {
    //角色的定义类
    //角色的属性
    //名字
    private String name;
    //血量
    private int blood;
    //构造方法
    public GameRole(String name) {
        this.name = name;
        this.blood=100;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

        public int getBlood() {
            return blood;
        }
    public void attack(GameRole role){
        //定义攻击一次掉的血量,随机数
        Random random=new Random();
        //20一定在 random.nextInt(20) 这里
        int hurt= random.nextInt(20)+1;
        //当前血量
        int curblood= role.getBlood()-hurt;
        //血量只能是非负数，负值了修正成零
        //curblood=curblood<0?0:curblood;
        curblood= Math.max(curblood, 0);
        role.setBlood(curblood);
        System.out.println(this.getName()+"攻击了"+role.getName()+"一下，造成了"+hurt+"点伤害，"+role.getName()+"的血量还剩"+role.getBlood());
    }

}
