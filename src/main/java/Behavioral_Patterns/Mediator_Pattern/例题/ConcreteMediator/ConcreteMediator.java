/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/24 20:07
 * 开发名称：ConcreteMediator
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Mediator_Pattern.例题.ConcreteMediator;

import Behavioral_Patterns.Mediator_Pattern.例题.Colleague.Component;
import Behavioral_Patterns.Mediator_Pattern.例题.ConcreteColleague.Button;
import Behavioral_Patterns.Mediator_Pattern.例题.ConcreteColleague.ComboBox;
import Behavioral_Patterns.Mediator_Pattern.例题.ConcreteColleague.List;
import Behavioral_Patterns.Mediator_Pattern.例题.ConcreteColleague.TextBox;
import Behavioral_Patterns.Mediator_Pattern.例题.Mediator.Mediator;


public class ConcreteMediator extends Mediator {
    //维持对各个同时对象的引用
    public Button addButton;
    public List list;
    public TextBox userNameTextBox;
    public ComboBox cb;

    @Override
    public void componentChanged(Component c) {
        //单击按钮
        if (c == addButton) {
            System.out.println("---单机增加按钮---");
            list.update();
            cb.update();
            userNameTextBox.update();
        } else if (c == list) {
            //从列表框选择客户
            System.out.println("---从列表框选择客户---");
            cb.select();
            userNameTextBox.setText();
        } else if (c == cb) {
            //从组合框选择客户
            System.out.println("---从组合框选择客户---");
            cb.select();
            userNameTextBox.setText();
        }
    }
}