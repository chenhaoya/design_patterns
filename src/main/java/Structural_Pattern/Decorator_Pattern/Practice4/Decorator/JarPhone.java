/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/25 8:42
 * 开发名称：JarPhone
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Decorator_Pattern.Practice4.Decorator;

import Structural_Pattern.Decorator_Pattern.Practice4.Component.Component;
import Structural_Pattern.Decorator_Pattern.Practice4.ConcreteDecorator.Component_Decorator;

public class JarPhone extends Component_Decorator {
    public JarPhone(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        this.setJarPhone();
    }

    public void setJarPhone(){
        System.out.println("添加了震动");
    }
}