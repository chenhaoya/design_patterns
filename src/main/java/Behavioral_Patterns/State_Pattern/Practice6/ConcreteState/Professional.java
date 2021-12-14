/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/12/8 16:05
 * 开发名称：Professional
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.State_Pattern.Practice6.ConcreteState;

import Behavioral_Patterns.State_Pattern.Practice6.Context.User;
import Behavioral_Patterns.State_Pattern.Practice6.State.UserState;

/**
 * @author CH
 */
public class Professional extends UserState {
    public Professional(User user) {
        this.user = user;
    }

    @Override
    public void play() {

    }

    @Override
    public void doubleScore() {

    }

    @Override
    public void changeCards() {

    }

    @Override
    public void peekCards() {

    }

    @Override
    public void stateCheck() {
        if (this.user.getIntegral() < 100) {
            this.user.setUserState(new Secondary(this.user));
        } else if (this.user.getIntegral() >= 150) {
            this.user.setUserState(new Final(this.user));
        }
    }
}