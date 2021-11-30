/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/27 20:27
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Observer_Pattern.例题;

import Behavioral_Patterns.Observer_Pattern.例题.ConcreteObserver.Player;
import Behavioral_Patterns.Observer_Pattern.例题.ConcreteSubject.ConcreteAllyControlCenter;
import Behavioral_Patterns.Observer_Pattern.例题.Subject.AllyControlCenter;

public class Client {
    public static void main(String[] args) {
        AllyControlCenter allyControlCenter = new ConcreteAllyControlCenter("金庸群侠");

        Player player1,player2,player3,player4;

        player1 = new Player("杨过");
        player2 = new Player("令狐冲");
        player3 = new Player("张无忌");
        player4 = new Player("段誉");

        allyControlCenter.join(player1);
        allyControlCenter.join(player2);
        allyControlCenter.join(player3);
        allyControlCenter.join(player4);

        player1.beAttacked(allyControlCenter);
    }
}