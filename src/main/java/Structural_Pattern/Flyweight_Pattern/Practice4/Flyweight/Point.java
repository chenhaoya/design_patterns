/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/30 20:39
 * 开发名称：Point
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Flyweight_Pattern.Practice4.Flyweight;

public class Point {
    /*使用set？约束端口重复问题*/
    String point;

    public Point(String point) {
        this.point = point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getPoint() {
        return point;
    }
}