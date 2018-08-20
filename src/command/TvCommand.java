package command;

/**
 * @Author: qixiang.shao
 * @Description: 电视机命令
 * @Date: Created in 23:32 2018/8/20
 * @Modified By:
 */
public class TvCommand implements ICommand{

    private Tv tv;

    public TvCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void excute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
