/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/12 14:36
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Command_Pattern.例题;

import Structural_Pattern.Command_Pattern.例题.ConcreteCommand.HelpCommand;
import Structural_Pattern.Command_Pattern.例题.Invoker.FunctionButton;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        FunctionButton functionButton;
        Class<?> aClass = Class.forName("Structural_Pattern.Command_Pattern.例题.Invoker.FunctionButton");
        functionButton = (FunctionButton) aClass.newInstance();

        functionButton.setCommand(new HelpCommand());

        functionButton.click();
    }
}