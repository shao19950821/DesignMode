package Singleton;

/**
 * @Author: qixiang.shao
 * @Description:  单例模式饿汉式
 * @Date: Created in 12:55 2018/6/30
 * @Modified By:
 */
public class Emperor {
    private static final Emperor emperor = new Emperor();
    private Emperor() {

    }
    public static Emperor getEmperor() {
        return emperor;
    }

    public void say() {
        System.out.println("我是皇帝秦始皇");
    }
}

