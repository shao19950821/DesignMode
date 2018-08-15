package factory.example1;

/**
 * @Author: qixiang.shao
 * @Description: 简单人类工厂
 * @Date: Created in 22:04 2018/8/15
 * @Modified By:
 */
public class SimpleHumanFactory {

    public static <T extends Human> T createHuman(Class<T> tClass) {
        Human human = null;
        try {
            human = (Human) Class.forName(tClass.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
