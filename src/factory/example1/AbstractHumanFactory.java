package factory.example1;

/**
 * @Author: qixiang.shao
 * @Description: 抽象人类工厂方法
 * @Date: Created in 21:45 2018/8/15
 * @Modified By:
 */
public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> c);
}
