/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/12/8 16:04
 * 开发名称：Primary
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
public class Primary extends UserState {
    public Primary(User user) {
        this.user = user;
    }

    public Primary(UserState userState) {
        this.user = userState.getUser();
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
/**
 * 积分规则： x<50  ：入门级
 *      50<=x<100:熟练级
 *     100<=x<150:高手级
 *     150<=x:骨灰级
 * */
    @Override
    public void stateCheck() {
        if (this.user.getIntegral() >= 50) {
            this.user.setUserState(new Secondary(this.user));
        }
    }
}