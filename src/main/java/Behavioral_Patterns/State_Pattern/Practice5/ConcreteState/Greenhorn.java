/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/12/7 16:41
 * 开发名称：Greenhorn
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.State_Pattern.Practice5.ConcreteState;

import Behavioral_Patterns.State_Pattern.Practice5.Context.User;
import Behavioral_Patterns.State_Pattern.Practice5.State.UserState;
/**新手*/

public class Greenhorn extends UserState {

    public Greenhorn(User user) {
        this.user = user;
    }

    public Greenhorn(UserState userState) {
        this.user = userState.getUser();
    }

    @Override
    public void replyMessage(String message) {
        this.user.setIntegral(this.user.getIntegral()+this.x);
        stateCheck();
    }

    @Override
    public void message_(String message) {
        this.user.setIntegral(this.user.getIntegral()+this.x);
        stateCheck();
    }

    @Override
    public void download() {
        if (this.user.getIntegral() - this.x >= 0) {
            this.user.setIntegral(this.user.getIntegral() - this.x);
        } else {
            System.out.println("积分不足");
        }
        stateCheck();
    }

    @Override
    public void stateCheck() {
        if (this.user.getIntegral() >= 100 && this.user.getIntegral() <1000) {
            this.user.setUserState(new Master(this));
        } else if (this.user.getIntegral() >= 1000) {
            this.user.setUserState(new Expert(this));
        }
    }
}