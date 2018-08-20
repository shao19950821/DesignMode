package command;

/**
 * @Author: qixiang.shao
 * @Description:
 * @Date: Created in 23:39 2018/8/20
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.setCommand(new TvCommand(new Tv()));
        invoker.setCommand(new LightCommand(new Light()));
        invoker.invoke();
        invoker.rollback();
    }
}
