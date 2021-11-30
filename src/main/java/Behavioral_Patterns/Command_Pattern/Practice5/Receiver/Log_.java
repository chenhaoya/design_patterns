/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/14 16:01
 * 开发名称：Log_
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Command_Pattern.Practice5.Receiver;

import java.io.Serializable;

public class Log_ implements Serializable {
    public void logger(String name_,String password_){
        System.out.println("接收者接到登录请求;用户名："+name_);
    }
}