/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/27 15:28
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Memento_Pattern.Preactice5;

import Behavioral_Patterns.Memento_Pattern.Preactice5.Caretaker.Caretaker;
import Behavioral_Patterns.Memento_Pattern.Preactice5.Originaior.Originaior;

public class Client {
    public static void main(String[] args) {
        /**创建原发器*/
        Originaior originaior = new Originaior(3);
        System.out.println(originaior.toString());
        /**创建负责人对象，保存创建的备忘录对象*/
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originaior.createMemento());

        originaior.setValue_(5);
        System.out.println(originaior.toString());

        /**撤销*/
        originaior.restoreMemento(caretaker.resultM(originaior.createMemento()));
        System.out.println(originaior.toString());

        /**恢复*/
        originaior.redoMemento(caretaker.redoM());
        System.out.println(originaior.toString());
    }
}