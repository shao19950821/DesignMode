package Strategy.opretator;

/**
 * @Author: qixiang.shao
 * @Description:
 * @Date: Created in 21:24 2018/6/14
 * @Modified By:
 */
public class OpretatorTest {
    private Opretator opretator;

    public OpretatorTest(Opretator opretator) {
        this.opretator = opretator;
    }

    public double opretator(double numberA, double numberB) {
        return this.opretator.opretator(numberA, numberB);
    }

}
