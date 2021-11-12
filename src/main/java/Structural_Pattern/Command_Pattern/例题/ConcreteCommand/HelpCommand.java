/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/12 14:24
 * 开发名称：HelpCommand
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Command_Pattern.例题.ConcreteCommand;

import Structural_Pattern.Command_Pattern.例题.Command.Command;
import Structural_Pattern.Command_Pattern.例题.Receiver.DisplayHelpClass;

public class HelpCommand implements Command {
    private DisplayHelpClass displayHelpClass;

    public HelpCommand() {
        this.displayHelpClass = new DisplayHelpClass();
    }

    @Override
    public void execute() {
        displayHelpClass.display();
    }
}