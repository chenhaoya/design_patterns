/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/25 15:54
 * 开发名称：TextBox
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Mediator_Pattern.例题.ConcreteColleague;

import Behavioral_Patterns.Mediator_Pattern.例题.Colleague.Component;

public class TextBox extends Component {
    @Override
    public void update() {
        System.out.println("客户信息增加成功后文本框清空");
    }
    public void setText(){
        System.out.println("文本框显示：小龙女");
    }
}