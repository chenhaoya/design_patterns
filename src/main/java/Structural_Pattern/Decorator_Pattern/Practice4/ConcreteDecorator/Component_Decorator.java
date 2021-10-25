/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/25 8:42
 * 开发名称：Component_Decorator
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Decorator_Pattern.Practice4.ConcreteDecorator;

import Structural_Pattern.Decorator_Pattern.Practice4.Component.Component;

public class Component_Decorator implements Component {
    private Component component;

    public Component_Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}