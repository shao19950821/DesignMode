package factory.example1;

/**
 * @Author: qixiang.shao
 * @Description:
 * @Date: Created in 21:34 2018/8/15
 * @Modified By:
 */
public class BlackHuman implements Human {
    @Override
    public void getSkinColor() {
        System.out.println("我是黑种人");
    }

    @Override
    public void talk() {
        System.out.println("黑种人说话");
    }
}
