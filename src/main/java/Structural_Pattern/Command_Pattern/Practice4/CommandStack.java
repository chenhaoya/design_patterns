/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/12 18:02
 * 开发名称：CommandQueue
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Command_Pattern.Practice4;

import Structural_Pattern.Command_Pattern.Practice4.Command.AbstractCommand;

import java.util.Stack;

public class CommandStack {
    //保存接收者数据跟新前的 内容
    private Stack<Integer> stack = new Stack<>();
    //
    private Stack<Integer> stack2 = new Stack<>();
    public void pushStack(Integer a ){
        stack.push(a);
    }
    public Integer popStack(){
        if (stack.empty()){
            return -1;
        }
        return stack.pop();
    }

    public void pushStack2(Integer a){
        stack2.push(a);
    }
    public Integer popStack2(){
        if (stack2.empty()){

        }
        return stack2.pop();
    }
}