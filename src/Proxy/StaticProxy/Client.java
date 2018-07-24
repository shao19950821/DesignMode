package Proxy.StaticProxy;


/**
 * @Author: qixiang.shao
 * @Description: 测试类
 * @Date: Created in 23:21 2018/7/20
 * @Modified By:
 */
public class Client {


    public static void main(String[] args) {

        // 定义一个玩家

        IGamePlayer gamePlayer = new GamePlayer("初夏倾城");

        // 静态代理
        // 定义一个代理类
        IGamePlayer proxy = new GamePlayerProxy(gamePlayer);

        proxy.login("natsu", "123");

        proxy.killBoss();

        proxy.upgrade();


    }
}
