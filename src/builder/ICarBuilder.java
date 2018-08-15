package builder;

/**
 * @Author: qixiang.shao
 * @Description: 抽象汽车建造方法
 * @Date: Created in 22:14 2018/7/16
 * @Modified By:
 */
public abstract class ICarBuilder {

    public abstract void buildWheel();

    public abstract void buildSkeleton();

    public abstract void buildEngine();

    public abstract void buliderName();

    public abstract Car buildCar();
}
