/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/25 19:26
 * 开发名称：Pane
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Mediator_Pattern.Practice5.Colleague;

import Behavioral_Patterns.Mediator_Pattern.Practice5.Mediator.Window;

public abstract class Pane {
    protected String name_;
    protected Window window;

    public void setWindow(Window window) {
        this.window = window;
    }

    public Pane(String name_) {
        this.name_ = name_;
    }

    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public Pane(Window window) {
        this.window = window;
    }

    public void transfer(){
        window.create_component(this);
    }

    public abstract void create();
}