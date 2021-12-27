/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/12/14 16:01
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Strategy_Pattern.例题;

import Behavioral_Patterns.Strategy_Pattern.例题.Context.MovieTicket;
import Behavioral_Patterns.Strategy_Pattern.例题.Strategy.Discount;

public class Client {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket();
        double originalPrice = 60;
        double currentPrice;

        movieTicket.setPrice(originalPrice);
        System.out.println("原始价格为："+originalPrice);
        System.out.println("-------------------------------");

        Discount discount = (Discount) XMLUtil.getBean();
        movieTicket.setDiscount(discount);

        currentPrice = movieTicket.getPrice();
        System.out.println("折扣后价格："+currentPrice);
    }
}