package Builder;

/**
 * @Author: qixiang.shao
 * @Description:
 * @Date: Created in 22:21 2018/7/16
 * @Modified By:
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println("我要去买车了");
        Director director = new Director();
        System.out.println("老板来一辆车");
        System.out.println("找到组装工厂");
        ICarBuilder carBuilder = new ConcreteBuilder();
        Car myCar  = director.Construct(carBuilder);
        System.out.println("车组装好了：");
        System.out.println("看看我的新车吧：");
        myCar.showCar();
    }
}
