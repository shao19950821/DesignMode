package abstractFactory;

/**
 * @Author: qixiang.shao
 * @Description: 抽象工厂(饭店)
 * @Date: Created in 22:52 2018/8/16
 * @Modified By:
 */
public abstract class AbstractRestaurant {

    /**
     * 生产炸鸡
     * @return
     */
    protected abstract AbstractChicken createChicken();

    /**
     * 生产饮料
     * @return
     */
    protected abstract AbstactDrink createDrink();
}
