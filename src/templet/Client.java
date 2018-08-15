package templet;

import java.util.Scanner;

/**
 * @Author: qixiang.shao
 * @Description: 测试类
 * @Date: Created in 12:17 2018/7/19
 * @Modified By:
 */
public class Client {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入平台右上角坐标");

        int maxX = sc.nextInt();

        int maxY = sc.nextInt();

        PlatForm platForm = new PlatForm(maxX, maxY);

        System.out.println("初始化探索平台完成,信息是:");

        System.out.println(platForm.toString());

        ConcreteRangeRover concreteRangeRover = new ConcreteRangeRover(); // 将new函数拿出，避免循环创建多次对象

        while (true) {
            System.out.println("请输入漫步车初始坐标和初始方向");

            int rangeRoversX = sc.nextInt();

            int rangeRoversY = sc.nextInt();

            String rangeRoversPostion = sc.nextLine().trim();

            Position positon = Position.valueOf(rangeRoversPostion);

            concreteRangeRover.setX(rangeRoversX);

            concreteRangeRover.setY(rangeRoversY);

            concreteRangeRover.setPosition(positon);

            System.out.println("初始化漫步车");

            System.out.println("初始化漫步车完成,信息是:");

            System.out.println(concreteRangeRover.toString());

            System.out.println("请输入移动指令:");

            String moveCommand = sc.nextLine().trim();


            concreteRangeRover.rangeRoversMove(platForm, moveCommand);

            System.out.println("当前漫步车信息");

            System.out.println(concreteRangeRover.toString());
        }
    }

}
