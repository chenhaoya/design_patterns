/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/2 16:06
 * 开发名称：Logger
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Proxy_Pattern.Practice5.RealSubject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    public boolean validate_(String userID, String value2){
        SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time_ = SDF.format(new Date());
        System.out.println("时间："+time_);
        if (userID.equalsIgnoreCase("aaa")){
            System.out.println("状态："+userID+"登录成功");
            return true ;
        }else {
            System.out.println("状态："+userID+"登录失败");
            return false;
        }
    }
}