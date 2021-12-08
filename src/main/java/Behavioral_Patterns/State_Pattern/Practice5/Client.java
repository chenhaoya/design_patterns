/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/12/7 15:55
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.State_Pattern.Practice5;

import Behavioral_Patterns.State_Pattern.Practice5.Context.User;

public class Client {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        User user = new User("aa");

        for (int i = 0; i < 50; i++) {
            user.message("aaa");
        }

        user.download();
    }
}