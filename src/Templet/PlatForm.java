package Templet;

/**
 * @Author: qixiang.shao
 * @Description: 平台
 * @Date: Created in 12:28 2018/7/19
 * @Modified By:
 */
public class PlatForm {

    private final int minX = 0; // 左下角横坐标

    private final int minY = 0; // 左下角纵坐标

    private int maxX; // 右上角横坐标

    private int maxY; // 右上角纵坐标

    public int getMinX() {
        return minX;
    }

    public int getMinY() {
        return minY;
    }

    public int getMaxX() {
        return maxX;
    }

    public void setMaxX(int maxX) {
        this.maxX = maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public void setMaxY(int maxY) {
        this.maxY = maxY;
    }

    public PlatForm(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
    }

    @Override
    public String toString() {
        return "PlatForm{" +
                "minX=" + minX +
                ", minY=" + minY +
                ", maxX=" + maxX +
                ", maxY=" + maxY +
                '}';
    }
}
