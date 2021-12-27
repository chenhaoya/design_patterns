/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/12/14 16:02
 * 开发名称：MovieTicket
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Strategy_Pattern.例题.Context;

import Behavioral_Patterns.Strategy_Pattern.例题.Strategy.Discount;

public class MovieTicket {
    private double price;
    /**
     * 维持一个对抽象折扣类的引用
     */
    private Discount discount;

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 注入一个折扣类对象
     */
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getPrice() {
        /*调用折扣类的折扣计算方法*/
        return discount.calculate(this.price);
    }
}