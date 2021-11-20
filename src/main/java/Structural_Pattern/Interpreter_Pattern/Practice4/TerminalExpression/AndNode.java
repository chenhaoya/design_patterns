/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/20 19:29
 * 开发名称：AndNode
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Interpreter_Pattern.Practice4.TerminalExpression;

import Structural_Pattern.Interpreter_Pattern.Practice4.AbstractExpression.Node;
import Structural_Pattern.Interpreter_Pattern.Practice4.NonterminalExpression.AbstractNode;

public class AndNode extends AbstractNode {
    public AndNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        if (super.left.interpret()==1 && super.right.interpret()==1) {
            return 1;
        }else{
            return 0;
        }
    }
}