package Strategy.opretator;

/**
 * @Author: qixiang.shao
 * @Description:
 * @Date: Created in 21:22 2018/6/14
 * @Modified By:
 */
public class PlusOpretator implements Opretator {

    @Override
    public double opretator(double numberA, double numberB) {
        return numberA + numberB;
    }
}
