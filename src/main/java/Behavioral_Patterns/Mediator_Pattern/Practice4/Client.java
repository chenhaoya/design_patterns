/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/25 16:33
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Mediator_Pattern.Practice4;

import Behavioral_Patterns.Mediator_Pattern.Practice4.ConcreteColleague.America;
import Behavioral_Patterns.Mediator_Pattern.Practice4.ConcreteColleague.Britain;
import Behavioral_Patterns.Mediator_Pattern.Practice4.ConcreteColleague.China;
import Behavioral_Patterns.Mediator_Pattern.Practice4.ConcreteMediator.WHO;

public class Client {
    public static void main(String[] args) {
        WHO who =new WHO("WHO");

        America america = new America("美国");
        Britain britain =new Britain("英国");
        China china =new China("中国");

        who.addNation(america);
        who.addNation(britain);



        who.componentChanged(britain);
    }
}