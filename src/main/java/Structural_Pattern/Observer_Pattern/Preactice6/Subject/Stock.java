/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/28 15:00
 * 开发名称：Stock
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Observer_Pattern.Preactice6.Subject;

import Structural_Pattern.Observer_Pattern.Preactice6.Observer.Observer;

import java.util.ArrayList;

public abstract class Stock {
    /**股票名称*/
    protected String name_;

    protected float priceNow;

    /**购买这支股票的韭菜*/
    protected ArrayList<Observer> arrayList = new ArrayList<>();

    public Stock(String name_, float priceNow) {
        this.name_ = name_;
        this.priceNow = priceNow;
    }

    public float getPriceNow() {
        return priceNow;
    }

    /**当股票价格跟新时判断是否需要通知购买的韭菜*/
    public void setPriceNow(float priceNow) {
        this.priceNow = priceNow;
        this.setPrice_Now(priceNow);
        this.notify_();
    }

    void setPrice_Now(float f) {
        for (Observer o :
                this.arrayList) {
            o.setPrice_2(f);
        }
    }

    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public void join(Observer observer) {
        System.out.println(observer.getName()+"购买了"+this.name_+"股票");
        observer.setPrice_1(this.priceNow);
        observer.setPrice_2(this.priceNow);
        this.arrayList.add(observer);
    }

    public void quitObs(Observer observer) {
        System.out.println(observer.getName()+"把"+this.name_+"全卖了");
        this.arrayList.remove(observer);
    }
    /**判断股票的当前价格与韭菜的购买价格的波动是否超过5% 超过则通知*/
    public abstract void notify_();
}