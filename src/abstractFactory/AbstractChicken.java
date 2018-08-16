package abstractFactory;

/**
 * @Author: qixiang.shao
 * @Description: 抽象产品(炸鸡)
 * @Date: Created in 22:46 2018/8/16
 * @Modified By:
 */
public abstract class AbstractChicken{

    /**
     * 不同味道
     */
    protected abstract void taste();

    /**
     * 价格
     */
    protected abstract void price();

    public void show() {
        this.taste();
        this.price();
    }
}
