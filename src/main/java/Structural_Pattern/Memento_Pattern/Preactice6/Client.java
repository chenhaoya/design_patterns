/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/27 20:03
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Memento_Pattern.Preactice6;

import Structural_Pattern.Memento_Pattern.Preactice6.Caretaker.Caretaker;
import Structural_Pattern.Memento_Pattern.Preactice6.Originaior.Originaior;

public class Client {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originaior originaior = new Originaior("aaa", 1);
        display(originaior);

        caretaker.setMemento(originaior.saveM());

        originaior.setPass_(5);
        display(originaior);

        originaior.restoreM(caretaker.getMemento());
        display(originaior);

    }

    public static void display(Originaior originaior) {
        System.out.println("角色名称：" + originaior.getName_() + "复活点：" + originaior.getPass_());
    }
}