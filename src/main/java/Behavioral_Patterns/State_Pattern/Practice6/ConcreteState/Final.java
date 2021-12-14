/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/12/8 16:05
 * 开发名称：Final
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
public class Final extends UserState {
    public Final(User user) {
        this.user=user;
    }

    public Final(UserState us) {
        this.user = us.getUser();
    }

    @Override
    public void play() {
        System.out.println("");
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
        if (this.user.getIntegral() < 150) {
            this.user.setUserState(new Professional(this.user));
        }
    }
}