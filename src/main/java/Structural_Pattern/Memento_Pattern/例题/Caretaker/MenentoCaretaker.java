/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/15 15:13
 * 开发名称：MenentoCaretaker
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：负责人（管理者）
 */
package Structural_Pattern.Memento_Pattern.例题.Caretaker;

import Structural_Pattern.Memento_Pattern.例题.Memento.ChessmanMemento;

public class MenentoCaretaker {
    private ChessmanMemento memento;

    public ChessmanMemento getMemento() {
        return memento;
    }

    public void setMemento(ChessmanMemento memento) {
        this.memento = memento;
    }
}