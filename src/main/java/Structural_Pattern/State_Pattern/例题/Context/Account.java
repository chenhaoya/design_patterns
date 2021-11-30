/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/28 16:39
 * 开发名称：Account
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.State_Pattern.例题.Context;

import Structural_Pattern.State_Pattern.例题.ConcreteState.NormalState;
import Structural_Pattern.State_Pattern.例题.State.AccountState;

public class Account {
    /**维持一个对抽象状态的对象的应用*/
    private AccountState state;
    /**开户名*/
    private String owner;
    /**账户余额*/
    private double balance = 0;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        /**设置初始状态*/
        this.state = new NormalState(this);
        System.out.println("---------------------------------------");
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void deposit(double amount) {
        System.out.println(this.owner+"存款"+amount);
        state.deposit(amount);
        System.out.println("现在余额为："+this.balance);
        System.out.println("现在账户状态为："+this.state.getClass().getSimpleName());
        System.out.println("-----------------------------------------------");
    }

    public void withdraw(double amount) {
        System.out.println(this.owner+"取款"+amount);
        state.withdraw(amount);
        System.out.println("现在余额为："+this.balance);
        System.out.println("现在账户状态为："+this.state.getClass().getSimpleName());
        System.out.println("-----------------------------------------------");
    }

    public void computeInterest() {
        /*掉用状态对象的computeInterest（）方法*/
        this.state.computeInterest();
    }
}
