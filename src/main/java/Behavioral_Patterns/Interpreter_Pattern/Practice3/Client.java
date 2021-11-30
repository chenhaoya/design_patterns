/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/19 16:52
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Interpreter_Pattern.Practice3;

import Behavioral_Patterns.Interpreter_Pattern.Practice3.Context.Calculator;

public class Client {
    public static void main(String[] args) {
        String statement = "3*4/2%4";
        Calculator calculator = new Calculator();
        calculator.build(statement);
        int result = calculator.commpute();
        System.out.println(statement+"="+result);
    }
}