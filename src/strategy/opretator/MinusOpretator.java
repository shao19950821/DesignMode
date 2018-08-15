package strategy.opretator;

/**
 * @Author: qixiang.shao
 * @Description:
 * @Date: Created in 21:23 2018/6/14
 * @Modified By:
 */
public class MinusOpretator implements Opretator {
    @Override
    public double opretator(double numberA, double numberB) {
        return numberA - numberB;
    }
}
