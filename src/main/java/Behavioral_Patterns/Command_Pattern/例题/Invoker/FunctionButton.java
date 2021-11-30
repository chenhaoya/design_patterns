/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/12 14:24
 * 开发名称：FunctionButton
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Command_Pattern.例题.Invoker;

import Behavioral_Patterns.Command_Pattern.例题.Command.Command;

public class FunctionButton {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click(){
        System.out.print("点击功能键：");
        command.execute();
    }
}