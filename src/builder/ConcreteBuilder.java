package builder;

/**
 * @Author: qixiang.shao
 * @Description: 具体汽车实现类(组装人员)
 * @Date: Created in 22:17 2018/7/16
 * @Modified By:
 */
public class ConcreteBuilder extends ICarBuilder {

    private Car car = new Car();

    @Override
    public void buildWheel() {
        car.setWheel("米其林轮胎");
    }

    @Override
    public void buildSkeleton() {
        car.setSkeleton("流线型车声");
    }

    @Override
    public void buildEngine() {
        car.setEngine("涡轮发动机");
    }

    @Override
    public void buliderName() {
        car.setName("劳斯莱斯");
    }

    @Override
    public Car buildCar() {
        return this.car;
    }
}
