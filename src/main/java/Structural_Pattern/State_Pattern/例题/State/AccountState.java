/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/28 16:39
 * 开发名称：AccountState
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.State_Pattern.例题.State;

import Structural_Pattern.State_Pattern.例题.Context.Account;

public abstract class AccountState {
    protected Account acc;

    public Account getAcc(){
        return this.acc;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void computeInterest();
    public abstract void stateCheck();
}