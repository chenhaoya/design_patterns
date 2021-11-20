/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/20 19:29
 * 开发名称：AbstractNode
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Interpreter_Pattern.Practice4.NonterminalExpression;

import Structural_Pattern.Interpreter_Pattern.Practice4.AbstractExpression.Node;

public abstract class AbstractNode implements Node {
    protected Node left;
    protected Node right;

    public AbstractNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

}