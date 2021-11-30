/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/25 19:28
 * 开发名称：ConcreteWindow
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Mediator_Pattern.Practice5.ConcreteMediator;

import Behavioral_Patterns.Mediator_Pattern.Practice5.Colleague.Pane;
import Behavioral_Patterns.Mediator_Pattern.Practice5.Mediator.Window;

public class ConcreteWindow extends Window {
    @Override
    public void create_component(Pane pane) {
        pane.create();
    }
}