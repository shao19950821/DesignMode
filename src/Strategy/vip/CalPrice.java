package Strategy.vip;

import java.util.Arrays;

/**
 * @Author: qixiang.shao
 * @Description: 抽象策略类
 * @Date: Created in 14:05 2018/6/10
 * @Modified By:
 */
    public interface CalPrice {

        //根据原价返回一个最终的价格
        Double calPrice(Double orgnicPrice);


    }
