/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/9 16:06
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Chain_of_Responsibility_Pattern.Practice4;

import Behavioral_Patterns.Chain_of_Responsibility_Pattern.Practice4.ConcreteHandler.BanZhang;
import Behavioral_Patterns.Chain_of_Responsibility_Pattern.Practice4.ConcreteHandler.Paizhang;
import Behavioral_Patterns.Chain_of_Responsibility_Pattern.Practice4.ConcreteHandler.Yingzhang;
import Behavioral_Patterns.Chain_of_Responsibility_Pattern.Practice4.Handler.Approver;

public class Client {
    public static void main(String[] args) {
        Approver banzhang, paizhang, yingzhang;
        banzhang = new BanZhang("班长");
        paizhang = new Paizhang("排长");
        yingzhang = new Yingzhang("营长");

        banzhang.setSuccessor(paizhang);
        paizhang.setSuccessor(yingzhang);

        War_Request war_request = new War_Request(20,"aaaa");

        banzhang.processResponse(war_request);
    }
}