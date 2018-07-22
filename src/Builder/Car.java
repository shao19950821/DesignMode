package Builder;

/**
 * @Author: qixiang.shao
 * @Description: 跑车-产品类
 * @Date: Created in 22:16 2018/7/16
 * @Modified By:
 */
public class Car {

    private String name;

    private String wheel;

    private String skeleton;

    private String engine;

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getSkeleton() {
        return skeleton;
    }

    public void setSkeleton(String skeleton) {
        this.skeleton = skeleton;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showCar(){
        System.out.println("品牌是：" + name);
        System.out.println("轮胎是：" + wheel);
        System.out.println("车身是：" + skeleton);
        System.out.println("发动机是: " + engine);
    }

}
