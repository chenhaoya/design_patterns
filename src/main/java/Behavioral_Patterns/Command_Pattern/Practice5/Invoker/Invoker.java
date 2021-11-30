/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/14 16:01
 * 开发名称：Invoker
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Command_Pattern.Practice5.Invoker;

import Behavioral_Patterns.Command_Pattern.Practice5.Command.Command;

import java.io.*;
import java.util.ArrayList;

public class Invoker {
    private ArrayList<Command> commandArrayList = new ArrayList<Command>();

    private Command command;

    public void request_(String name,String password) {
        command.request(name,password);

        commandArrayList.add(command);

//        每次登录会记录到日志
        writeCommands(command);

/*        commandArrayList = readCommands();

        for (Command command: commandArrayList) {
            command.request(command.getName_(),command.getPassword_());
        }*/
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    void writeCommands(Command command){
        try {
            ObjectOutputStream fileOutputStream = new ObjectOutputStream(new FileOutputStream("G:\\宿州学院\\大三\\java设计模式\\project\\src\\main\\java\\Structural_Pattern\\Command_Pattern\\Practice5\\config.log",true));
            fileOutputStream.writeObject(command);
            fileOutputStream.close();
        }catch (Exception e){
            System.out.println("序列化错误");
        }
    }

    ArrayList readCommands(){
        try{
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("G:\\宿州学院\\大三\\java设计模式\\project\\src\\main\\java\\Structural_Pattern\\Command_Pattern\\Practice5\\config.log"));
            ArrayList list = (ArrayList) objectInputStream.readObject();
            objectInputStream.close();
            return list;
        }catch (Exception e){
            System.out.println("读取文件失败");
        }
        return null;
    }
}