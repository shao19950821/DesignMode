package builder;

/**
 * @Author: qixiang.shao
 * @Description: 指派者(直接和用户沟通)
 * @Date: Created in 22:20 2018/7/16
 * @Modified By:
 */
public class Director {
    public Car Construct(ICarBuilder iCarBuilder) {
        iCarBuilder.buildWheel();
        iCarBuilder.buildSkeleton();
        iCarBuilder.buildEngine();
        iCarBuilder.buliderName();
        return iCarBuilder.buildCar();
    }
}
