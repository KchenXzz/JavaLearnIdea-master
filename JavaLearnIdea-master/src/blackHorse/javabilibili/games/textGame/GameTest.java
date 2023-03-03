package blackHorse.javabilibili.games.textGame;

public class GameTest {
    public static void main(String[] args) {
        var role1=new GameRole("剑姬");
        var role2=new GameRole("诺手");
        while(true){
            role1.attack(role2);
            if(role2.getBlood()==0) {
                System.out.println(role1.getName()+"胜利");
                break;}
            role2.attack(role1);
            if (role1.getBlood()==0) {
                System.out.println(role2.getName()+"胜利");
                break;
            }
        }
    }
}
