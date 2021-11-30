/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/25 16:38
 * 开发名称：Nation
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Mediator_Pattern.Practice4.Collegeue;

import Behavioral_Patterns.Mediator_Pattern.Practice4.Mediator.United_Nations;

public abstract class Nation {
    protected String name_;
    protected United_Nations united_nations;

    public Nation(String name_) {
        this.name_ = name_;
    }

    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public void setUnited_nations(United_Nations united_nations) {
        this.united_nations = united_nations;
    }

    public void changed(){
        this.united_nations.componentChanged(this);
    }

    public abstract void illustrate(String msg_);
}