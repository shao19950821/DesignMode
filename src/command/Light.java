package command;

/**
 * @Author: qixiang.shao
 * @Description: 电灯
 * @Date: Created in 23:36 2018/8/20
 * @Modified By:
 */
public class Light extends AbstractHouseApplication{
    @Override
    protected void on() {
        System.out.println("Light on");
    }

    @Override
    protected void off() {
        System.out.println("Light off");
    }
}
