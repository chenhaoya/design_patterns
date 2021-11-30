/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/20 19:30
 * 开发名称：OrNode
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Interpreter_Pattern.Practice4.TerminalExpression;

import Behavioral_Patterns.Interpreter_Pattern.Practice4.AbstractExpression.Node;
import Behavioral_Patterns.Interpreter_Pattern.Practice4.NonterminalExpression.AbstractNode;

public class OrNode extends AbstractNode {
    @Override
    public int interpret() {
        if (super.left.interpret() + super.right.interpret() > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public OrNode(Node left, Node right) {
        super(left, right);
    }
}