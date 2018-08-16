package abstractFactory;

/**
 * @Author: qixiang.shao
 * @Description: 测试客户端
 * @Date: Created in 23:05 2018/8/16
 * @Modified By:
 */
public class Client {
    public static void main(String[] args) {
        AbstractRestaurant kfc = new KFC();
        AbstractRestaurant stall = new Stall();
        System.out.println("我去了KFC");
        kfc.createChicken().show();
        kfc.createDrink().show();
        System.out.println("我去了小摊");
        stall.createChicken().show();
        stall.createDrink().show();
    }
}
