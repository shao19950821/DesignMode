package strategy.vip;

/**
 * @Author: qixiang.shao
 * @Description:
 * @Date: Created in 14:28 2018/6/10
 * @Modified By:
 */
public class Orgnic implements CalPrice {
    @Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice;
    }
}
