/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/14 16:01
 * 开发名称：Command
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Command_Pattern.Practice5.Command;

import Behavioral_Patterns.Command_Pattern.Practice5.Receiver.Log_;

import java.io.Serializable;

public abstract class Command implements Serializable {
    protected String name_;
    protected String password_;
    protected Log_ log_;

    public Command() {
        this.log_=new Log_();
    }

    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public String getPassword_() {
        return password_;
    }

    public void setPassword_(String password_) {
        this.password_ = password_;
    }

    public abstract void request(String name, String password);
}