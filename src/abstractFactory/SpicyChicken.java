package abstractFactory;

/**
 * @Author: qixiang.shao
 * @Description: 香辣味炸鸡
 * @Date: Created in 22:49 2018/8/16
 * @Modified By:
 */
public class SpicyChicken extends AbstractChicken {
    @Override
    protected void taste() {
        System.out.println("香辣味炸鸡");
    }

    @Override
    protected void price() {
        System.out.println("香辣味炸鸡，一块15元");
    }
}
