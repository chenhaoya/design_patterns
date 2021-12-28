/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/12/27 23:20
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Decorator_Pattern.Practice5;

import Structural_Pattern.Decorator_Pattern.Practice5.Component.Beverage;
import Structural_Pattern.Decorator_Pattern.Practice5.ConcreteComponent.House_Blend;
import Structural_Pattern.Decorator_Pattern.Practice5.ConcreteDecorator.Milk;
import Structural_Pattern.Decorator_Pattern.Practice5.ConcreteDecorator.Whip;

public class Client {
    public static void main(String[] args) {
        Beverage bbb;
        bbb = new House_Blend();
        bbb = new Milk(bbb);
        bbb = new Whip(bbb);
        System.out.println(bbb.getDescription()+ "\n" + bbb.getCost());
    }
}