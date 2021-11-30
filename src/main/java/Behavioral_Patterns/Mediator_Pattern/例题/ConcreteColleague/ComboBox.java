/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/25 15:52
 * 开发名称：ComboBox
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Mediator_Pattern.例题.ConcreteColleague;

import Behavioral_Patterns.Mediator_Pattern.例题.Colleague.Component;

public class ComboBox extends Component {
    @Override
    public void update() {
        System.out.println("组合框增加一项：张无忌。");
    }
    public void select(){
        System.out.println("组合框选中项：小龙女。");
    }
}