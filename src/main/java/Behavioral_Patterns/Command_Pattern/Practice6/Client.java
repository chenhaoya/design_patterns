/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/14 19:16
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Command_Pattern.Practice6;

import Behavioral_Patterns.Command_Pattern.Practice6.ConcreteCommand.CreateCommand;
import Behavioral_Patterns.Command_Pattern.Practice6.Invoker.Menu;
import Behavioral_Patterns.Command_Pattern.Practice6.Invoker.Menultem;
import Behavioral_Patterns.Command_Pattern.Practice6.Receiver.BoardScreen;

public class Client {
    public static void main(String[] args) {
        BoardScreen boardScreen = new BoardScreen();
        CreateCommand createCommand = new CreateCommand(boardScreen);
        Menu menu = new Menu();
        menu.addMenuItem(new Menultem("aaa",createCommand));
        menu.getMenuItem("aaa").clicked();
    }
}