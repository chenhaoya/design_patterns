/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：安东尼-爱德华-托尼-斯塔克
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/13 16:45
 * 开发名称：Passenger_Plane.java
 * 开发工具：IntelliJ IDEA
 * 当前用户：Chenhao
 * 说明：
 */
package Structural_Pattern.Bridge_Pattern.Practice5.RefinedAbstraction;

import Structural_Pattern.Bridge_Pattern.Practice5.Abstraction.AbstractPlane;

public class Passenger_Plane extends AbstractPlane {
    @Override
    public void type() {
        interfacePlane.fly();
        System.out.println("载货飞机");
    }
}
