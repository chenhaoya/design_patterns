/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/12/7 16:13
 * 开发名称：User
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.State_Pattern.Practice5.Context;

import Behavioral_Patterns.State_Pattern.Practice5.ConcreteState.Greenhorn;
import Behavioral_Patterns.State_Pattern.Practice5.State.UserState;

public class User {
    private String name_;
    private int integral;
    private UserState userState;

    public User(String name_) {
        this.name_ = name_;
        this.integral = 0;
        this.userState = new Greenhorn(this);
    }

    public void reply_message(String message) {
        System.out.println("用户："+this.name_+"回复了留言");
        this.userState.replyMessage(message);
        System.out.println("当前账户积分："+this.getIntegral());
        System.out.println("当前账户状态："+this.getUserState().getClass().getSimpleName());
    }
    public void message(String message) {
        System.out.println("用户："+this.name_+"留言");
        this.userState.message_(message);
        System.out.println("当前账户积分："+this.getIntegral());
        System.out.println("当前账户状态："+this.getUserState().getClass().getSimpleName());
    }
    public void download() {
        System.out.println("用户："+this.name_+"请求下载文件");
        this.userState.download();
        System.out.println("当前账户积分："+this.getIntegral());
        System.out.println("当前账户状态："+this.getUserState().getClass().getSimpleName());
    }

    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public UserState getUserState() {
        return userState;
    }

    public void setUserState(UserState userState) {
        this.userState = userState;
    }
}