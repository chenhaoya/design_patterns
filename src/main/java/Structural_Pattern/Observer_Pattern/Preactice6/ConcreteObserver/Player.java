/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/28 15:24
 * 开发名称：Player
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Observer_Pattern.Preactice6.ConcreteObserver;

import Structural_Pattern.Observer_Pattern.Preactice6.Observer.Observer;

public class Player implements Observer {
    private String playerName;
    /**
     * 购买份数
     */
    private float shares;
    /**
     * 购买时价格
     */
    private float price_1;
    /**
     * 当前价格
     */
    private float price_2;

    @Override
    public float getPrice_1() {
        return price_1;
    }

    @Override
    public float getPrice_2() {
        return price_2;
    }

    @Override
    public String getName() {
        return this.playerName;
    }

    public Player(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public void setShares(float f) {
        this.shares = f;
    }

    @Override
    public void setPrice_1(float f) {
        this.price_1 = f;
    }

    @Override
    public void setPrice_2(float f) {
        this.price_2 = f;
    }

}