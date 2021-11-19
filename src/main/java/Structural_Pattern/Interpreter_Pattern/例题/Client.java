/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/16 16:00
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Interpreter_Pattern.例题;


import com.sun.org.apache.bcel.internal.generic.InstructionHandle;

public class Client {
    public static void main(String[] args) {
        String instruction = "down run 10 and left move 20";
        InstructionHander hander = new InstructionHander();
        hander.handle(instruction);

        String outString;
        outString = hander.output();
        System.out.println(outString);

    }
}