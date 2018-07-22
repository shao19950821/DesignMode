package Strategy.opretator;

/**
 * @Author: qixiang.shao
 * @Description:
 * @Date: Created in 21:30 2018/6/14
 * @Modified By:
 */
public class Main {
    public static void main(String[] args) {
        OpretatorTest plusTest = new OpretatorTest(new PlusOpretator());
        OpretatorTest minusTest = new OpretatorTest(new MinusOpretator());
        System.out.println(plusTest.opretator(2d, 3d));
        System.out.println(minusTest.opretator(3d,2d));
    }
}
