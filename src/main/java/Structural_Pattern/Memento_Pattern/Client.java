/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/15 15:11
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Memento_Pattern;

import Structural_Pattern.Memento_Pattern.Caretaker.MenentoCaretaker;
import Structural_Pattern.Memento_Pattern.Originaior.Chessman;

public class Client {
    public static void main(String[] args) {
        MenentoCaretaker menentoCaretaker = new MenentoCaretaker();
        Chessman chess = new Chessman("车", 1, 1);
        menentoCaretaker.setMemento(chess.save());
        chess.setX(4);



    }
    public static void display(Chessman chessman){

    }
}