/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/27 15:30
 * 开发名称：Originaior
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Memento_Pattern.Preactice5.Originaior;

import Behavioral_Patterns.Memento_Pattern.Preactice5.Memento.Memento;

public class Originaior {
    private int value_;

    public int getValue_() {
        return value_;
    }

    public void setValue_(int value_) {
        this.value_ = value_;
    }

    public Originaior(int value_) {
        this.value_ = value_;
    }

    public Memento createMemento(){
        return new Memento(this);
    }

    public void restoreMemento(Memento memento){
        this.value_=memento.getValue();
    }

    public void redoMemento(Memento memento) {
        this.value_=memento.getValue();
    }

    @Override
    public String toString() {
        return "Originaior{" +
                "value_=" + value_ +
                '}';
    }
}