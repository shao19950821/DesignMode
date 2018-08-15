package factory.example1;

/**
 * @Author: qixiang.shao
 * @Description: 简单工厂女娲
 * @Date: Created in 22:08 2018/8/15
 * @Modified By:
 */
public class SimpleNvWa {

    public static void main(String[] args) {
        System.out.println("先造白种人");
        WhiteHuman whiteHuman = SimpleHumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getSkinColor();
        whiteHuman.talk();
        System.out.println("再造黑种人");
        BlackHuman blackHuman = SimpleHumanFactory.createHuman(BlackHuman.class);
        blackHuman.getSkinColor();
        blackHuman.talk();
        System.out.println("先造白种人");
        YellowHuman yellowHuman = SimpleHumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getSkinColor();
        yellowHuman.talk();
    }
}
