/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：安东尼-爱德华-托尼-斯塔克
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/13 16:42
 * 开发名称：AbstractPlane.java
 * 开发工具：IntelliJ IDEA
 * 当前用户：Chenhao
 * 说明：
 */
package Structural_Pattern.Bridge_Pattern.Practice5.Abstraction;

import Structural_Pattern.Bridge_Pattern.Practice5.Implementer.InterfacePlane;

public abstract class AbstractPlane {
    protected InterfacePlane interfacePlane;

    public void setInterfacePlane(InterfacePlane i) {
        this.interfacePlane = i;
    }

    public AbstractPlane() {
    }

    public AbstractPlane(InterfacePlane interfacePlane) {
        this.interfacePlane = interfacePlane;
    }

    public abstract void type();
}
