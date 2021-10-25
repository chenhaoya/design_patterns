/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/25 8:43
 * 开发名称：Spinning_light
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Decorator_Pattern.Practice4.Decorator;

import Structural_Pattern.Decorator_Pattern.Practice4.Component.Component;
import Structural_Pattern.Decorator_Pattern.Practice4.ConcreteDecorator.Component_Decorator;

public class Spinning_light extends Component_Decorator {
    public Spinning_light(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        this.setSpinning_Light();
    }

    public void setSpinning_Light(){
        System.out.println("设置了来电灯光闪烁");
    }
}