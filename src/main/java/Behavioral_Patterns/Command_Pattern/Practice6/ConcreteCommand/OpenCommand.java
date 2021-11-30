/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/16 15:11
 * 开发名称：OpenCommand
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Command_Pattern.Practice6.ConcreteCommand;

import Behavioral_Patterns.Command_Pattern.Practice6.Command.MenuAbstract;
import Behavioral_Patterns.Command_Pattern.Practice6.Receiver.BoardScreen;

public class OpenCommand extends MenuAbstract {
    private BoardScreen boardScreen;

    public OpenCommand(BoardScreen boardScreen) {
        this.boardScreen = boardScreen;
    }

    @Override
    public void execute() {
        boardScreen.openCommand();
    }
}