/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/12/8 16:04
 * 开发名称：User
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.State_Pattern.Practice6.Context;

import Behavioral_Patterns.State_Pattern.Practice6.ConcreteState.Primary;
import Behavioral_Patterns.State_Pattern.Practice6.State.UserState;

/**
 * @author CH
 */
public class User {
    private String name_;
    private UserState userState;
    private int integral;

    public User(String name_) {
        this.name_ = name_;
        this.userState = new Primary(this);
        this.integral = 0;
    }

    public UserState getUserState() {
        return userState;
    }

    public int getIntegral() {
        return integral;
    }

    public void setUserState(UserState userState) {
        this.userState = userState;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public void play() {
        System.out.println("玩家" + this.name_ + "开了一把游戏");
        this.userState.play();
        System.out.println("当前积分：" + this.integral);
        System.out.println("当前玩家等级：" + this.userState.getClass().getSimpleName());
    }

    /**
     * 用户积分大于50到达熟练才能解锁
     */
    public void doubleScore() {
        if (this.integral >= 50) {
            System.out.println("玩家" + this.name_ + "使用了双倍积分");
            this.userState.doubleScore();
            this.userState.doubleValueOf=1;
            System.out.println("当前玩家等级：" + this.userState.getClass().getSimpleName());
        } else {
            System.out.println("玩家等级不足尚未解锁");
        }
    }

    public void changeCards() {
        if (this.integral >= 100) {
            System.out.println("玩家" + this.name_ + "换了一次牌");
            this.userState.changeCards();
            System.out.println("当前玩家等级：" + this.userState.getClass().getSimpleName());
        } else {
            System.out.println("玩家等级不足尚未解锁");
        }
    }

    public void peekCards() {
        if (this.integral >= 150) {
            System.out.println("玩家" + this.name_ + "偷看了对手的牌");
            this.userState.peekCards();
            System.out.println("当前玩家等级：" + this.userState.getClass().getSimpleName());
        } else {
            System.out.println("玩家等级不足尚未解锁");
        }
    }

    public void settlement() {
        this.userState.settlement();
    }
}