package Strategy.vip;

/**
 * @Author: qixiang.shao
 * @Description:
 * @Date: Created in 14:29 2018/6/10
 * @Modified By:
 */
public class Client {
    public static void main(String[] args) {
        Player player = new Player();
        player.buy(5000D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
        player.buy(12000D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
        player.buy(12000D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
        player.buy(12000D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
    }
}