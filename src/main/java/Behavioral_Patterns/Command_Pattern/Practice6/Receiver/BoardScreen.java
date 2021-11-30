/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/16 15:13
 * 开发名称：BoardScreen
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Command_Pattern.Practice6.Receiver;

public class BoardScreen {
    public void openCommand(){
        System.out.println("打开命令");
    }
    public void createCommand(){
        System.out.println("新建命令");
    }
    public void editCommand(){
        System.out.println("编辑命令");
    }
}