package abstractFactory;

/**
 * @Author: qixiang.shao
 * @Description:
 * @Date: Created in 22:56 2018/8/16
 * @Modified By:
 */
public class KFC extends AbstractRestaurant {
    @Override
    protected AbstractChicken createChicken() {
        return new TomatoChicken();
    }

    @Override
    protected AbstactDrink createDrink() {
        return new Cola();
    }
}
