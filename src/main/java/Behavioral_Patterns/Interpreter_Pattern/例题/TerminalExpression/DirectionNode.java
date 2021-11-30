/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/16 16:10
 * 开发名称：DirectionNode
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Interpreter_Pattern.例题.TerminalExpression;

import Behavioral_Patterns.Interpreter_Pattern.例题.AbstractExpression.AbstractNode;

public class DirectionNode extends AbstractNode {
    private String direction;

    public DirectionNode(String direction) {
        this.direction = direction;
    }

    @Override
    public String interpret() {
        if (direction.equalsIgnoreCase("up")){
            return "向上";
        }else if (direction.equalsIgnoreCase("down")){
            return "向下";
        }else if (direction.equalsIgnoreCase("left")){
            return "向左";
        }else if (direction.equalsIgnoreCase("right")){
            return "向右";
        }else {
            return "无效指令";
        }
    }
}