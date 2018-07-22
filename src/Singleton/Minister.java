package Singleton;

/**
 * @Author: qixiang.shao
 * @Description:
 * @Date: Created in 12:57 2018/6/30
 * @Modified By:
 */
public class Minister {
    public static void main(String[] args) {
        for(int day = 0; day < 3; day++) {
            Emperor emperor = Emperor.getEmperor();
            emperor.say();
        }
    }
}
