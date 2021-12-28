/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/12/27 23:31
 * 开发名称：Mocha
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Decorator_Pattern.Practice5.ConcreteDecorator;

import Structural_Pattern.Decorator_Pattern.Practice5.Component.Beverage;
import Structural_Pattern.Decorator_Pattern.Practice5.Decorator.Decorator;

public class Mocha extends Decorator {
    public Mocha(Beverage beverage) {
        super(beverage);
        this.name_ = "摩卡";
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+"\n"+this.name_;
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 10;
    }
}