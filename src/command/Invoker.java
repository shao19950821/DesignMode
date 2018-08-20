package command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: qixiang.shao
 * @Description: 遥控器
 * @Date: Created in 23:38 2018/8/20
 * @Modified By:
 */
public class Invoker {

    private List<ICommand> commandList;

    public Invoker() {
        commandList = new ArrayList<>();
    }

    public void setCommand(ICommand command) {
        commandList.add(command);
    }

    public void invoke() {
        commandList.forEach(command -> command.excute());
    }

    public void rollback() {
        commandList.forEach(command -> command.undo());
    }
}
