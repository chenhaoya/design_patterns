/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/20 19:22
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Interpreter_Pattern.Practice4;

import Behavioral_Patterns.Interpreter_Pattern.Practice4.Context.Context;

public class Client {
    public static void main(String[] args) {
        String statements = "1 or 0 and 1 and 0 or 0";
        Context context = new Context();
        context.build(statements);
        System.out.println(context.commputed());
    }
}