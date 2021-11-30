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
package Behavioral_Patterns.Memento_Pattern.例题;

import Behavioral_Patterns.Memento_Pattern.例题.Caretaker.MenentoCaretaker;
import Behavioral_Patterns.Memento_Pattern.例题.Originaior.Chessman;

public class Client {
    public static void main(String[] args) {
        MenentoCaretaker menentoCaretaker = new MenentoCaretaker();
        Chessman chess = new Chessman("车", 1, 1);
        display(chess);
        menentoCaretaker.setMemento(chess.save());
        chess.setX(4);
        display(chess);
        menentoCaretaker.setMemento(chess.save());
        chess.setX(5);
        display(chess);
        System.out.println("*****悔棋*****");
        chess.restore(menentoCaretaker.getMemento());
        display(chess);

    }
    public static void display(Chessman chessman){
        System.out.println("棋子\""+chessman.getLabel()+"\"当前位置"+"第"+chessman.getX()+"行"+"第"+chessman.getY()+"列");
    }
}