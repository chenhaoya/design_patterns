/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/27 20:51
 * 开发名称：Player
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Observer_Pattern.例题.ConcreteObserver;

import Behavioral_Patterns.Observer_Pattern.例题.Observer.Observer;
import Behavioral_Patterns.Observer_Pattern.例题.Subject.AllyControlCenter;

/**
 * @author CH
 */
public class Player implements Observer {
    private String name_;

    public Player(String name_) {
        this.name_ = name_;
    }

    @Override
    public String getName() {
        return this.name_;
    }

    @Override
    public void setName(String name_) {
        this.name_=name_;
    }

    @Override
    public void help_() {
        System.out.println("坚持住"+this.name_+"来支援！");
    }

    @Override
    public void beAttacked(AllyControlCenter allyControlCenter) {
        System.out.println(this.name_+"被攻击");
        allyControlCenter.notifyObservers(this.name_);
    }
}