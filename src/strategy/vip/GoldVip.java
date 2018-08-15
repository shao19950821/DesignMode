package strategy.vip;

/**
 * @Author: qixiang.shao
 * @Description:
 * @Date: Created in 14:27 2018/6/10
 * @Modified By:
 */
public class GoldVip implements CalPrice {

    @Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice*0.7;
    }
}
