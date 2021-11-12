/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/12 13:46
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Chain_of_Responsibility_Pattern.Practice6;

import Structural_Pattern.Chain_of_Responsibility_Pattern.Practice6.ConcreteHandler.Director;
import Structural_Pattern.Chain_of_Responsibility_Pattern.Practice6.ConcreteHandler.General_manager;
import Structural_Pattern.Chain_of_Responsibility_Pattern.Practice6.ConcreteHandler.Manager;
import Structural_Pattern.Chain_of_Responsibility_Pattern.Practice6.Handler.Spice_approval;

public class Client {
    public static void main(String[] args) {
        Spice_approval spice_approval = new Director("主任");
        Spice_approval spice_approval2 = new Manager("经理");
        Spice_approval spice_approval3 = new General_manager("总经理");

        spice_approval.setSpice_approval(spice_approval2);
        spice_approval2.setSpice_approval(spice_approval3);

        spice_approval.processResponse(new Splendid("aaa",290));

    }
}