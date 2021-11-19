/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/19 16:20
 * 开发名称：ActionNode
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Interpreter_Pattern.例题.TerminalExpression;

import Structural_Pattern.Interpreter_Pattern.例题.AbstractExpression.AbstractNode;

public class ActionNode extends AbstractNode {
    private String action;

    public ActionNode(String action) {
        this.action = action;
    }

    @Override
    public String interpret() {
        if (action.equalsIgnoreCase("move")){
            return "移动";
        }else if (action.equalsIgnoreCase("run")){
            return "快速移动";
        }else {
            return "无效指令";
        }
    }
}