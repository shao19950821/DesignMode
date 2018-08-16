package abstractFactory;

/**
 * @Author: qixiang.shao
 * @Description: 白开水
 * @Date: Created in 22:54 2018/8/16
 * @Modified By:
 */
public class Water extends AbstactDrink {
    @Override
    protected void taste() {
        System.out.println("白开水没啥味道");
    }

    @Override
    protected void price() {
        System.out.println("白开水不要钱");
    }
}
