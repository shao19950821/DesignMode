package Proxy.DynamicProxy;

/**
 * @Author: qixiang.shao
 * @Description: 水果售卖商
 * @Date: Created in 11:45 2018/7/22
 * @Modified By:
 */
public class FruitSeller implements ISeller  {

    String sellerName;

    public FruitSeller(String sellerName) {
        this.sellerName = sellerName;
    }

    @Override
    public void sell(String goods) {
        System.out.println(this.sellerName+"卖"+goods);
    }
}
