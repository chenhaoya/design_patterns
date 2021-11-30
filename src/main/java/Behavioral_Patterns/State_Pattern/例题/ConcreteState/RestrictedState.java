/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/28 16:52
 * 开发名称：RestrictedState
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：受限状态
 */
package Behavioral_Patterns.State_Pattern.例题.ConcreteState;

import Behavioral_Patterns.State_Pattern.例题.State.AccountState;

public class RestrictedState extends AccountState {
    public RestrictedState(AccountState acc) {
        this.acc = acc.getAcc();
    }

    @Override
    public void deposit(double amount) {
        acc.setBalance(acc.getBalance()+amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("账号受限，取款失败");
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息");
    }

    @Override
    public void stateCheck() {
        if (acc.getBalance() > 0) {
            acc.setState(new NormalState(this));
        } else if (acc.getBalance() > -2000) {
            acc.setState(new OverdraftState(this));
        }
    }
}