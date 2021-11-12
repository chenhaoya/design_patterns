/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/12 15:24
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Command_Pattern.Practice4;

import Structural_Pattern.Command_Pattern.Practice4.Command.AbstractCommand;
import Structural_Pattern.Command_Pattern.Practice4.ConcreteCommand.AddCommand;
import Structural_Pattern.Command_Pattern.Practice4.Invoker.CalculatorForm;

public class Client {
    public static void main(String[] args) {
        CalculatorForm calculatorForm = new CalculatorForm();
        AbstractCommand command = new AddCommand();
        calculatorForm.setAbstractCommand(command);



        calculatorForm.compute(10);
        calculatorForm.compute(20);
        calculatorForm.compute(30);
        calculatorForm.undo();
        calculatorForm.redo();
        calculatorForm.redo();

        calculatorForm.undo();

    }
}