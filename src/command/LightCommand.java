package command;

/**
 * @Author: qixiang.shao
 * @Description: 电灯命令
 * @Date: Created in 23:33 2018/8/20
 * @Modified By:
 */
public class LightCommand implements ICommand{

    private Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
