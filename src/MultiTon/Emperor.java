package MultiTon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author: qixiang.shao
 * @Description: 多例模式-皇帝类
 * @Date: Created in 23:41 2018/7/3
 * @Modified By:
 */
public class Emperor {
    private static int maxEmperorNum = 2;

    private static int numOfEmperorNum = 0;

    private static List<Emperor> emperorList = new ArrayList<>();

    private static List<String> emperorNameList = new ArrayList<>();

    static {
        for (int i = 0; i < maxEmperorNum; i++) {
            emperorList.add(new Emperor("皇" + i + "帝"));
        }
    }

    private Emperor() {

    }

    private Emperor(String emperorName) {
        emperorNameList.add(emperorName);
    }

    // 随机取得一个皇帝
    public static Emperor getInstance() {
        Random random = new Random();
        int numOfEmperorNum = random.nextInt(maxEmperorNum);
        return emperorList.get(numOfEmperorNum);
    }

    public void say() {
        System.out.println(emperorNameList.get(numOfEmperorNum));
    }

}
