package Proxy.StaticProxy;

/**
 * @Author: qixiang.shao
 * @Description:
 * @Date: Created in 23:15 2018/7/20
 * @Modified By:
 */
public class GamePlayer implements IGamePlayer {

    private String name = "";

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登录名为" + user + "的用户" + this.name + "登陆了");
    }

    @Override
    public void killBoss() {
        System.out.println("用户" + this.name + "在打怪");
    }

    @Override
    public void upgrade() {
        System.out.println("用户" + this.name + "升级了");
    }
}
