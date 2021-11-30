/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/12 15:07
 * 开发名称：AddCommand
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Command_Pattern.Practice4.ConcreteCommand;

import Behavioral_Patterns.Command_Pattern.Practice4.Command.AbstractCommand;
import Behavioral_Patterns.Command_Pattern.Practice4.CommandStack;
import Behavioral_Patterns.Command_Pattern.Practice4.Receiver.Adder;

import java.util.EmptyStackException;

public class AddCommand extends AbstractCommand {

    private CommandStack commandStack;

    public AddCommand() {
        this.commandStack = new CommandStack();
    }

    private Adder adder = new Adder();

    @Override
    public int execute(int value) {

        commandStack.pushStack(adder.getNum());

        //这里将执行前的状态保存进栈中
        return this.adder.add_(value);
    }

    @Override
    public int undo() {
        //读取撤销栈中的内容
        int command = commandStack.popStack();

        //将撤销前的内容保存到恢复栈中
        commandStack.pushStack2(adder.getNum());

        adder.setNum(command);
        return adder.getNum();
    }

    @Override
    public int redo() {
        try {
            Integer integer = commandStack.popStack2();
            adder.setNum(integer);
        }catch (EmptyStackException e){
            System.out.println("没有撤销操作，无需恢复");
        }
        return adder.getNum();
    }
}