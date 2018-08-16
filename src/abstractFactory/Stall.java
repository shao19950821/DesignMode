package abstractFactory;

/**
 * @Author: qixiang.shao
 * @Description: 小摊
 * @Date: Created in 23:04 2018/8/16
 * @Modified By:
 */
public class Stall extends AbstractRestaurant {
    @Override
    protected AbstractChicken createChicken() {
        return new SpicyChicken();
    }

    @Override
    protected AbstactDrink createDrink() {
        return new Water();
    }
}
