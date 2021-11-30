/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/27 15:35
 * 开发名称：Caretaker
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Memento_Pattern.Preactice5.Caretaker;

import Behavioral_Patterns.Memento_Pattern.Preactice5.Memento.Memento;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> resultStack = new Stack<>();
    private Stack<Memento> redoStack = new Stack<>();

    public Memento resultM(Memento memento) {
        if (resultStack.isEmpty()) {
            return null;
        }
        Memento a = resultStack.pop();
        redoStack.add(memento);
        return a;
    }

    public Memento redoM(){
        if (redoStack.isEmpty()){
            return null;
        }
        return redoStack.pop();
    }

    public void setMemento(Memento memento) {
        this.resultStack.add(memento);
        this.redoStack.clear();
    }
}