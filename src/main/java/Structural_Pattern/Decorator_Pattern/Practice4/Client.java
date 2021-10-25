/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/25 8:49
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Decorator_Pattern.Practice4;

import Structural_Pattern.Decorator_Pattern.Practice4.Component.Component;
import Structural_Pattern.Decorator_Pattern.Practice4.ConcreteComponent.A_Phone;
import Structural_Pattern.Decorator_Pattern.Practice4.Decorator.JarPhone;
import Structural_Pattern.Decorator_Pattern.Practice4.Decorator.Spinning_light;

public class Client {
    public static void main(String[] args) {
        //高级手机
        Component component,component1,component2;
        component = new A_Phone();
        component1 = new JarPhone(component);
        component2 = new Spinning_light(component1);
        component2.display();
    }
}