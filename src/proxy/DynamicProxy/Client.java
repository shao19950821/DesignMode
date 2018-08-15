package proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author: qixiang.shao
 * @Description: 实现场景类
 * @Date: Created in 11:50 2018/7/22
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        ISeller fruitSeller = new FruitSeller("天天果园");

        // 定义一个handler
        InvocationHandler handler = new TaobaoProxy(fruitSeller);

        ISeller proxy = (ISeller) Proxy.newProxyInstance(fruitSeller.getClass().getClassLoader(), fruitSeller.getClass().getInterfaces(), handler);

        proxy.sell("西瓜");
    }

}
