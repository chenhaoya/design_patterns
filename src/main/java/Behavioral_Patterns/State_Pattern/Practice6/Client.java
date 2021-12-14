/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/12/8 15:38
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.State_Pattern.Practice6;

import Behavioral_Patterns.State_Pattern.Practice6.Context.User;

public class Client {
    public static void main(String[] args) {
        User user = new User("aaa");
        for (int i = 0; i < 200; i++) {
            user.play();
            user.doubleScore();
            user.settlement();
        }
        user.play();
        user.settlement();
    }
}