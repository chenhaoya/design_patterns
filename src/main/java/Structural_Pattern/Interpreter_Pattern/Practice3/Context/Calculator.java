/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/20 16:21
 * 开发名称：Calculator
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Interpreter_Pattern.Practice3.Context;

import Structural_Pattern.Interpreter_Pattern.Practice3.AbstractExpression.AbstractNode;
import Structural_Pattern.Interpreter_Pattern.Practice3.TerminalExpression.DivNode;
import Structural_Pattern.Interpreter_Pattern.Practice3.TerminalExpression.ModNode;
import Structural_Pattern.Interpreter_Pattern.Practice3.TerminalExpression.MulNode;
import Structural_Pattern.Interpreter_Pattern.Practice3.TerminalExpression.Number_;

import java.util.Stack;

public class Calculator {
    private String Statement;
    private AbstractNode abstractNode;
    public void build(String statement){
        AbstractNode left=null,right=null;
        Stack<AbstractNode> stack = new Stack<>();
        String[] statements=statement.split("");
        for (int i = 0; i < statements.length; i++) {
            if (statements[i].equalsIgnoreCase("*")){
                left=stack.pop();
                int val = Integer.parseInt(statements[++i]);
                right=new Number_(val);
                stack.push(new MulNode(left, right));
            } else if (statements[i].equalsIgnoreCase("/")) {
                left=stack.pop();
                int val = Integer.parseInt(statements[++i]);
                right=new Number_(val);
                stack.push(new DivNode(left, right));
            } else if (statements[i].equalsIgnoreCase("%")) {
                left = stack.pop();
                int val = Integer.parseInt(statements[++i]);
                right = new Number_(val);
                stack.push(new ModNode(left, right));
            } else {
                stack.push(new Number_(Integer.parseInt(statements[i])));
            }
        }
        this.abstractNode=stack.pop();
    }
    public int commpute(){
        return abstractNode.interpret();
    }
}