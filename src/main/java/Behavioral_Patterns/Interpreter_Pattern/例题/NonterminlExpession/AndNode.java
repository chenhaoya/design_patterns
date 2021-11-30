/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/16 16:04
 * 开发名称：AndNode
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Interpreter_Pattern.例题.NonterminlExpession;

import Behavioral_Patterns.Interpreter_Pattern.例题.AbstractExpression.AbstractNode;

public class AndNode extends AbstractNode {
    private AbstractNode leftChild;
    private AbstractNode rightChild;

    public AndNode(AbstractNode leftChild, AbstractNode rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public String interpret() {
        return leftChild.interpret()+"再"+rightChild.interpret();
    }

}