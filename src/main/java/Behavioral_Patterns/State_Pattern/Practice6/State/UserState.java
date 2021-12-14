/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/12/8 16:04
 * 开发名称：UserState
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.State_Pattern.Practice6.State;

import Behavioral_Patterns.State_Pattern.Practice6.Context.User;

/**
 * @author CH
 */
public abstract class UserState {
    protected User user;

    public User getUser() {
        return user;
    }

    public int doubleValueOf = 0;

    /**一局游戏分数*/
    protected final int x=10;
    /**入门级*/
    public abstract void play();
    /**熟练级*/
    public abstract void doubleScore();
    /**高手级*/
    public abstract void changeCards();
    /**骨灰级*/
    public abstract void peekCards();
    /**等级判断*/
    public abstract void stateCheck();
    /**随机输赢*/
    public boolean isWins(){
        int x = (int)(0+Math.random()*(1-0+1));
        return x<1?false:true;
    }
    /**结算*/
    public void settlement(){
        System.out.println("---------开始结算---------");
        if (isWins()) {
            if (this.doubleValueOf == 1) {
                this.user.setIntegral(this.user.getIntegral() + 2 * x);
            } else {
                this.user.setIntegral(this.user.getIntegral() + x);
            }
            System.out.println("赢了");
        } else {
            if (this.doubleValueOf == 1) {
                this.user.setIntegral(this.user.getIntegral() - 2 * x);
            } else {
                this.user.setIntegral(this.user.getIntegral() - x);
            }
            System.out.println("输了");
        }
        this.stateCheck();
        this.doubleValueOf = 0;
        System.out.println("积分："+this.user.getIntegral());
        System.out.println("等级："+this.user.getUserState().getClass().getSimpleName());
        System.out.println("========================");
    }
}