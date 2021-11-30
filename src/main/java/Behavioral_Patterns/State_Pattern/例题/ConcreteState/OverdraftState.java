/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/28 16:51
 * 开发名称：OverdraftState
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：透支状态
 */
package Behavioral_Patterns.State_Pattern.例题.ConcreteState;

import Behavioral_Patterns.State_Pattern.例题.State.AccountState;

public class OverdraftState extends AccountState {
    public OverdraftState(AccountState state) {
        this.acc = state.getAcc();
    }

    @Override
    public void deposit(double amount) {
        acc.setBalance(acc.getBalance()+amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        acc.setBalance(acc.getBalance()-amount);
        stateCheck();
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息");
    }

    @Override
    public void stateCheck() {
        if (acc.getBalance() > 0) {
            acc.setState(new NormalState(this));
        } else if (acc.getBalance() == -2000) {
            acc.setState(new RestrictedState(this));
        } else if (acc.getBalance() < -2000) {
            System.out.println("操作受限");
        }
    }
}