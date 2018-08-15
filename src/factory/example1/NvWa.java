package factory.example1;

/**
 * @Author: qixiang.shao
 * @Description: 女娲类
 * @Date: Created in 21:57 2018/8/15
 * @Modified By:
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory abstractHumanFactory = new ConcreteHumanFactory();
        System.out.println("先造白种人");
        WhiteHuman whiteHuman = abstractHumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getSkinColor();
        whiteHuman.talk();
        System.out.println("再造黑种人");
        BlackHuman blackHuman = abstractHumanFactory.createHuman(BlackHuman.class);
        blackHuman.getSkinColor();
        blackHuman.talk();
        System.out.println("先造白种人");
        YellowHuman yellowHuman = abstractHumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getSkinColor();
        yellowHuman.talk();
    }
}
