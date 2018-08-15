package Templet;

/**
 * @Author: qixiang.shao
 * @Description: 具体漫步车
 * @Date: Created in 12:46 2018/7/19
 * @Modified By:
 */
public class ConcreteRangeRover extends AbstractRangeRover {

    public ConcreteRangeRover() {
        super();
    }

    public ConcreteRangeRover(int x, int y, Position position){
        super(x,y,position);
    }

    /**
     * 方向改变函数
     * @param changePositonCommand 方向改变命令
     */
    @Override
    protected void postionChange(String changePositonCommand) {
        if ("L".equalsIgnoreCase(changePositonCommand)) {
            switch (this.getPosition()) {
                case E:
                    this.setPosition(Position.N);
                    break;
                case N:
                    this.setPosition(Position.W);
                    break;
                case W:
                    this.setPosition(Position.S);
                    break;
                case S:
                    this.setPosition(Position.E);
                    break;
            }
        } else if ("R".equalsIgnoreCase(changePositonCommand)) {
            switch (this.getPosition()) {
                case E:
                    this.setPosition(Position.S);
                    break;
                case S:
                    this.setPosition(Position.W);
                    break;
                case W:
                    this.setPosition(Position.N);
                    break;
                case N:
                    this.setPosition(Position.E);
                    break;
            }
        }
    }

    /**
     * 漫步车移动方法
     * @param platForm
     * @param moveCommand(这个参数还是有必要的我觉得，因为以后可能对移动的命令有所扩展，既然是针对命令移动，
     * 我认为传入命令参数是有必要的，虽然现在的业务移动逻辑只有M一种，不保证需求变更后会不会增加)
     */
    @Override

    protected void stepMove(PlatForm platForm,String moveCommand) {
        switch (this.getPosition()) {
            case S:
                if (this.getY() > platForm.getMinY()) {
                    this.setY(this.getY()-1);
                }
                break;
            case N:
                if (this.getY() < platForm.getMaxY()) {
                    this.setY(this.getY()+1);
                }
                break;
            case W:
                if (this.getX() > platForm.getMinX()) {
                    this.setX(this.getX()-1);
                }
                break;
            case E:
                if (this.getX() < platForm.getMaxX()) {
                    this.setX(this.getX()+1);
                }
                break;
        }
    }
}
