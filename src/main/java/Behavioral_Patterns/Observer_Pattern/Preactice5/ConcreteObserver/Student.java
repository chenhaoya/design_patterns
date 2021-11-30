/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/27 21:46
 * 开发名称：Student
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Observer_Pattern.Preactice5.ConcreteObserver;

import Behavioral_Patterns.Observer_Pattern.Preactice5.Observer.Observer;

public class Student implements Observer {
    private String name_;
    private String tieName_;
    private String position;

    public Student(String name_, String position) {
        this.name_ = name_;
        this.position = position;
    }

    @Override
    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public String getTieName_() {
        return this.tieName_;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void update(String TieName_) {
        this.tieName_ = TieName_;
    }
}