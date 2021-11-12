/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/12 15:05
 * 开发名称：AbstractCommand
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Command_Pattern.Practice4.Command;

public abstract class AbstractCommand {
    public abstract int execute(int value);
    public abstract int undo();
    public abstract int redo();
}