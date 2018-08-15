package proxy.StaticProxy;

/**
 * @Author: qixiang.shao
 * @Description: 静态代理实现（代理类的好处可以实现预处理和善后处理）
 * @Date: Created in 23:19 2018/7/20
 * @Modified By:
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        if (gamePlayer.getClass() == GamePlayer.class) {
            this.gamePlayer = gamePlayer;
        }
    }

    @Override
    public void login(String user, String password) {
        this.doSomethingBefore();
        this.gamePlayer.login(user, password);
        this.doSomethingAfter();
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
        doSomethingAfter();
    }

    private void doSomethingBefore() {
        System.out.println("代练开始");
    }

    private void doSomethingAfter() {
        System.out.println("代练结束");
    }
}
