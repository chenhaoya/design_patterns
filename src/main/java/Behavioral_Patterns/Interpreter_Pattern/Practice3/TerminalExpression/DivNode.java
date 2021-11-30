/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/20 16:16
 * 开发名称：DivNode
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Interpreter_Pattern.Practice3.TerminalExpression;

import Behavioral_Patterns.Interpreter_Pattern.Practice3.AbstractExpression.AbstractNode;
import Behavioral_Patterns.Interpreter_Pattern.Practice3.NonterminalExpression.SymbolNode;

public class DivNode extends SymbolNode {
    public DivNode(AbstractNode left, AbstractNode right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return super.left.interpret()/super.right.interpret();
    }
}