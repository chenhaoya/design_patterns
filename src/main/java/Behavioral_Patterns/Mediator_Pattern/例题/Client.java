/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/24 19:33
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Mediator_Pattern.例题;

import Behavioral_Patterns.Mediator_Pattern.例题.ConcreteColleague.Button;
import Behavioral_Patterns.Mediator_Pattern.例题.ConcreteColleague.ComboBox;
import Behavioral_Patterns.Mediator_Pattern.例题.ConcreteColleague.List;
import Behavioral_Patterns.Mediator_Pattern.例题.ConcreteColleague.TextBox;
import Behavioral_Patterns.Mediator_Pattern.例题.ConcreteMediator.ConcreteMediator;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        //定义同事对象
        Button button = new Button();
        ComboBox comboBox = new ComboBox();
        List list = new List();
        TextBox textBox = new TextBox();

        button.setMediator(mediator);
        list.setMediator(mediator);
        comboBox.setMediator(mediator);
        textBox.setMediator(mediator);

        mediator.addButton=button;
        mediator.list=list;
        mediator.cb=comboBox;
        mediator.userNameTextBox=textBox;

        button.changed();
        System.out.println("-------------------");
        list.changed();
    }
}