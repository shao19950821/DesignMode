package factory.example1;

/**
 * @Author: qixiang.shao
 * @Description: 具体人类工厂
 * @Date: Created in 21:47 2018/8/15
 * @Modified By:
 */
public class ConcreteHumanFactory extends AbstractHumanFactory {

    /**
     * 此处<T extends Human> 声明了一个反省方法，表示实现了Human 类的接口的类都可以作为参数
     * @param c
     * @param <T>
     * @return
     */
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return (T)human;
    }
}
