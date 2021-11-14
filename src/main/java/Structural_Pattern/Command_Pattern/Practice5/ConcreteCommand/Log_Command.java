/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/14 16:13
 * 开发名称：Log_Command
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Command_Pattern.Practice5.ConcreteCommand;

import Structural_Pattern.Command_Pattern.Practice5.Command.Command;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Log_Command extends Command{
    public Log_Command() {
        super();
    }

    @Override
    public void request(String name,String password) {
        this.name_=name;
        this.password_=password;
        log_.logger(name,password);
    }
}