/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/12/27 23:27
 * 开发名称：Decorator
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Decorator_Pattern.Practice5.Decorator;

import Structural_Pattern.Decorator_Pattern.Practice5.Component.Beverage;

public class Decorator extends Beverage {
    protected String name_ = "装饰类";
    protected Beverage beverage;
    public Decorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.name_;
    }

    @Override
    public int getCost() {
        return 0;
    }
}