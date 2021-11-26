/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/15 15:13
 * 开发名称：Chessman
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：原发器
 */
package Structural_Pattern.Memento_Pattern.例题.Originaior;

import Structural_Pattern.Memento_Pattern.例题.Memento.ChessmanMemento;

public class Chessman {
    private String label;
    private int x;
    private int y;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Chessman(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    //保存状态
    public ChessmanMemento save() {
        return new ChessmanMemento(this.label, this.x, this.y);
    }


    //恢复状态
    public void restore(ChessmanMemento chessmanMemento) {
        this.label = chessmanMemento.getLabel();
        this.x = chessmanMemento.getX();
        this.y = chessmanMemento.getY();
    }

}