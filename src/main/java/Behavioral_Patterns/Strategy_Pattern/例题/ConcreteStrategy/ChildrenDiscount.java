/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/12/14 16:08
 * 开发名称：ChildrenDiscount
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Strategy_Pattern.例题.ConcreteStrategy;

import Behavioral_Patterns.Strategy_Pattern.例题.Strategy.Discount;

public class ChildrenDiscount implements Discount {
    private final double DISCOUNT = 10;
    @Override
    public double calculate(double price) {
        System.out.println("儿童票");
        if (price >= 20) {
            return price-DISCOUNT;
        }else {
            return price;
        }
    }
}