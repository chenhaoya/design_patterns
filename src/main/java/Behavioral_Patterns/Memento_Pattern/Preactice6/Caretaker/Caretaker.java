/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/27 20:10
 * 开发名称：Caretaker
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Memento_Pattern.Preactice6.Caretaker;

import Behavioral_Patterns.Memento_Pattern.Preactice6.Originaior.Originaior;

public class Caretaker {
    private Originaior.Memento memento;

    public Originaior.Memento getMemento() {
        return memento;
    }

    public void setMemento(Originaior.Memento memento) {
        this.memento = memento;
    }
}