/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/25 19:27
 * 开发名称：Window
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Mediator_Pattern.Practice5.Mediator;

import Structural_Pattern.Mediator_Pattern.Practice5.Colleague.Pane;

import java.util.Hashtable;


public abstract class Window {
    protected Hashtable<String,Pane> paneHashtable;

    public Window() {
        this.paneHashtable = new Hashtable<>();
    }

    public void addP(Pane pane){
        this.paneHashtable.put(pane.getName_(), pane);
    }

    public void delP(Pane pane) {
        this.paneHashtable.remove(pane.getName_());
    }

    public Pane getP(String pane) {
        return this.paneHashtable.get(pane);
    }

    public Hashtable getAll(){
        return this.paneHashtable;
    }

    public abstract void create_component(Pane pane);
}