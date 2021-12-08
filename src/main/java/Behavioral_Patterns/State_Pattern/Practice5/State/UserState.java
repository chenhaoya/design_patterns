/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/12/7 16:13
 * 开发名称：UserState
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.State_Pattern.Practice5.State;

import Behavioral_Patterns.State_Pattern.Practice5.Context.User;

public abstract class UserState {
    protected final int x=20;
    protected User user;
    public User getUser(){
        return this.user;
    }
    public abstract void replyMessage(String message);
    public abstract void message_(String message);
    public abstract void download();
    public abstract void stateCheck();
}