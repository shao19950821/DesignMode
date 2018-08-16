package abstractFactory;

/**
 * @Author: qixiang.shao
 * @Description: 可乐
 * @Date: Created in 22:54 2018/8/16
 * @Modified By:
 */
public class Cola extends AbstactDrink {
    @Override
    protected void taste() {
        System.out.println("肥宅快乐水");
    }

    @Override
    protected void price() {
        System.out.println("可乐只要5元");
    }
}
