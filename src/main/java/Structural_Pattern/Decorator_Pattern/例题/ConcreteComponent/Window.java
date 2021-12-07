/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/12/6 16:11
 * 开发名称：Window
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Decorator_Pattern.例题.ConcreteComponent;

import Structural_Pattern.Decorator_Pattern.例题.Component.Component;

public class Window extends Component {
    @Override
    public void display() {
        System.out.println("显示窗体");
    }
}