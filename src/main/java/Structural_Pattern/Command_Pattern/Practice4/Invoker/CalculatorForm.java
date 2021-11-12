/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/12 15:08
 * 开发名称：CalculatorForm
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Command_Pattern.Practice4.Invoker;

import Structural_Pattern.Command_Pattern.Practice4.Command.AbstractCommand;

public class CalculatorForm {
    private AbstractCommand abstractCommand;

    public void setAbstractCommand(AbstractCommand abstractCommand) {
        this.abstractCommand = abstractCommand;
    }

    public void compute(int value){
        int i = abstractCommand.execute(value);
        System.out.println("执行运算，运算结果为："+ i);
    }

    public void undo(){
        int undo = abstractCommand.undo();
        System.out.println("执行撤销，运算结果为："+ undo);
    }

    public void redo(){
        int redo = abstractCommand.redo();
        System.out.println("执行恢复，运算结果为："+ redo);
    }
}