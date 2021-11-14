/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/12 20:51
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：序列化知识待完善，：【从文件中读取多个序列化对象】
 */
package Structural_Pattern.Command_Pattern.Practice5;

import Structural_Pattern.Command_Pattern.Practice5.Command.Command;
import Structural_Pattern.Command_Pattern.Practice5.ConcreteCommand.Log_Command;
import Structural_Pattern.Command_Pattern.Practice5.Invoker.Invoker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args) throws IOException {
        Invoker invoker = new Invoker();
        Command command = new Log_Command();
        invoker.setCommand(command);
        invoker.request_("aaa","aaa");

        Invoker invoker2 = new Invoker();
        Command command2 = new Log_Command();
        invoker2.setCommand(command2);
        invoker2.request_("bbb","bbb");

        Invoker invoker3 = new Invoker();
        Command command3 = new Log_Command();
        invoker3.setCommand(command3);
        invoker3.request_("cccc","ccc");


        FileInputStream fileInputStream = new FileInputStream("G:\\宿州学院\\大三\\java设计模式\\project\\src\\main\\java\\Structural_Pattern\\Command_Pattern\\Practice5\\config.log");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        while (fileInputStream.available()>0){
            try {
                Command command1 = (Command) objectInputStream.readObject();
                command1.request(command1.getName_(),command1.getPassword_());
/*                for (Command a:command1) {
                    a.request(a.getName_(),a.getPassword_());
                }*/
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

    }
}