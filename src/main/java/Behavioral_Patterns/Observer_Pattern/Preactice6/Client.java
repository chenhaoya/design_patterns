/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/28 14:53
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Observer_Pattern.Preactice6;

import Behavioral_Patterns.Observer_Pattern.Preactice6.ConcreteObserver.Player;
import Behavioral_Patterns.Observer_Pattern.Preactice6.ConcreteSubject.ConcreteStock;
import Behavioral_Patterns.Observer_Pattern.Preactice6.Observer.Observer;

public class Client {
    public static void main(String[] args) {
        ConcreteStock concreteStock = new ConcreteStock("牛马1号", 60);

        Observer player1, player2, player3;
        player1 = new Player("韭菜一号");
        player2 = new Player("韭菜二号");
        player3 = new Player("韭菜三号");

        concreteStock.join(player1);
        concreteStock.join(player2);
        concreteStock.setPriceNow(61);

        concreteStock.join(player3);

        concreteStock.setPriceNow(94);

        System.out.println("*********************");
        concreteStock.setPriceNow(57);
    }
}