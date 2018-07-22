package Strategy.vip;

/**
 * @Author: qixiang.shao
 * @Description:
 * @Date: Created in 14:26 2018/6/10
 * @Modified By:
 */
public class Vip implements CalPrice {

    @Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice*0.9;
    }
}
