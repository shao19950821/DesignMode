package Proxy;

/**
 * @Author: qixiang.shao
 * @Description: 玩家接口

 * @Date: Created in 00:11 2018/7/20
 * @Modified By:
 */
public interface IGamePlayer {

    public void login(String user, String password);

    public void killBoss();

    public void upgrade();
}
