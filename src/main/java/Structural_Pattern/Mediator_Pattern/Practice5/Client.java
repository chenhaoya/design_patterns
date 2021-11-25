/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/25 19:25
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Mediator_Pattern.Practice5;

import Structural_Pattern.Mediator_Pattern.Practice5.Colleague.Pane;
import Structural_Pattern.Mediator_Pattern.Practice5.ConcreteColleague.GraphicPane;
import Structural_Pattern.Mediator_Pattern.Practice5.ConcreteColleague.ListPane;
import Structural_Pattern.Mediator_Pattern.Practice5.ConcreteColleague.TextPane;
import Structural_Pattern.Mediator_Pattern.Practice5.ConcreteMediator.ConcreteWindow;

import java.util.Hashtable;

public class Client  {
    public static void main(String[] args) {
        ConcreteWindow concreteWindow = new ConcreteWindow();

        GraphicPane graphicPane = new GraphicPane("图片窗格1");
        ListPane listPane = new ListPane("列表窗格1");
        TextPane textPane = new TextPane("文本窗格1");

        graphicPane.setWindow(concreteWindow);
        listPane.setWindow(concreteWindow);
        textPane.setWindow(concreteWindow);

        graphicPane.transfer();
        listPane.transfer();
        textPane.transfer();

    }
}