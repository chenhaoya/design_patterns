/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/26 16:12
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Flyweight_Pattern.Practice4;

import Structural_Pattern.Flyweight_Pattern.Practice4.Flyweight.Network_equipment;
import Structural_Pattern.Flyweight_Pattern.Practice4.Flyweight.Point;
import Structural_Pattern.Flyweight_Pattern.Practice4.FlyweightFactory.Factory;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Factory factory;
        Class<?> aClass = Class.forName("Structural_Pattern.Flyweight_Pattern.Practice4.FlyweightFactory.Factory");
        factory = (Factory) aClass.newInstance();
        Network_equipment network_equipment,network_equipment1;
        network_equipment = factory.getFlyweightList("Hub","Hub1");
        network_equipment.point(new Point("11111111"));
        System.out.println(network_equipment.getType());

        network_equipment1 = factory.getFlyweightList("Hub","Hub2");
        network_equipment1.point(new Point("22222222"));
        System.out.println(network_equipment1.getType());

        System.out.println(network_equipment==network_equipment1);


        Network_equipment ne,ne1;
        ne = factory.getFlyweightList("Switch","Switchaaa");
        ne.point(new Point("110"));
        System.out.printf("", ne.getType());

        ne1 = factory.getFlyweightList("Switch","Switchaaa");
        ne1.point(new Point("110"));
        System.out.printf("", ne1.getType());
        System.out.println(ne==ne1);
    }
}

