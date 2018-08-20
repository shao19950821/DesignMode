package command;

/**
 * @Author: qixiang.shao
 * @Description: 命令接口
 * @Date: Created in 23:31 2018/8/20
 * @Modified By:
 */
public interface ICommand {
    public void excute();

    public void undo();
}
