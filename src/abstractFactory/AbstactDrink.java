package abstractFactory;

/**
 * @Author: qixiang.shao
 * @Description: 饮料抽象类
 * @Date: Created in 22:53 2018/8/16
 * @Modified By:
 */
public abstract class AbstactDrink {

    /**
     * 饮料的口味
     */
    protected abstract void taste();

    /**
     * 饮料的价格
     */
    protected abstract void price();

    public void show() {
        this.taste();
        this.price();
    }
}
