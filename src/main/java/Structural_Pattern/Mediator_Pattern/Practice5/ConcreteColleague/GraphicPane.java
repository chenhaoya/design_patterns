/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/25 19:27
 * 开发名称：GraphicPane
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Mediator_Pattern.Practice5.ConcreteColleague;

import Structural_Pattern.Mediator_Pattern.Practice5.Colleague.Pane;
import Structural_Pattern.Mediator_Pattern.Practice5.Mediator.Window;

public class GraphicPane extends Pane {
    public GraphicPane(String name_) {
        super(name_);
    }

    public GraphicPane(Window window) {
        super(window);
    }

    @Override
    public void create() {
        System.out.println("GraphicPane被创建");
    }
}