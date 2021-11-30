/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/19 17:19
 * 开发名称：Number
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Interpreter_Pattern.Practice3.TerminalExpression;

import Behavioral_Patterns.Interpreter_Pattern.Practice3.AbstractExpression.AbstractNode;

public class Number_ implements AbstractNode {
    private int number;

    public Number_(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return this.number;
    }
}