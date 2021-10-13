/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：安东尼-爱德华-托尼-斯塔克
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/13 16:56
 * 开发名称：Client.java
 * 开发工具：IntelliJ IDEA
 * 当前用户：Chenhao
 * 说明：
 */
package Structural_Pattern.Bridge_Pattern.Practice5;

import Structural_Pattern.Bridge_Pattern.Practice5.Abstraction.AbstractPlane;
import Structural_Pattern.Bridge_Pattern.Practice5.Implementer.InterfacePlane;
import Structural_Pattern.Bridge_Pattern.Practice5.RefinedAbstraction.Cargo_Plane;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("Structural_Pattern.Bridge_Pattern.Practice5.ConcreteImplementer.Airbus");
        InterfacePlane interfacePlane = (InterfacePlane) aClass.newInstance();

        Cargo_Plane cargo_plane = new Cargo_Plane();

        cargo_plane.setInterfacePlane(interfacePlane);

        cargo_plane.type();
    }
}
