package abstractFactory;

/**
 * @Author: qixiang.shao
 * @Description: 番茄味炸鸡
 * @Date: Created in 22:48 2018/8/16
 * @Modified By:
 */
public class TomatoChicken extends AbstractChicken {
    @Override
    protected void taste() {
        System.out.println("番茄味炸鸡");
    }

    @Override
    protected void price() {
        System.out.println("番茄味炸鸡，一块10元");
    }
}
