package factory.example1;

/**
 * @Author: qixiang.shao
 * @Description: 白色人种
 * @Date: Created in 21:32 2018/8/15
 * @Modified By:
 */
public class WhiteHuman implements Human {
    @Override
    public void getSkinColor() {
        System.out.println("我是白种人");
    }

    @Override
    public void talk() {
        System.out.println("白种人说话");
    }
}
