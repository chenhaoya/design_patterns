/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/9 16:08
 * 开发名称：Approver
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Chain_of_Responsibility_Pattern.Practice4.Handler;

import Behavioral_Patterns.Chain_of_Responsibility_Pattern.Practice4.War_Request;

public abstract class Approver {
    protected Approver approver;
    protected String name_;

    public Approver(String name_) {
        this.name_ = name_;
    }

    public void setSuccessor(Approver successor){
        this.approver = successor;
    }
    public abstract void processResponse(War_Request request);
}