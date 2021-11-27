/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/27 21:32
 * 开发名称：Abstract_Tie
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Observer_Pattern.Preactice5.Subject;

import Structural_Pattern.Observer_Pattern.Preactice5.Observer.Observer;

import java.util.ArrayList;

public abstract class Abstract_Tie {
    protected String tieName_;
    protected ArrayList<Observer> observerArrayList = new ArrayList<>();

    public String getName_() {
        return tieName_;
    }

    public void setName_(String name_) {
        this.tieName_ = name_;
    }

    public void attachObserver(Observer observer) {
        this.observerArrayList.add(observer);
        /**添加到系后自动跟新观察者信息*/
        observer.update(this.tieName_);
    }

    public void detachObserver(Observer observer) {
        this.observerArrayList.remove(observer);
    }

    public abstract void notify_();

    public abstract void display_();
}