package factory.example1;

/**
 * @Author: qixiang.shao
 * @Description: 黄色人种
 * @Date: Created in 21:33 2018/8/15
 * @Modified By:
 */
public class YellowHuman implements Human {
    @Override
    public void getSkinColor() {
        System.out.println("我是黄种人");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话");
    }
}
