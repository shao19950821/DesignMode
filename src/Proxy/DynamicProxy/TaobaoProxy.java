package Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: qixiang.shao
 * @Description: 淘宝代理销售
 * @Date: Created in 11:46 2018/7/22
 * @Modified By:
 */
public class TaobaoProxy implements InvocationHandler {

    private Object targetObject;

    public TaobaoProxy(Object targetObject) {
        this.targetObject = targetObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(targetObject, args);
        return result;
    }
}
