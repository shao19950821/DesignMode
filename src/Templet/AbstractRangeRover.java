package Templet;

/**
 * @Author: qixiang.shao
 * @Description: 漫游车
 * @Date: Created in 12:17 2018/7/19
 * @Modified By:
 */
public abstract class AbstractRangeRover {

    private int x; // 漫游车x坐标

    private int y; // 漫游车y坐标

    private Position position;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public AbstractRangeRover() {
    }

    public AbstractRangeRover(int x, int y, Position position) {
        this.x = x;
        this.y = y;
        this.position = position;
    }

    @Override
    public String toString() {
        return "RangeRovers{" +
                "x=" + x +
                ", y=" + y +
                ", position=" + position +
                '}';
    }

    /**
     * 漫步车移动模板方法(模板方法模式,具体的移动方法子类来实现,然后通过钩子方法绝对调用哪个方法)
     * @param platForm
     * @param command
     */
    public  void rangeRoversMove(PlatForm platForm, String command){
        char[] commandArray = command.toCharArray();
        for (int i = 0;i<commandArray.length;i++) {
            char commandChar = commandArray[i];
            if (this.isStepMove(String.valueOf(commandChar))) {
                this.stepMove(platForm,String.valueOf(commandChar));
            } else {
                this.postionChange(String.valueOf(commandChar));
            }
        }
    }

    /**
     * 小车方向改变方法
     * @param changePositonCommand
     */
    protected abstract void postionChange(String changePositonCommand);

    /**
     * 小车移动抽象方法
     * @param platForm
     * @param moveCommand
     */
    protected abstract void stepMove(PlatForm platForm, String moveCommand);

    /**
     * 钩子方法，默认M代表移动，其他代表改变方向，如果具体的构造车不同，可以重写钩子方法
     * @param command
     * @return
     */
    protected boolean isStepMove(String command) {
        if ("M".equalsIgnoreCase(command)) {
            return true;
        } else {
            return false;
        }
    }
}
