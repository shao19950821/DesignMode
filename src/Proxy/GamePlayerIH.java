package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: qixiang.shao
 * @Description: 游戏代练
 * @Date: Created in 00:07 2018/7/20
 * @Modified By:
 */
public class GamePlayerIH implements InvocationHandler {

    Object object = null;


    public Object newProxy(Object targetObject) {
        this.object = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.object, args);
        return result;
    }
}
