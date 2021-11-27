/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/27 15:32
 * 开发名称：Memento
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Memento_Pattern.Preactice5.Memento;

import Structural_Pattern.Memento_Pattern.Preactice5.Originaior.Originaior;

public class Memento {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Memento(Originaior originaior) {
        this.value = originaior.getValue_();
    }
}