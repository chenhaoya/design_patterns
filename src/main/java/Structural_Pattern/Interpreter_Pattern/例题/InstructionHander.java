/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/17 18:30
 * 开发名称：InstructionHander
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Interpreter_Pattern.例题;

import Structural_Pattern.Interpreter_Pattern.例题.AbstractExpression.AbstractNode;
import Structural_Pattern.Interpreter_Pattern.例题.NonterminlExpession.AndNode;
import Structural_Pattern.Interpreter_Pattern.例题.NonterminlExpession.SentenceNode;
import Structural_Pattern.Interpreter_Pattern.例题.TerminalExpression.ActionNode;
import Structural_Pattern.Interpreter_Pattern.例题.TerminalExpression.DirectionNode;
import Structural_Pattern.Interpreter_Pattern.例题.TerminalExpression.DistanceNode;

import java.util.Stack;

public class InstructionHander {
    private AbstractNode node;

    public void handle(String instruction) {
        AbstractNode left = null, right = null;
        AbstractNode direction = null, action = null, distance = null;
        Stack<AbstractNode> stack = new Stack<>();
        String[] words = instruction.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase("and")) {
                left = (AbstractNode) stack.pop();
                String word1 = words[++i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                right = new SentenceNode(direction, action, distance);
                stack.push(new AndNode(left, right));
            }else{
                String word1 = words[i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                left = new SentenceNode(direction, action, distance);
                stack.push(left);
            }
        }
        this.node = (AbstractNode)stack.pop();
    }
    public String output(){
        String result = node.interpret();
        return result;
    }
}