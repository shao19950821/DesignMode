package command;

/**
 * @Author: qixiang.shao
 * @Description: 电视机
 * @Date: Created in 23:35 2018/8/20
 * @Modified By:
 */
public class Tv extends AbstractHouseApplication{

    @Override
    protected void on() {
        System.out.println("Tv open");
    }

    @Override
    protected void off() {
        System.out.println("Tv closed");
    }
}
