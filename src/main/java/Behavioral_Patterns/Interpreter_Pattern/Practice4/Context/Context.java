/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/20 19:29
 * 开发名称：Context
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Interpreter_Pattern.Practice4.Context;

import Behavioral_Patterns.Interpreter_Pattern.Practice4.AbstractExpression.Node;
import Behavioral_Patterns.Interpreter_Pattern.Practice4.TerminalExpression.AndNode;
import Behavioral_Patterns.Interpreter_Pattern.Practice4.TerminalExpression.OrNode;
import Behavioral_Patterns.Interpreter_Pattern.Practice4.TerminalExpression.ValueNode;

import java.util.Stack;

public class Context {
    private Node node;
    public void build(String aaaa){
        Node leftNode=null,rightNode=null;
        Stack<Node> stack = new Stack<>();

        String[] words = aaaa.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].charAt(0)==48||words[i].charAt(0)==49){
                stack.push(new ValueNode(Integer.parseInt(words[i])));
            }else if (words[i].equalsIgnoreCase("and")){
                leftNode = stack.pop();
                rightNode = new ValueNode(Integer.parseInt(words[++i]));
                stack.push(new AndNode(leftNode, rightNode));
            } else if (words[i].equalsIgnoreCase("or")) {
                leftNode = stack.pop();
                rightNode = new ValueNode(Integer.parseInt(words[++i]));
                stack.push(new OrNode(leftNode, rightNode));
            }
        }
    this.node = stack.pop();
    }
    public int commputed(){
        return node.interpret();
    }
}